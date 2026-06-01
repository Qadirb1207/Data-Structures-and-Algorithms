import java.util.Scanner;
public class FindSmallestElement{
  public static int findMinimumElement(int[] arr){
    int min = arr[0];
    for(int n: arr){
      if(n < min){
        min = n;
      }
    }
    return min;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array = ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];
    
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter element no "+(i+1)+" = ");
      arr[i] = sc.nextInt();
    }
    System.out.println("Minimum Element of the array is: "+findMinimumElement(arr));
    sc.close();
  }
}
