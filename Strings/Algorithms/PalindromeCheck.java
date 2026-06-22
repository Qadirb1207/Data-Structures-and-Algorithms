package Algorithms;
public class PalindromeCheck{
  public static void main(String[] args){
    String str = null;
    System.out.println("Is "+str+" a palindrome? "+isPalindrome(str));
  }
  
  public static boolean isPalindrome(String str){
    String rev = "";
    if(str == null){
      return false;
    }else if(str.trim().length() == 0){
      return false;
    }else{
      for(int i = str.length()-1; i >= 0; i--){
        rev += str.charAt(i);
      }
      if(rev.equalsIgnoreCase(str)){
        return true;
      }
      return false;
    }
  }
}
