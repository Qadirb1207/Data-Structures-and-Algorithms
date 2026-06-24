package Problems;

import java.util.Scanner;

public class CompressConsecutiveCharacter{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter a word with consecutive characters = ");
    String str = sc.nextLine().toLowerCase();
    
    try {
      System.out.println("Compressed String is: "+compressChars(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String compressChars(String str) throws NullStringException, EmptyStringException{
    if(str == null) {
      throw new NullStringException("Exception!!! String is Null");
    }else if(str.trim().isEmpty()) {
      throw new EmptyStringException("Exception!!! String is Empty");
    }else {
      boolean[] isVisited = new boolean[str.length()];
      String compStr = "";
      for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        int freq = 1;
        for(int j = i+1; j < str.length(); j++){
          if(ch != ' ' && str.charAt(j) == ch){
            isVisited[j] = true;
            freq++;
          }
        }
        if(str.charAt(i) != ' ' && !isVisited[i]){
          compStr += Character.toString(str.charAt(i))+freq;
        }
      }
      return compStr;
    }
  }
}
