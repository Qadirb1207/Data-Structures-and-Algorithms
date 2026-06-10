package Two_Dim_Array.Problems;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };

        int totalWealthOfEachPerson[] = rowSums(accounts);
        System.out.println("The richest is person no: "+(max(totalWealthOfEachPerson)+1));
    }

    public static int[] rowSums(int[][] accounts){
        int[] totalWealth = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < accounts[i].length; j++){
                if(accounts[i][j] > max){
                    max = accounts[i][j];
                }
            }
            totalWealth[i] = max;
        }
        return totalWealth;
    }

    public static int max(int[] arr){
        int maxIndex = 0;
        for(int i  = 0; i < arr.length; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
