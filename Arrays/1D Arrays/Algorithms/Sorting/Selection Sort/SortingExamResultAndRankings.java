package SelectionSort;

public class SortingExamResultAndRankings{
  public static void main(String[] args){
    int[] marks = {45, 62, 78, 80, 92};
    sortResultsAndAssignRanks(marks);
  }
  
  public static void sortResultsAndAssignRanks(int[] marks){
    for(int i = 0; i < marks.length; i++){
      int maxIndex = i;
      for(int j = i+1; j < marks.length; j++){
        if(marks[j] > marks[maxIndex]){
          maxIndex = j;
        }
      }
      int temp = marks[i];
      marks[i] = marks[maxIndex];
      marks[maxIndex] = temp;
    }
    
    for(int i = 0; i < marks.length; i++){
      System.out.println("Rank "+(i+1)+" --> "+marks[i]);
    }
  }
}
