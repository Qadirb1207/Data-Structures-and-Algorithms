package Two_Dim_Array.Problems;

public class AdditionOfMatrices {
    public static int[][] add(int[][] arr1, int[][] arr2){
        int rows1 = arr1.length;
        int cols1 = arr1[1].length;
        int rows2 = arr2.length;
        int cols2 = arr2[1].length;

        if((rows1 == rows2) && (cols1 == cols2)){
            int[][] sum = new int[rows1][cols1];
            for(int i = 0; i < arr1.length; i++){
                for (int j = 0; j < arr1[i].length; j++) {
                    sum[i][j] = arr1[i][j] + arr1[i][j];
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
                        };

        int[][] sum = add(matrix1, matrix2);
        if(sum != null){
            for(int[] a: sum){
                for(int n: a){
                    System.out.print(n + "  ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Addition is not possible!!!");
        }
    }
}
