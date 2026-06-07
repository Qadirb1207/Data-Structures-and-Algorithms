package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class PrintingThroughIndices {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();//creating an arraylist

        //initializing the arraylist
        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 5; j++){
                if(j % 3 == 0){
                    myList.get(i).add(j);
                }
            }
        }

        //printing the arraylist
        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < myList.get(i).size(); j++){
                if(i == j || i%(j+1) == 0){
                    System.out.print(myList.get(i).get(j)+" ");
                }
            }
            System.out.println();
        }
    }
}