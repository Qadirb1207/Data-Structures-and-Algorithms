package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class SearchingElementInArrayList {
    public static void searchKey(ArrayList<ArrayList<Integer>> list, int key){
        boolean found = false;
        int row = -1, col = -1;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                if(list.get(i).get(j) == key){
                    found = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if (found) {
                    break;
                }
        }
        if (found) {
            System.out.println("Element is present at row "+(row+1)+" and column "+(col+1));
        }else{
            System.out.println("Element is not present!!!");
        }
    }
    public static void main(String[] args) {
        ArrayList <ArrayList <Integer>> myList = new ArrayList<>();
        
        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 4; j++){
                myList.get(i).add(j*3%5+15);
            }
        }

        searchKey(myList, 15);
    }
}
