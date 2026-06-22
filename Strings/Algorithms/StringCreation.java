package Algorithms;

public class StringCreation{
  public static void main(String[] args){
    //creating two String Objects
    String str1 = new String("Hello");
    String str2 = new String("Mr. ");
    
    //creating two Strings in the same String Pool
    String str3 = "Welcome to ";
    String str4 = "World of Java!";
    
    //printing all strings
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
  }
}
