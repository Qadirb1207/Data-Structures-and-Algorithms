package Strings;

public class PrintingInReverseOrder{
  public static void main(String[] args){
    String str = "Mathematics";
    System.out.println(str);
    System.out.println(reversePrint(str, str.length()-1));
    
  }
  
  public static String reversePrint(String str, int index){
    if(index < 0){
      return "";
    }
    return str.charAt(index)+reversePrint(str, --index);
  } 
    
}
