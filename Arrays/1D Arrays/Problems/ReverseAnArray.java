import java.util.Scanner;

 
public class ReverseAnArray{
  //method for reversing the array
  public static int[] reverseArray(int[] arr){
    int size = arr.length;
    for(int i = 0; i < size/2; i++){
      int temp = arr[i];
      arr[i] = arr[size - i - 1];
      arr[size - i - 1] = temp;
    }
    return arr;
  }
  
  //method for printing array
  public static void printArray(int[] arr){
    for(int n: arr){
      System.out.print(n + "\t");
    }
  }
  public static void main(String[] args){
    //taking the size as input from the user
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array = ");
    int size = sc.nextInt();
    
    //creating array and taking it input from the user
    int[] arr = new int[size];
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter Element no "+(i+1)+" = ");
      arr[i] = sc.nextInt();
    }
    
    //printing the original array
    System.out.println("\nOriginal Array:");
    printArray(arr);
    //reversing the array
    int[] reversedArr = reverseArray(arr);
    System.out.println("\nReversed Array: ");
    printArray(reversedArr);
    sc.close();
  }
}
