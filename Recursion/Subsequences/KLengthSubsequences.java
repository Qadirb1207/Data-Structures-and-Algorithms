package Subsequences;

public class KLengthSubsequences{
  public static void main(String[] args){
    String str = "Hello";
    int k = 3;
    kLengthSubseq(str, "", k); 
  }
  
  public static void kLengthSubseq(String str, String sub, int k){
    if(str.isEmpty()){
      if(sub.length() == k){
        System.out.println(sub);
      }
      return;
    }
    char ch = str.charAt(0);
   kLengthSubseq(str.substring(1), sub, k);
   kLengthSubseq(str.substring(1), sub+ch, k);
  }
}
