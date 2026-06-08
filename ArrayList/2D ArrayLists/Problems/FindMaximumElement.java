package TwoDArrayLists.Problems;


import java.util.ArrayList;
public class FindMaximumElement {
    public static int max(ArrayList<ArrayList<Integer>> list){
        int max = list.get(0).get(0);
        for(int i = 0; i < list.size(); i++){
            for(int j = 1; j < list.get(i).size(); j++){
                if(list.get(i).get(j) > max){
                    max = list.get(i).get(j);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            myList.add(new ArrayList<>());
        }

        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < 3; j++){
                    myList.get(i).add(j%5+10);
            }
        }

        System.out.println(myList);
        System.out.println("Maximum Element of all is: "+max(myList));
    }
}
