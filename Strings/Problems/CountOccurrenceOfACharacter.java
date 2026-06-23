package Problems;

public class CountOccurrenceOfACharacter{
  public static void main(String[] args){
    String str = "Mississippi";
    char ch = 's';
    System.out.println("s occurred "+occurrences(str, ch) +" times in "+ str);
  }
  
  private static int occurrences(String str, char ch){
      int count = 0; 
      if(str == null){
        System.out.println("String Is Null!!!");
        return -1;
      }else if(str.trim().length() == 0){
        System.out.println("String Is Empty!!!");
        return -1;
      }
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == ch){
          count++;
        }
      }
      return count;
  }
}
