package QuickSort;

public class VisualizingQuickSort{
  public static void main(String[] args){
    int[] arr = {8, 7, 3, 4, 1, 9, 6};
    visualize(arr, 0, arr.length-1);
  }
  
  public static void visualize(int[] arr, int low, int high){
    if(low >= high){
      return;
    }
    
    int s = low, e = high;
    int mid = s+(e-s)/2;
    int pivot = arr[mid];
    while(s <= e){
      while(arr[s] < pivot){
        ++s;
      }
      
      while(arr[e] > pivot){
        --e;
      }
      
      if(s <= e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        --e;
        ++s;
      }
    }
    
    System.out.println("Pivot = "+pivot);
    System.out.println("Left subarray:");
    for(int i = low; i <= e; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
    System.out.println("Right subarray:");
    for(int i = s; i < high; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
    visualize(arr, low, e);
    visualize(arr, s, high);
  }
}
