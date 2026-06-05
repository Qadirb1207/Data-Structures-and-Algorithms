package Two_Dim_Array.Problems;

public class CountEvenAndOdd {
    public static void coundEvenAndOdd(int[][] arr){
        int evenCount = 0, oddCount = 0; 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("Number of Even Numbers is: "+evenCount+" and number of Odd Numbers is: "+oddCount);
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {1, 4, 7},
                        {34, 2, 9},
                        {20, 8, 6}
                        };
        coundEvenAndOdd(arr);
    }
}
