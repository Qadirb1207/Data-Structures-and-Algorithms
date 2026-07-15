package Strings;

public class FirstOccurrenceOfACharacter{
  public static void main(String[] args){
    String str = "Programming";
    int ans = firstOccurrence(str, 0, 'm');
    if(ans > -1){
      System.out.println("First Occurrence of 'm' in "+str+" is at: "+ans);
    }else{
      System.out.println("Character is not present in the string!!");
    }
  }
  
  public static int firstOccurrence(String str, int index, char ch){
    if(index == str.length()){
      return -1;
    }
    
    if(str.charAt(index) == ch){
      return index;
    }
    return firstOccurrence(str, ++index, ch);
  }
}
