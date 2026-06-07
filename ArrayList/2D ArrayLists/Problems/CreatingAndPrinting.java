package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class CreatingAndPrinting {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>(4);//creating a 2D ArrayList
        for(int i = 0; i < 4; i++){     //initializing the ArrayList
            myList.add(new ArrayList<>());
        }

        System.out.println(myList.size());
        //adding elements in the 2D ArrayList
        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 3; j++){
                myList.get(i).add(j*2);
            }
        }


        //printing the elements of 2D ArrayList
        for(ArrayList<Integer> list: myList){
            for(Integer a: list){
                System.out.print(a+"  ");
            }
            System.out.println();
        }
    }
}
