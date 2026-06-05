package Two_Dim_Array.Problems;

public class DifferenceOfMatrices {
    public static int[][] subtract(int[][] arr1, int[][] arr2){
        //order of first matrix
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;

        //order of second matrix
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;

        /*  checking if the rows and columns of both matrices are equal to each other 
            if yes then subtract the second matrix from the first else return a null object*/

        if((rows1 == rows2) && (cols1 == cols2)){
            int[][] sum = new int[rows1][cols2];
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[0].length; j++){
                    sum[i][j] = arr1[i][j] - arr2[i][j];
                }
            }
            return sum;
        }else{
        return null;
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                        {10, 40, 70},
                        {34, 21, 19},
                        {20, 80, 26}
                        };
        
        int[][] matrix2 = {
                        {19, 30, 72},
                        {9, 10, 17},
                        {1, 3, 7}
                        };
        
        int[][] difference = subtract(matrix1, matrix2);
        if(difference != null){
            for (int[] a : difference) {
                for(int n : a){
                    System.out.print(n + "  ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Subtraction is not possible!!!");
        }
    }
}
