import java.util.Scanner;
public class FindLargestElement{
  public static int largestElement(int[] arr){
    int max = arr[0];
    for(int num: arr){
      if(num > max)
        max = num;
    }
    return max;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array = ");
    int size = sc.nextInt();
    
    int[] arr = new int[size];
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter Element "+(i+1)+" = ");
      arr[i] = sc.nextInt();
    }
    System.out.println("Largest Element is: "+largestElement(arr));
    sc.close();
  }
}
