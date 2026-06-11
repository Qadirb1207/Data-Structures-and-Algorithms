public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 56, 67, 77, 88, 93};
        int target = 150;
        int ans = binarySearch(arr, target);
        if(ans > -1){
            System.out.println(target+" is present at the index "+(ans+1));
        }else{
            System.out.println("The element is not present in the array");
        }
    }
    //this method returns the index of the element in the array if found and -1 otherwise
    public static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
