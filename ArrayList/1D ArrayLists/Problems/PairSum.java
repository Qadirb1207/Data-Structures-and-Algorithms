package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PairSum {
    public static boolean doesPairExists(ArrayList<Integer> list, int target){
        boolean exists = false;
        int start = 0, end = list.size()-1;
        for(int i = 0; i < list.size()-1; i++){
            if(list.get(start)+list.get(end) == target){
                exists = true;
                break;
            }else if(list.get(start)+list.get(end) > target){
                end--;
            }else{
                start++;
            }
        }
        return exists;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers=");
        int size = sc.nextInt();
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print("Enter the number "+(i+1)+" = ");
            myList.add(sc.nextInt());
        }

        System.out.println();
        System.out.println();
        System.out.print("Enter the targetted number = ");
        int target = sc.nextInt();

        if(doesPairExists(myList, target)){
            System.out.println("There are such numbers available in the numbers whose sum equals to "+target);
        }else{
            System.out.println("There are no numbers whose sum is equal to "+target);
        }

        sc.close();
    }
}
