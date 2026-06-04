public class PairSumInSortedArray {
    public static boolean doesPairSumExists(int[] arr, int target){
        int left = 0, right = arr.length-1;
        boolean doesExists = false;
        while(left != right){
            if((arr[left]+arr[right])==target){
                doesExists = true;
                break;
            }else if((arr[left]+arr[right]) > target){
                right--;
            }else{
                left++;
            }
            
        }
        return doesExists;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Does The pair exists? = "+doesPairSumExists(arr, 10));
    }
}
