import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 5, 1};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        //sorting the array
        bubbleSort(arr);

        System.out.println("\nAfter Sorting: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            boolean isSwapped = false;
            for(int j = 1; j <= arr.length-i-1; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return;
            }
        }
    }
}