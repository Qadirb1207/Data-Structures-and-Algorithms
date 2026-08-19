package Problems;

public class MyArray{
  private int[] array;
  private int size;
  
  public MyArray(){
    this(5);
  }
  
  public MyArray(int size){
    if(size <= 0){
      System.out.println("Invalid size! Array Size cannot be negative or Zero!");
    }else{
      this.array = new int[size];
    }
  }
  
  //method for inserting a number in an array at a particular index.... Time Complexity:- linear time O(n)
  public void insert(int index, int value){
    if(index < 0){
      System.out.println("Invalid index! Array Index cannot be negative!");
      return;
    }else if(index == array.length){
      System.out.println(index+" is out of bounds of the array! The last index is "+(index -1));
      return;
    }else{
      if(size == 0){
        array[index] = value;
        ++size;
        System.out.println("The Element Inserted Successfully!!");
      }else{
        int[] newArr = new int[array.length+1];
        for(int i = 0; i < array.length; i++){
          newArr[i] = array[i];
        }
        
        for(int i = newArr.length-1; i > index; i--){
          newArr[i] = newArr[i-1];
        }
        newArr[index] = value;
        
        this.array = newArr;
        
        System.out.println("The Element Inserted Successfully!!");
        ++size;
      }
    }
  }
  
  //method for updating a value at a particular index... Time Complexity:- constant time O(1)
  public void update(int index, int value){
    if(index < 0){
      System.out.println("Invalid index! Index cannot be negative!!");
      return;
    }else if(size == 0){
      System.out.println("There is nothing at index "+index+" to be updated!!");
      return;
    }else {
      this.array[index] = value;
      System.out.println("Value updated successfully!");
    }
  }
  
  //method for deleting a number from an array
  public void delete(int index){
  //if the index is greater than the number elements present in the array then INDEXOUTOFBOUNDS 
    if(index >= this.size){
      System.out.println("Index out of bounds!!");
      return;
    }
    //if index is less than zero
    if(index < 0){ //
      System.out.println("Invalid index! Index cannot be negative!");
      return;
    }else if(size == 0){ // if there is no element in the array
      System.out.println("Nothing to be deleted in the array!");
      return;
    }else {//if the elements are present then simply shift the element to left and reduce the size by 1
       for(int i = index; i < size;i++){
         array[i] = array[i+1];
       }
      --size;
      System.out.println("Element at index "+index+" deleted successfully!");
    }
  }
  
  //method for displaying array
  public void display(){
    for(int i = 0; i < this.size; i++){
      System.out.print(array[i]+"\t");
    }
    System.out.println();
  }
  
  //method for inserting after a value
  public void insertAfter(int afterValue, int value){
    /*search the afterValue, and call insert() with the value and indexOfAfterValue+1*/
    int index = search(afterValue);
    insert(index+1, value);
  }
  
  //method for update by value
  public void updateByValue(int oldValue, int newValue){
    int index = search(oldValue);
    update(index, newValue);
  }
  
  //method for deleting by value
  public void deleteByValue(int value){
    int index = search(value);
    delete(index);
  }
  
  //method for searching a value
  public int search(int value){
    int index = -1;
    for(int i = 0; i < array.length; i++){
      if(array[i] == value){
        index = i;
        break;
      }
    }
    return index;
  }
}
