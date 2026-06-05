package Two_Dim_Array.Problems;

public class LargestElementOf2DArray {
    public static int largestElementOf2DArray(int[][] arr){
        int max = arr[0][0];
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int smallestElementOf2DArray(int[][] arr){
        int min = arr[0][0];
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {10, 40, 70},
                        {34, 21, 19},
                        {20, 80, 26}
                        };
        System.out.println("The Largest Element of the array is: "+largestElementOf2DArray(arr));
        System.out.println("The Smallest Element of the array is: "+smallestElementOf2DArray(arr));
    }
}
