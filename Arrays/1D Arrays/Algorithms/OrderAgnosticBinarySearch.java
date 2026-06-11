public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 21, 22, 24, 34, 43, 56, 59, 69, 74};
        int target = 74;
        int ans = binarySearch(arr, target);
        if(ans >= 0){
            System.out.println(target+" is present at the index "+ ans+" in the array");
        }else{
            System.out.println("Element is not present in the array");
        }
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
