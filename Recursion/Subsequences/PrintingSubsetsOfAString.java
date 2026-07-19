package Subsequences;

public class PrintingSubsetsOfAString{
  public static void main(String[] args){
    String str = "ABC";
    subsets(str, "");
  }
  
  public static void subsets(String str, String subset){
    if(str.isEmpty()){
      System.out.print(subset+"\t");
      return;
    }
    
    char ch = str.charAt(0);
    subsets(str.substring(1), subset);
    subsets(str.substring(1), subset+ch);
  }
}
