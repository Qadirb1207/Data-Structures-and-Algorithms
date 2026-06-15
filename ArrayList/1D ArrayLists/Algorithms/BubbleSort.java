package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;
public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            System.out.print("Enter a number: "+(i+1)+" = ");
            myList.add(sc.nextInt());
        }

        System.out.println("Before Sorting: ");
        System.out.println(myList);

        bubbleSort(myList);

        System.out.println("\nAfter Sorting");
        System.out.println(myList);
       
        sc.close();
    }

    public static void bubbleSort(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i++){
            boolean isSwapped = false;
            for(int j = 1; j <= list.size()-i-1; j++){
                if(list.get(j-1) > list.get(j)){
                    int temp = list.get(j);
                    list.set(j, list.get(j-1));
                    list.set(j-1, temp);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return;
            }
        }
    }
}