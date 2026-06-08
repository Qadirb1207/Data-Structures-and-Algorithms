package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class RowSums {
    public static void printRowSums(ArrayList<ArrayList<Integer>> list){
        for(int i = 0; i < list.size(); i++){
            int sum = 0;
            for(int j = 0; j < list.get(i).size(); j++){
                sum += list.get(i).get(j);
            }
            System.out.println("Row "+(i+1)+" Sum: "+sum);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>(); 
        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 5; j++){
                myList.get(i).add(j);//this loop stores 0, 1, 2, 3, 4 in each row of the arraylist
            }
        }

        System.out.println("Row Sums are:\n");
        printRowSums(myList);
    }

}
