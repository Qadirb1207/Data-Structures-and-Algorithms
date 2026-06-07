package Problems;

import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void removeDups(ArrayList<Integer> list){
        int size = list.size();//5
        for(int i = 0; i < size-1; i++){//0, 1,2,2,3 -----1,  1,2,3 ----2, 
            if(i+1 < list.size()){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i+1);
                }
            }else{
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers = ");
        int size = sc.nextInt();
        ArrayList<Integer> myList = new ArrayList<>(size);

        for(int i = 0; i < size; i++){
            System.out.print("Enter the number "+(i+1)+" = ");
            myList.add(sc.nextInt());
        }

        System.out.println("Before Removing Duplicates: ");
        System.out.println(myList+"\n\n");

        removeDups(myList);
        System.out.println("After Removing Duplicates: ");
        System.out.println(myList+"\n\n");

        sc.close();
        
    }
}
