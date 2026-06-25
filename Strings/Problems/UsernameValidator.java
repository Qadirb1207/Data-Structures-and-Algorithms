package Problems;

import java.util.Scanner;

public class UsernameValidator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your username = ");
    String username = sc.nextLine();
    try {
      if(isValid(username)){
        System.out.println("Valid Username!!!");
      }else{
        System.out.println("Not Valid Username!!");
      }
    } catch(Exception ex){
      System.out.println(ex.getMessage());
    }
    sc.close();
  }
  
  public static boolean isValid(String username) throws NullStringException, EmptyStringException{
    if(username == null){
      throw new NullStringException("Exception!!! Username Is Null!!!");
    }else if (username.trim().isEmpty()){
      throw new EmptyStringException("Exception!! Username Is Empty!!!");
    }else {
       boolean validLen = username.length() >= 6;
        boolean containsNumber = false;
        boolean containsLetter = false;
        for(int i = 0; i < username.length(); i++){
          if(username.charAt(i) >= '1' && username.charAt(i) <= '9'){
           containsNumber = true;
            break;
          }
        }
      
        for(int i = 0; i < username.length(); i++){
          if(username.charAt(i) >= 'A' && username.charAt(i) <= 'Z' || username.charAt(i) >= 'a' && username.charAt(i) <= 'z'){
            containsLetter = true;
        }
      }
        return validLen && containsNumber && containsLetter;
  }  
  }
}
