package Problems;

import java.util.ArrayList;

public class ReversingArrayList {
    private static void reverseArrayList(ArrayList<Integer> list){
        int left = 0, right = list.size()-1;
        while(left < right){
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            if(i%2 != 0){
                myList.add(i);
            }
        }
        myList.add(11);

        System.out.println("Before Reversing: ");
        System.out.println(myList+"\n");

        reverseArrayList(myList);

        System.out.println("After Reversing: ");
        System.out.println(myList);
    }
}
