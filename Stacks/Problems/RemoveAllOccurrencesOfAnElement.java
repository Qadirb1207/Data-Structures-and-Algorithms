package Problems;

class Stack{
  private int[] data;
  private int index;
  
  public Stack(){
    this(5);
  }
  
  public Stack(int size){
    this.data = new int[size];
    this.index = -1;
  }
  
  public void push(int num){
    if(index < data.length-1){
      data[++index] = num;
    }else{
      System.out.println("Stack is Full 🥲");
    }
  }
  
  public int pop(){
    if(!isEmpty()){
      return data[index--];
    }else{
      System.out.println("Stack is Empty 🥲!! Nothing to be popped!!");
      return Integer.MIN_VALUE;
    }
  }
  
  private boolean isEmpty(){
    return index == -1;
  }
  private void clear(){
    this.index = -1;
  }
  public void removeAll(int n){
    //counting occurrences of the number to be removed
    int count = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] == n){
        ++count;
      }
    }
    //array for storting all the elements other than n
    int[] arr = new int[data.length-count];
    int arrIndex = arr.length-1; //variable for taking the index of arr
    
    for(int i = data.length-1; i >= 0 ; i--){
      if(data[i] != n){//putting the element in the arr if it is not equal to n
        arr[arrIndex] = this.pop();
        --arrIndex;
      }else{
        //else just drop the number
        index -= 1;
      }
    }
    this.clear();//making the member variable index -1
    this.data = new int[arr.length];//assigning a new object to the data array of the size same as arr
    //pushing the elements of the array in the data
    for(int i = 0; i < arr.length; i++){
      push(arr[i]);
    }
  }
  
  public String toString(){
    StringBuilder stack = new StringBuilder();
    for(int i = 0; i < data.length; i++){
      stack.append(data[i]+"   ");
    }
    return stack.toString();
  }
}

public class RemoveAllOccurrencesOfAnElement{
  public static void main(String[] args){
    Stack stack = new Stack(6);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(20);
    stack.push(40);
    stack.push(20);
    
    System.out.println("Original Stack is: "+stack);
    stack.removeAll(20);
    System.out.println("After removing all 20s,  Stack is: "+stack);
    
  }
}
