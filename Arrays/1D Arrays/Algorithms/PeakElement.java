public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 9, 12, 8, 4, 2};
        int peak = peak(arr);
        if(peak > -1){
            System.out.println("Peak element is at: "+peak);
        }else{
            System.out.println("There is no peak in the array!!");
        }
    }

    public static int peak(int[] arr){
        int start = 0, end = arr.length-1, peakIndex = -1;
        // boolean isAsc = arr[0] > arr[arr.length-1];
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid == 0 || mid == arr.length-1){
                peakIndex = mid;
                break;
            }
            if(mid < arr.length-1 && mid > 0){
                if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                    peakIndex = mid;
                    break;
                }else if(arr[mid] > arr[mid+1]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            
        }
        return peakIndex;
    }
}
 