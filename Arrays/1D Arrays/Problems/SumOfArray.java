import java.util.Scanner;
public class SumOfArray{
  public static int sumOfArray(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array = ");
    int size = sc.nextInt();
    
    int arr[] = new int[size];
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter the element no "+(i+1)+" = ");
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Sum of the array elements is: "+sumOfArray(arr));
    sc.close();
  }
}
