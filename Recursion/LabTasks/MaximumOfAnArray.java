package Recursion.LabTasks;

public class MaximumOfAnArray {
    private static int findMax(int[] arr, int index, int max){
        if(index == arr.length){
            return max;
        }
        if(arr[index] > max){
            max = arr[index];
        }
        return findMax(arr, index+1, max);
    }
    public static void main(String[] args){
        int[] arr = {12, 15, 10, 19, 21, 100};
        System.out.println("Maximum element of the array is: "+findMax(arr, 0, arr[0]));
    }
}
