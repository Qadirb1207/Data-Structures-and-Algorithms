package Subsequences;

public class PalindromicSubsequences{
  public static void main(String[] args){
    String str = "Java";
    palindromicSubseq(str, "");
  }
  
  public static void palindromicSubseq(String str, String sub){
    if(str.isEmpty()){
      if(isPalindrome(sub)){
        System.out.println(sub);
      }
      return;
    }
    char ch = str.charAt(0);
    palindromicSubseq(str.substring(1), sub);
    palindromicSubseq(str.substring(1), sub+ch);
  }
  
  private static String reverse(String str, StringBuilder rev, int index){
    if(index < 0){
      return rev.toString();
    }
    rev.append(str.charAt(index));
    return reverse(str, rev, index-1);
  }
  
  private static boolean isPalindrome(String str){
    String reverse = reverse(str, new StringBuilder(), str.length()-1);
    return str.equalsIgnoreCase(reverse);
  }
}
