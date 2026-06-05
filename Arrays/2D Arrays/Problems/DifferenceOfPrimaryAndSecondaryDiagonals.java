package Two_Dim_Array.Problems;

public class DifferenceOfPrimaryAndSecondaryDiagonals {
    public static int diagonalsDifference(int[][] arr){
        int primaryDiagonal = 0, secondaryDiagonal = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    primaryDiagonal += arr[i][j];
                }
                if(i+j == 2){
                    secondaryDiagonal += arr[i][j];
                    if(i == 1 & j == 1){
                        secondaryDiagonal -= arr[i][j];
                    }
                }
            }
        }
        return primaryDiagonal - secondaryDiagonal;   
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {10, 40, 70},
                        {34, 21, 19},
                        {20, 80, 26}
                        };

        System.out.println("Difference of Diagonal is: "+diagonalsDifference(arr));
    }
}
