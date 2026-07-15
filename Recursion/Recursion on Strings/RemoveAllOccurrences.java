package Strings;

public class RemoveAllOccurrences{
  public static void main(String[] args){
    String str = "Massachusetts";
    String strWithoutS = removeOccurrences(str, new StringBuilder(), 's');
    System.out.println("After removing all 's' from "+str+":\n"+strWithoutS);
  }
  
  public static String removeOccurrences(String str, StringBuilder str2, char ch){
    if(str.length() == 0){
      return str2.toString();
    }
    char currentCh = str.charAt(0);
    if(currentCh != ch){
      str2.append(currentCh);
      return removeOccurrences(str.substring(1), str2, ch);
    }
    return removeOccurrences(str.substring(1), str2, ch);
  }
}
