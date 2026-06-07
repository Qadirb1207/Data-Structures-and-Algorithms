package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintingArrayList {
    public static void printArraylist(ArrayList<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of array list = ");
        int size = sc.nextInt();



        for(int i = 0; i < size; i++){
            System.out.print("Enter the element no: "+(i+1)+ " = ");
            list.add(sc.nextInt());
        }
        printArraylist(list);
        sc.close();
    }
}
