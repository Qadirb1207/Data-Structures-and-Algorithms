package Algorithms;

public class ReverseString{
  public static void main(String[] args){
    String string = null;
    System.out.println("Original string is: "+string);
    System.out.println("Reversed string is: "+reverse(string));
  }
  
  public static String reverse(String str){
    String reverse = "";
    if(str == null){
      return null;
    }else if(str.length() == 0){
      return reverse;
    }else{
      for(int i = str.length()-1; i >= 0; i--){
        reverse += str.charAt(i);
      }
      return reverse;
    }
  }
}
