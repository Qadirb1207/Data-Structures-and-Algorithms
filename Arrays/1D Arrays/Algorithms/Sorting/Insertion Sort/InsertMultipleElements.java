package InsertionSort;

import java.util.Arrays;

public class InsertMultipleElements {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int[] arr2 = {12, 8, 7};

        int[] newArray = insertMultipleValues(arr, arr2);
        System.out.println("Original Array: "+Arrays.toString(arr)+"\n");
        System.out.println("Elements to be inserted: "+Arrays.toString(arr2));
        System.out.println("Array after adding elements to the original array: "+Arrays.toString(newArray));
    }

    public static int[] insertMultipleValues(int[] orgArr, int[] insArr){
        //New array for keeping all elements together including the original ones as well as inserted
        int[] newArr = new int[orgArr.length+insArr.length];
        // array for index position of elements to be inserted
        int[] positionsArr = new int[insArr.length];

        //finding the positions of elements to be inserted
        for(int i = 0; i < insArr.length; i++){
            int curElmnt = insArr[i];
            if(curElmnt <= orgArr[0]){
                positionsArr[i] = 0;
            }else if(curElmnt >= orgArr[orgArr.length-1]){
                positionsArr[i] = orgArr.length;
            }else{
                for(int j = 0; j < orgArr.length-1; j++){
                    if(orgArr[j] <= curElmnt && orgArr[j+1] >= curElmnt){
                        positionsArr[i] = j+1;
                    }
                }
            }
        }

        //moving elements from original array to newArr
        for(int i = 0; i < orgArr.length; i++){
            newArr[i] = orgArr[i];
        }

        //shifting elements to right
        for(int i = 0; i < positionsArr.length; i++){
            int currentPosition = positionsArr[i];
            for(int j = newArr.length-1; j > currentPosition; j--){
                newArr[j] = newArr[j-1];
            }
            newArr[currentPosition] = insArr[i];
        }

        // //inserting elements in the new array
        // for(int i = 0; i < positionsArr.length; i++){
        //     newArr[positionsArr[i]] = insArr[i];
        // }

        return newArr;

    }
}
