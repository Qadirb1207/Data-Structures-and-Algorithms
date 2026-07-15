package Strings;

public class CharacterFrequency{
  public static void main(String[] args){
    String str = "Mississippi";
    System.out.println("Frequency of 's' in "+str+" is: "+frequencyOf(str, 0, 's'));
  }
  
  public static int frequencyOf(String str, int index, char ch){
    if(index == str.length()){
      return 0;
    }
    int freq = 0;
    if(str.charAt(index) == ch){
      return ++freq+frequencyOf(str, ++index, ch);
    }
    return freq+frequencyOf(str, ++index, ch);
  }
}
