package Problems;

import java.util.ArrayList;
public class SumOfArrayList {
    public static int sumOfArrayList(ArrayList<Integer> list){
        int sum = 0;
        for(Integer num: list){
            sum += num;
        }

        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(18);
        myList.add(12);
        myList.add(7);
        myList.add(1);
        System.out.println(sumOfArrayList(myList));
    }
}
