package Problems;

import java.util.Scanner;
public class LongestWordInASentence{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Sentence = ");
    String sentence = sc.nextLine();
    try{
      System.out.println("Longest word in your given sentence is: "+longest(sentence));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static String longest(String sentence) throws Exception{
    if(sentence == null){
      throw new Algorithms.NullStringException("NullStringException: Sentence is Null!!!!!!!!!!!!");
    }else if(sentence.trim().isEmpty()){
      throw new Algorithms.EmptyStringException("EmptyStringException: Sentence Is Empty!!!!!!!!!!!!!");
    }else{
      String[] wordArr = sentence.split(" ");
      if(wordArr.length == 1){
        return wordArr[0];
      }else{
        String longestWord = wordArr[0];
        for(int i = 0; i < wordArr.length; i++){
          if(wordArr[i].length() > longestWord.length()){
            longestWord = wordArr[i];
          }
        }
        return longestWord;
      }
    }
  }
}
