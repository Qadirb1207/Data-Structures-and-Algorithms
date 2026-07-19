package Subsequences;

public class SubsequencesContainingSpecificCharacter{
  public static void main(String[] args){
    String str = "Hello";
    
    subsequences(str, "", "ll");
  }
  
  public static void subsequences(String str, String sub, String ch){
    if(str.isEmpty()){
      if(sub.contains(ch)){
        System.out.println(sub);
      }
      return;
    }
    char c = str.charAt(0);
    subsequences(str.substring(1), sub, ch);
    subsequences(str.substring(1), sub+c, ch);
  }
}
