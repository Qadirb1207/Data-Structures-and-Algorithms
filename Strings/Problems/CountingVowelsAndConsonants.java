package problems;
public class CountingVowelsAndConsonants{
  public static void main(String[] args){
    String str =null;
    countVowelsAndConsonants(str);
  }
  
  public static void countVowelsAndConsonants(String str){
    if(str == null){
      System.out.println("String Is Null!!!");
      return;
    }else if(str.trim().length() == 0){
      System.out.println("String Is Empty!!!");
      return;
    }
    
    int vowels = 0, consonants = 0;
    for(int i = 0; i < str.length(); i++){
      if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <=122)){
        if(isVowel(str.charAt(i))){
          vowels++;
        }else{
          consonants++;
        }
      }
    }
    System.out.println("Total Vowels: "+vowels);
    System.out.println("Total Consonants: "+consonants);
  }
  
   private static boolean isVowel(char ch){
    return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');
  }
}
