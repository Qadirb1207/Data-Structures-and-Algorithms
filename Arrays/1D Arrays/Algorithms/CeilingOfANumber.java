public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 23, 34, 45, 56, 67, 77, 88, 93};
        int number = 13;
        int ceil = ceil(arr, number);
        if(ceil > 0){
            System.out.println("The ceiling value of "+number +" is: "+ceil);
        }
    }

    public static int ceil(int[] arr, int num){
        int start = 0, end = arr.length-1;
        int ceil = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == num){
                ceil = arr[mid];
                break;
            }else if(arr[mid] > num){
                ceil = arr[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ceil;
    }
}
