package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class FindMinimumElement {
    public static int min(ArrayList<ArrayList<Integer>> list){
        int min = list.get(0).get(0);
        for(int i = 0; i < list.size(); i++){
            for(int j = 1; j < list.get(i).size(); j++){
                if(list.get(i).get(j) < min){
                    min = list.get(i).get(j);
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 1; j < myList.get(i).size(); j++){
                myList.get(i).add(j%3+27);
            }
        }

        System.out.println("Minimum Element of the list is: "+min(myList));
    }
}
