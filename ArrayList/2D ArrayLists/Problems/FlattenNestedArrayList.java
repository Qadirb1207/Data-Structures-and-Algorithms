package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class FlattenNestedArrayList {
    public static ArrayList<Integer> flatten(ArrayList<ArrayList<Integer>> nestedList){
        ArrayList<Integer> flattenArrayList = new ArrayList<>();
        if(nestedList == null){
            System.out.println("Array list is null");
            return null;
        }

        if(nestedList.size() < 0 || nestedList.get(0).size() < 0){
            System.out.println("The ArrayList is empty!!");
            return null;
        }

        for(int i = 0; i < nestedList.size(); i++){
            for(int j = 0; j < nestedList.get(i).size(); j++){
                flattenArrayList.add(nestedList.get(i).get(j));
            }
        }
        return flattenArrayList;
    }
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> myNestedList = new ArrayList<>();

        int rows = 3, cols = 3;
        for(int i = 0; i < rows; i++){
            myNestedList.add(new ArrayList<>());
        }

        for(int i = 0; i < myNestedList.size(); i++){
            for(int j = 0; j < cols; j++){
                myNestedList.get(i).add(j+1);
            }
        }

        //before flattening
        System.out.println("Before flattening: ");
        for(ArrayList <Integer> list: myNestedList){
            System.out.println(list);
        }

        //after flattening

        ArrayList<Integer> myList = flatten(myNestedList);
        System.out.println("After flattening: ");
        System.out.println(myList);
    }
}
