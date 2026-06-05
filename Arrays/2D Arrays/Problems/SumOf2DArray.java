package Two_Dim_Array.Problems;
class TwoDimArray{
    public static int sumOf2DArray(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 4, 7},
                        {34, 2, 9},
                        {20, 8, 6}
                        };
        
        System.out.println("Sum of the array elements is : "+TwoDimArray.sumOf2DArray(arr));
    }
}
