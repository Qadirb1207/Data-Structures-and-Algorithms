public class CountPrimesNumbers {
    public static int countPrimes(int[] arr){
        int primes = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            boolean isPrime = true;
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primes++;
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        int[] arr = {12, 32, 23, 33, 31, 67};
        System.out.println("Number of Prime numbers in the array is: "+countPrimes(arr));
    }
}
