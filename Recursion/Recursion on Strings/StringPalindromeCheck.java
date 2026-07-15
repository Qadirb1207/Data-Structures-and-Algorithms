package Strings;

public class StringPalindromeCheck{
  public static void main(String[] args){
    String str = "Madam";
    System.out.println(isPalindrome(str, new StringBuilder(), str.length()-1));
  }
  
  public static boolean isPalindrome(String str, StringBuilder reversed, int index){
    if(index < 0){
      return str.equalsIgnoreCase(reversed.toString());
    }
    reversed.append(str.charAt(index));
    
    return isPalindrome(str, reversed, --index);
  }
}
