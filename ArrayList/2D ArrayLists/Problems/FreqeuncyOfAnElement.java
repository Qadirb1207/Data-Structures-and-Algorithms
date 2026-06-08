package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class FreqeuncyOfAnElement {
    public static int frequency(ArrayList<ArrayList<Integer>> list, int num){
        int count = 0; 
        if(list == null){
            System.out.println("The list is null");
            return -1;
        }
        if(list.size() < 0 || list.get(0).size() < 0){
            System.out.println("The list is empty");
            return -1;
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                if(list.get(i).get(j) == num){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList <ArrayList <Integer>> myList = new ArrayList<>();

        int rows = 3;
        int cols = 4;
        for(int i = 0; i < rows; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < cols; j++){
                myList.get(i).add(j%3+15);
            }
        }

        System.out.println("The frequency of the number 15 in the arraylist is: "+frequency(myList, 15));

    }
}
