package Strings;

public class RecursiveTextAnalyzer{
  public static void main(String[] args){
    TextAnalyzer text = new TextAnalyzer("4 Quick Brown Fox Jumps Over 7he L@zy Dog");
    System.out.println("Total characters = "+text.totalChars());
    text.setIterator();
    System.out.println("Total Letters = "+text.totalLetters());
    text.setIterator();
    System.out.println("Total digits = "+text.totalDigits());
    text.setIterator();
    System.out.println("Total lowercase letters = "+text.totalLowercaseLetters());
    text.setIterator();
    System.out.println("Total Uppercase letters = "+text.totalUppercaseLetters());
    text.setIterator();
    System.out.println("Total Words = "+text.totalWords());
    text.setIterator();
    System.out.println("Total Special Characters = "+text.totalSpecialCharacters());
    text.setIterator();
    System.out.println("Total Spaces = "+text.totalSpaces());
  }
}

class TextAnalyzer{
  private String text;
  private int index;
  
  TextAnalyzer(){
    this.text = null;
  }
  
  private boolean isSpecialChar(char ch){
    return !((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
  }
  
  TextAnalyzer(String text){
    if(text != null && !text.trim().isEmpty()){
      this.text = text;
    }else{
      System.out.println("Invalid Text");
      this.text = null;
    }
  }
  
  public void setText(String text){
    if(text != null && !text.trim().isEmpty()){
      this.text = text;
    }else{
      System.out.println("Invalid Text");
      this.text = null;
    }
  }
  
  public void setIterator(){
    this.index = 0;
  }
  
  public int totalChars(){
    if(index == text.length()){
      return 0;
    }
    int totalChars = 0;
    ++index;
    return ++totalChars+totalChars();
  }
  
  public int totalLetters(){    
    if(index == text.length()){
      return 0;
    }
    int totalLetters = 0;  
    if((text.charAt(index) >= 'a' && text.charAt(index) <= 'z' || (text.charAt(index) >= 'A' && text.charAt(index) <= 'Z'))){
      ++index;
      return ++totalLetters+totalLetters();
      
    }else{
      ++index;
      return totalLetters+totalLetters();
    }
    
  }
  
  public int totalDigits(){    
    if(index == text.length()){
      return 0;
    }
    int totalDigits = 0;
    if(text.charAt(index) >= '0' && text.charAt(index) <= '9'){
      ++index;
      return ++totalDigits+totalDigits();
    }else{
      ++index;
      return totalDigits+totalDigits();
      
    }
  }
  
  public int totalLowercaseLetters(){    
    if(index == text.length()){
      return 0;
    }
    int totalLowercase = 0;
    if(text.charAt(index) >= 'a' && text.charAt(index) <= 'z'){
      ++index;
      return ++totalLowercase+totalLowercaseLetters();
    }else{
      ++index;
      return totalLowercase+totalLowercaseLetters();
    }   
  }
  
  public int totalUppercaseLetters(){
    if(index == text.length()){
      return 0;
    }
    
    int totalUppercase = 0;
    if(text.charAt(index) >= 'A' && text.charAt(index) <= 'Z'){
      ++index;
      return ++totalUppercase+totalUppercaseLetters();
    }else{
      ++index;
      return totalUppercase+totalUppercaseLetters();
    }
  }
  
  public int totalWords(){
    int words = 0;
    if(index == text.length()){
      return words+1;
    }
    
    if(text.charAt(index) == ' '){
      ++index;
      return ++words + totalWords();
    }else{
      ++index;
      return words + totalWords();
    }
  }
  
  public int totalSpaces(){
    if(index == text.length()){
      return 0;
    }
    int spaces = 0;
    if(text.charAt(index) == ' '){
      ++index;
      return ++spaces+totalSpaces();
    }else{
      ++index;
      return spaces+totalSpaces();
    }
  }
  
  public int totalSpecialCharacters(){
    int specials = 0;
    if(index == text.length()){
      return specials;
    }
    
    if(isSpecialChar(text.charAt(index))){
      ++index;
      return ++specials+totalSpecialCharacters();
    }else{
      ++index;
      return specials+totalSpecialCharacters();
    }
  }
}
