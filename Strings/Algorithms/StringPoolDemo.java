package Algorithms;

public class StringPoolDemo{
  public static void main(String[] args){
  //creating two strings in the same String Pool
  String str1 = "Hello";
  String str2 = " World";
  
  //printing both
  System.out.print(str1);
  System.out.println(str2);
  
  //creating two string objects
  String obj1 = new String("Hello");
  String obj2 = new String(" World");
  
  //printing both
  System.out.print(obj1);
  System.out.println(obj2);
  
  }
}
