public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println("Output: "+searchInsertIndex(arr, target));
    }
    public static int searchInsertIndex(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                index = mid;
                break;
            }else if(arr[mid] > target){
                if(arr[mid]-1 == target){
                    index = mid;
                    break;
                }
                end = mid-1;
            }else{
                if(arr[mid]+1 == target){
                    index = mid+1;
                    break;
                }
                start = mid + 1;
            }
        }
        return index;
    }
}
