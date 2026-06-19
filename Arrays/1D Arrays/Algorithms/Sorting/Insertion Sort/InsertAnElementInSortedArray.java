package InsertionSort;

import java.util.Arrays;

public class InsertAnElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {12, 14, 15, 16, 17, 18, 19};

        int[] newArray = insertElement(arr, 5);

        System.out.println("Original Array:\n"+Arrays.toString(arr));
        System.out.println();
        System.out.println("After inserting an element:\n"+Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] arr, int target){
        int[] newArr = new int[arr.length+1]; // array for inserting elements
        int insertPos = -1; //position at which the target will be inserted
        if(arr[0] >= target){//edge case no 1
            insertPos = 0;
        }
        else if(arr[arr.length-1] <= target){ //edge case no 2
            insertPos = arr.length;
        }
        else{ // if both edge cases not meet check every index if target is greater than an element and less than the element next to it then insert position will be index of next element
            for(int i = 0; i < arr.length-1; i++){
            if(arr[i] <= target && arr[i+1] >= target){
                insertPos = i+1;
                break;
               }
           }
        }

        //copying elements from old array to new array
        for(int i = 0; i < newArr.length-1; i++){
            newArr[i] = arr[i];
        }
        //shifting elements in new array to make space for the element to be inserted
        for(int i = newArr.length-1; i > insertPos; i--){
            newArr[i] = newArr[i-1];
        }

        //inserting the element
        newArr[insertPos] = target;
        //returning the element
        return newArr;
    }
}
