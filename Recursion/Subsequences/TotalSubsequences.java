package Subsequences;

public class TotalSubsequences{
  public static void main(String[] args){
    String str = "try";
   System.out.println("Total subsequences = "+totalSubseq(str, "", 0));
  }
  
  public static int totalSubseq(String str, String sub, int count){
    if(str.isEmpty()){
      return 1;
    }
    char ch = str.charAt(0);
   int left = totalSubseq(str.substring(1), sub, count);
   int right = totalSubseq(str.substring(1), sub+ch, count);
    return left+right;
  }
}
