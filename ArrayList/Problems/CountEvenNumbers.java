package Problems;

import java.util.ArrayList;
public class CountEvenNumbers {
    public static int countEvenNumbers(ArrayList<Integer> list){
        int evens = 0;
        if(list == null){
            System.out.println("problem: Empty List");
            return evens;
        }
        if(list.size() == 0){
            System.out.println("Problem: There is nothing in the list");
            return evens;
        }
        for(Integer num: list){
            if(num % 2 == 0){
                evens++;
            }
        }
        return evens;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(9);
        myList.add(23);
        myList.add(18);
        myList.add(20);
        myList.add(21);

        System.out.println("Total Even Numbers are: "+countEvenNumbers(myList));
    }
}
