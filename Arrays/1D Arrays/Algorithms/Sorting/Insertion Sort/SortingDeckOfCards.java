package InsertionSort;

import java.util.Arrays;

public class SortingDeckOfCards {
    public static void main(String[] args) {
        int[] deckOfCards = {7, 12, 8, 6, 9};
        System.out.println("Number of cards before sorting: \n"+Arrays.toString(deckOfCards)+"\n");

        sortDeck(deckOfCards);

        System.out.println("Number of cards after sorting: \n"+Arrays.toString(deckOfCards));
    }

    public static void sortDeck(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
