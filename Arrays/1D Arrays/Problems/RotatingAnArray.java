import java.util.Arrays;
public class RotatingAnArray {
    public static void rotateArray(int[] arr, int steps){
        for(int i = steps; i > 0; i--){
            for(int j = 0; j < arr.length-1; j++){
                int index = j;
                if(--index < 0){
                    index = arr.length -1;
                }else{
                    index = j-1;
                }
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        rotateArray(array, 2);
        System.out.println(Arrays.toString(array));
    }
}
