package InsertionSort;

import java.util.Arrays;

public class SortingCitiesByLength {
    public static void main(String[] args) {
        String[] cities = {"Lahore", "Karachi", "Gilgit", "Quetta", "Islamabad"};
        System.out.println("Unsorted Cities Names:\n"+Arrays.toString(cities));
        System.out.println();
        System.out.println();

        sortStringsByLength(cities);
        System.out.println("Sorted Cities Names: \n"+Arrays.toString(cities));
    }

    public static void sortStringsByLength(String[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j].length() < arr[j-1].length()){
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
