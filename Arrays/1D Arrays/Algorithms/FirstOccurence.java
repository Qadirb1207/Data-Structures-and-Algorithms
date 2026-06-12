
public class FirstOccurence{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 5, 6, 6, 6, 9};
        int firstOccurence = firstOccurence(arr, 9);
        if(firstOccurence > -1){
            System.out.println("Element "+9+" first occured at "+firstOccurence);
        }else{
            System.out.println("Element is not present in array");
        }
    }

    public static int firstOccurence(int[] arr, int num){
        
        int start = 0, end = arr.length-1;
        int firstOccurenceIndex = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == num){
               if(arr[mid-1] != num){
                firstOccurenceIndex = mid;
                break;
               }else{
                firstOccurenceIndex = mid-1;
               }
               end = mid - 1;
               
            }else if(arr[mid] > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return firstOccurenceIndex;
    }
}