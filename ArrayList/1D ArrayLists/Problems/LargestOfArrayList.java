package Problems;

import java.util.ArrayList;
public class LargestOfArrayList {
    public static int maxElement(ArrayList<Integer> l){
        int max = l.get(0);
        for(Integer num: l){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(18);
        myList.add(19);
        myList.add(10);
        myList.add(20);
        myList.add(20);

        System.out.println("Max element in the ArrayList is: "+maxElement(myList));
    }
}
