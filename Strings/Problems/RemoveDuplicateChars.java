package Problems;

import java.util.Scanner;

public class RemoveDuplicateChars{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Word or Sentence = ");
    String str = sc.nextLine().toLowerCase();
    try {
      System.out.println("Original String is: "+str);
      System.out.println("After removing duplicates: "+removeDuplicates(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String removeDuplicates(String str) throws Exception{
    if(str == null) {
      throw new Problems.NullStringException("Exception!!!! String is Null!");
    }else if(str.trim().isEmpty()) {
      throw new Problems.EmptyStringException("Exception!!!! String is Empty");
    }else {
      String result = "";
      boolean isVisited[] = new boolean[str.length()];
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);  
        for(int j = i+1; j < str.length(); j++){
          if(str.charAt(j) == ch){
            isVisited[j] = true;
          }
        }
        if(!isVisited[i]){
          result += Character.toString(str.charAt(i));
        }
      }
      return result;
    }
  }
}
