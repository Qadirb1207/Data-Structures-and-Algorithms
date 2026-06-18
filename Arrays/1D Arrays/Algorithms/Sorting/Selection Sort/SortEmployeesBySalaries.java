package SelectionSort;

import java.util.Arrays;

public class SortEmployeesBySalaries{
  public static void main(String[] args){
      int[] salaries = {12000, 35000, 10000, 20000, 40000, 50000, 1000000, 9000};
      System.out.println("Before Sorting The salaries are: "+Arrays.toString(salaries)+"\n");
      sortBySalaries(salaries);
      System.out.println("After Sorting The salaries are: "+Arrays.toString(salaries)+"\n");
      
  }
  
  public static void sortBySalaries(int[] salaries){
    for(int i = 0; i < salaries.length; i++){
      int minIndex = i;
      //boolean minFound = false;
      for(int j = i+1; j < salaries.length; j++){
        if(salaries[j] < salaries[minIndex]){
          minIndex = j;
          //minFound = true;
        }
      }
      //if(minFound){
        int temp = salaries[i];
        salaries[i] = salaries[minIndex];
        salaries[minIndex] = temp;
     // }else{
       // break;
      //}
    }
  }
}
