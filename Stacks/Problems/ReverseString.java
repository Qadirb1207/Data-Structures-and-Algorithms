package Problems;

class Stack{
  private char[] data;
  private int index;
  
  public Stack(String str){
    this.data = new char[str.length()];
    this.index = -1;
    for(int i = 0; i < str.length(); i++){
      push(str.charAt(i));
    }
  }
  
  private void push(char ch){
     this.data[++index] = ch;
  }
  
  private char pop(){
    return data[index--];
  }
  
  public String reverse(){
    StringBuilder rev = new StringBuilder();
    for(int i = 0; i < data.length; i++){
      rev.append(pop());
    }
    return rev.toString();
  }
}

public class ReverseString{
  public static void main(String[] args){
    String str = " Panoti";
    Stack myStack = new Stack(str);
    System.out.println("Original String is: "+str);
    System.out.println("Reversed String is: "+myStack.reverse());
  }
}
