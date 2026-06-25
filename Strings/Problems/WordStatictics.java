package Problems;

import java.util.Scanner;
public class WordStatictics{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any text = ");
    String text = sc.nextLine();
    
    try {
      wordStats(text);
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    
    sc.close();
  }
  
  public static void wordStats(String sentence) throws NullStringException, EmptyStringException{
    if(sentence == null){
      throw new NullStringException("Exception!!! String Is Null!!");
    }else if(sentence.trim().isEmpty()){
      throw new EmptyStringException("Exception!!! String Is Empty!!");
    }else {
      int words = 0, chars = 0;
      for(int i = 0; i < sentence.length(); i++){
        if(sentence.charAt(i) == ' '){
          words += 1;
        }
        else if(sentence.charAt(i) != ' ' ){
          chars += 1;
        }
      }
      System.out.println("WORD STATISTICS:\n");
      System.out.println("Words = "+words);
      System.out.println("Characters (without spaces) = "+chars);
      System.out.println("Average Word length: "+(double) chars/words);
      
    }
  }
}
