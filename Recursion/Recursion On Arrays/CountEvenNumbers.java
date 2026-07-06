package ArrayProblems;

import java.util.Scanner;
public class CountEvenNumbers{
  private static int evensCount = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of arr = ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0; i < size; i++){
      System.out.print("Enter the element "+(i+1)+" = ");
      arr[i] = sc.nextInt();
    }
    System.out.println("\nTotal Even Numbers in the array are: "+countEvens(arr, 0));
    sc.close();
  }
  public static int countEvens(int[] arr, int index){
    //base condition
    if(index == arr.length){
      return 0;
    }
    
    if(arr[index] % 2 == 0){
    ++evensCount;
    }
    countEvens(arr, index+1);
    return  evensCount;
  }
}
