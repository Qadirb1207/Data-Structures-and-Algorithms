package InsertionSort;

import java.util.Arrays;

public class SortingScores {
    public static void main(String[] args) {
        int[] scores = {12, 50, 35, 9, 40};

        System.out.println("Scores Before Sorting: "+Arrays.toString(scores));

        insertionSort(scores);

        System.out.println("Scores After Sorting: "+Arrays.toString(scores));
    }

    public static void insertionSort(int[] scores){
        for(int i = 0; i < scores.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(scores[j] < scores[j-1]){
                    int temp = scores[j-1];
                    scores[j-1] = scores[j];
                    scores[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
