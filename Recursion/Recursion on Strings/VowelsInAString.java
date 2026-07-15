package Strings;

public class VowelsInAString{
  public static void main(String[] args){
    String str = "I am learning DSA";
    System.out.println("There are "+countVowels(str, 0)+" vowels in the string");
  }
  
  public static int countVowels(String str, int index){
    if(index == str.length()){
      return 0;
    }
    int vowels = 0;
    if(isVowel(str.charAt(index))){
      return ++vowels+countVowels(str, index+1);
    }
    return vowels+countVowels(str, index+1);
     
  }
  
  public static boolean isVowel(char ch){
  return ch == 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'; 
  }
}
