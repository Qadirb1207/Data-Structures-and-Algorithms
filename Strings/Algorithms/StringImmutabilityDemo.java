package Algorithms;

public class StringImmutabilityDemo{
  public static void main(String[] args){
    String str1 = "This is the original String";
    
    System.out.println(str1);
    str1.concat("    Hello"); //you can modify the String str1 Because JAVA Strings are Immutable!!!!!!
    System.out.println(str1);
  }
}
