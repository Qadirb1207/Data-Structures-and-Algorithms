package Problems;

import java.util.ArrayList;

public class MissingNumbers {
    public static ArrayList<Integer> findMissingNums(ArrayList<Integer> list){
        /*
            * First loop over the list from 0th index to lastIndex-1 
            * check if the two adjacent nums are not equal AND first+1 is not equal to the next
            * BOOM!!! You have the found the missing number which first+1 
            * 
            * IMPORTANT THING THE LIST SHOULD BE SORTED!!!!!!!!!
        */
            ArrayList<Integer> missingNos = new ArrayList<>();
            for(int i = 0; i < list.size()-1; i++){
                    if((list.get(i) != list.get(i+1)) && (list.get(i)+1) != list.get(i+1)){
                        missingNos.add(list.get(i)+1);
                    }
            }
            return missingNos;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                myList.add(i);
            }
        }

        System.out.println(findMissingNums(myList));
    }
}
