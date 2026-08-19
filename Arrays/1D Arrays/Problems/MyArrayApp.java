package Problems;

public class MyArrayApp{
  public static void main(String[] args){
   MyArray myArray = new MyArray(10);
    // Test insert
    myArray.insert(0, 10);
    myArray.insert(1, 20);
    myArray.insert(2, 30);
    //displaying the array
    myArray.display();
    // Insert after a value
    myArray.insertAfter(20, 25);
    
     //displaying the array
    myArray.display();
    
  // Update using value
    myArray.updateByValue(30, 35);
    
    //displaying the array
    myArray.display();
    
    
  // Delete using value
    myArray.deleteByValue(25);
    
    //displaying the array
    myArray.display();
    
  // Search for a value
    System.out.println("20 is present at index "+myArray.search(20));
  }
}
