package Strings;

public class LastOccurrenceOfACharacter{
  public static void main(String[] args){
    String str = "Programming";
    try {
      int ans = lastOccurrence(str, str.length()-1, 'm');
      if(ans > -1){
        System.out.println(" 'm' is at "+ans+" in the string");
      }else{
        System.out.println("Character is not present");
      }
    }catch(Exception e){ 
      System.out.println(e.getMessage());
    }
  }
  
  public static int lastOccurrence(String str, int index, char ch){
    if(index == str.length()){
      return -1;
    }
    
    if(str.charAt(index) == ch){
      return index;
    }
    return lastOccurrence(str, --index, ch);
  }
}
