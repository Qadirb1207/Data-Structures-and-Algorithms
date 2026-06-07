package TwoDArrayLists.Problems;

import java.util.ArrayList;

public class SumOfAllElements {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> numbers = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            numbers.add(new ArrayList<>());
        }

        for(int i = 0; i < numbers.size(); i++){
            for (int j = 0; j < 4; j++) {
                numbers.get(i).add(j);
            }
        }

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.get(i).size(); j++){
                sum += numbers.get(i).get(j);
            }
        }

        System.out.println("Sum of all the elements of arraylist is: "+sum);
    }
}
