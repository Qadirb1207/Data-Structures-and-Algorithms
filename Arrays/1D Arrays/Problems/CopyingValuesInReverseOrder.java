package Problems;

import java.util.Arrays;
import java.util.Scanner;
public class CopyingValuesInReverseOrder{
  public static void copy(int[] src, int[] dest){
    if(src.length > dest.length){
      System.out.println("Source is greater than the destination! Cannot copy all values");
      return;
    }else if(src.length < dest.length){
      System.out.println("Source is less than the destination! destination will contain extra elements (i.e 0s");
      return;
    }else{
      int j = -1;
      for(int i = src.length-1; i >= 0; i--){
        dest[++j] = src[i];
      }
      System.out.println("Values copied successfully!!!");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array = ");
    int size = sc.nextInt();
    int[] arr1 = new int[size];
    for(int i = 0; i < arr1.length; i++){
      System.out.print("Enter the number "+(i+1)+" = ");
      arr1[i] = sc.nextInt();
    }
  
    int[] arr2 = new int[arr1.length];
    System.out.println("Before copying values: ");
    System.out.println("Original: "+Arrays.toString(arr1));
    System.out.println("Copied: "+Arrays.toString(arr2));
    System.out.println();
    
    copy(arr1, arr2);
    
    System.out.println("After copying values: ");
    System.out.println("Original: "+Arrays.toString(arr1));
    System.out.println("Copied: "+Arrays.toString(arr2));
  }
}
