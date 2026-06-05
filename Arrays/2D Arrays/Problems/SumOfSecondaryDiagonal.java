package Two_Dim_Array.Problems;

public class SumOfSecondaryDiagonal {
    public static int secondaryDiagonalSum(int[][] arr){
        int diagonalSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if((i+j) == 2){
                    diagonalSum += arr[i][j];
                }
            }
        }
        return diagonalSum;
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {10, 40, 70},
                        {34, 21, 19},
                        {20, 80, 26}
                        };
                    
        System.out.println("Sum of Secondary Diagonal Elements is: "+secondaryDiagonalSum(arr));
    }
}
