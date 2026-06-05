package Two_Dim_Array.Algorithms;

import java.util.Arrays;
import java.util.Scanner;
public class SearchingAnElement {
    public static boolean searchElement(int[][] arr, int key){
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] == key){
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 4, 7},
                        {34, 2, 9},
                        {20, 8, 6}
                        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key you want to find from the following arr:");
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("\nKey = ");
        int key = sc.nextInt();
        
        if(searchElement(arr, key)){
            System.out.println("Element is present in the array");
        }else{
            System.out.println("Element is not present in the array");
        }
        sc.close();
    }
}
