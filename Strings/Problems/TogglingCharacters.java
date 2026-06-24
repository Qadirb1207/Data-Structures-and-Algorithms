package Problems;

public class TogglingCharacters{
  public static void main(String[] args){
    String  str = "heLLO wOrLd";
    
    try {
      System.out.println("Original String is: "+str);
      System.out.println("Toggled String is: "+toggleChars(str));
    }catch(Exception ex){
      System.out.println(ex.getMessage());
    }
  }
  
  public static String toggleChars(String str) throws Exception{
    if(str == null){
      throw new Problems.NullStringException("Exception!!!!! String Is Null!");
    }else if(str.trim().isEmpty()){
      throw new Problems.EmptyStringException("Exception!!! String Is Empty!");
    }else{
      String toggled = "";
      for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) >= 65 && str.charAt(i) <= 95 || str.charAt(i) == ' '){
          toggled += Character.toString(str.charAt(i)).toLowerCase();
        }else if(str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) == ' '){
          toggled += Character.toString(str.charAt(i)).toUpperCase();
        }else {
          continue;
        }
      }
      return toggled;
    }
  }
}
