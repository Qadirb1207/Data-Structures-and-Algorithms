package InsertionSort;

import java.util.Arrays;

public class SortingWordsAlphabetically {
    public static void main(String[] args) {
        String[] words = {"Orange", "Apple", "Banana", "Mango"};

        System.out.println("Unsorted Words array: \n"+Arrays.toString(words));
        System.out.println();

        sortAlphabetically(words);
        System.out.println("Sorted Words Arrays: \n"+Arrays.toString(words));
    }

    public static void sortAlphabetically(String[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j].compareTo(arr[j-1]) < 0){
                    String temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
