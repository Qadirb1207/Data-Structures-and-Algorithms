public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 6, 6, 6, 9};
        int lastlyOccuredAt = lastOccurenceInArray(arr, 9);
        if(lastlyOccuredAt > -1){
            System.out.println(9+" lastly occured at "+lastlyOccuredAt);
        }else{
            System.out.println("Element is not present");
        }
    }

    public static int lastOccurenceInArray(int[] arr, int num){
        int start = 0, end = arr.length - 1;
        int lastIndex = -1;
        while (start <= end) {
            int mid = start +(end-start)/2;

            if(arr[mid] == num){
                if(mid < arr.length - 1){
                    if(arr[mid+1] != num){
                        lastIndex = mid;
                    }else{
                        lastIndex = mid+1;
                    }
                }else{
                    lastIndex = mid;
                }
                start = mid+1;
            }else if(arr[mid] > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return lastIndex;
    }
}
