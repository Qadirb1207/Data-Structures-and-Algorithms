package Permutations;


public class PermutationsOfAString{
  public static void main(String[] args){
    String str = "123";
    permutations(str, "");
  }
  
  public static void permutations(String str, String per){
    if(str.isEmpty()){
      System.out.println(per);
      return ;
    }    
    char ch = str.charAt(0);
    for(int i = 0;  i <= per.length(); i++){
      String f = per.substring(0,i);
      String s = per.substring(i, per.length());
      permutations(str.substring(1),  f+ch+s);
    }
  }
}
