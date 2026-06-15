package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSwapsInBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            System.out.print("Enter a number: "+(i+1)+" = ");
            myList.add(sc.nextInt());
        }

        System.out.println("Before Sorting: ");
        System.out.println(myList);

        System.out.println("Total Swaps in sorting the above list are: "+totalSwaps(myList));

               
        sc.close();
    }

    public static int totalSwaps(ArrayList<Integer> list){
        int swaps = 0;
        for(int i = 0; i < list.size()-1; i++){
            boolean isSwapped = false;
            for(int j = 1; j <= list.size()-i-1; j++){
                if(list.get(j-1) > list.get(j)){
                    swaps++;
                   isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return swaps;
    }
}
