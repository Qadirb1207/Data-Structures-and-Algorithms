

public class FindingNumbers {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }

    public static int countDigits(int num){
        int digits = 0;

        if(num >= 0 && num <= 9){
            return 1;
        }

        int i = num;
        while(i != 0){
            digits++;
            i /= 10;
        }
        return digits;
    }

    public static int findNumbers(int[] arr){
        int numbers = 0;
        for(int n: arr){
            if(countDigits(n) % 2 == 0){
                numbers++;
            }
        }
        return numbers;
    }
}
