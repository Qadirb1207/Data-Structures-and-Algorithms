package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class CountingElements {
    public static void main(String[] args) {
        ArrayList <ArrayList< Integer>> myList = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        //adding elements into it
        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 3; j++){
                myList.get(i).add(j);
            }
        }

        int count = 0;
        for (int i = 0; i < myList.size(); i++) {
            for(int j = 0; j < myList.get(i).size(); j++){
                count++;
            }
        }

        System.out.println("Total Number in the array list are: "+count);
    }
}
