import java.util.Scanner;
public class LinearSearch{
  public static int linearSearch(int[] arr, int key){
    int index = -1;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == key){
        index = i;
        break;
      }
    }
    return index;
  }
  
  public static void main(String[] args){
    int[] arr = {12, 23, 34, 11, 10, 19};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the to search from the array:\n{12, 23, 34, 11, 10, 19}\nKey = ");
    int key = sc.nextInt();
    if(linearSearch(arr, key) != -1){
      System.out.println(key+" is present in the array at the position "+(linearSearch(arr, key)+1));
    }else{
      System.out.println(key+" is not present in the array");
    }
    sc.close();
  }
}
