public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {12, 13, 23, 34, 45, 56, 67, 77, 88, 93};
        int number = 10;
        int floor = floor(arr, number);
        if(floor > 0){
            System.out.println("The floor value of "+number +" is: "+floor);
        }else{
            System.out.println("There is no floor of "+number);
        }
    }

    public static int floor(int[] arr, int num){
        int start = 0, end = arr.length - 1, floor = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == num){
                floor = arr[mid];
            }else if(arr[mid] < num){
                floor = arr[mid];
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return floor;
    }
}
