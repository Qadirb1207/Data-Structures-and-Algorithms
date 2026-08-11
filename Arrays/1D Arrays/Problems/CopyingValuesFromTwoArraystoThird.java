package Problems;

import java.util.Scanner;
import java.util.Arrays;
public class CopyingValuesFromTwoArraystoThird{
  public static void copy(int[] src1, int[] src2, int[] dest){
    int k = -1;
    for(int i = 0; i < src1.length; i++){
      dest[++k] = src1[i];
    }
    
    for(int j = 0; j < src2.length; j++){
      dest[++k] = src2[j];
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the first array = ");
    int size1 = sc.nextInt();
    int[] arr1 = new int[size1];
    for(int i = 0; i < arr1.length; i++){
      System.out.print("Enter the number "+(i+1)+" = ");
      arr1[i] = sc.nextInt();
    }
    
    System.out.print("Enter the size of the second array = ");
    int size2 = sc.nextInt();
    int[] arr2 = new int[size2];
    for(int i = 0; i < arr2.length; i++){
      System.out.print("Enter the number "+(i+1)+" = ");
      arr2[i] = sc.nextInt();
    }
    
    System.out.println("First:" +Arrays.toString(arr1));
    System.out.println("Second:" +Arrays.toString(arr2));
    int[] third = new int[arr1.length+arr2.length];
    copy(arr1, arr2, third);
    
    System.out.println("\nAfter combining: \n");
    
    System.out.println("First:" +Arrays.toString(arr1));
    System.out.println("Second:" +Arrays.toString(arr2));
    System.out.println("Both combined in third:" +Arrays.toString(third));
    
    
    
  }
}
