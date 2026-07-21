package Permutations;

import java.util.ArrayList;
public class ArrayListOfPermutations{
  public static void main(String[] args){
      String str = "456";
      System.out.println(permutations("", str));
  }
  
  public static ArrayList<String> permutations(String per, String str){
    if(str.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(per);
      return list;
    }
    char ch = str.charAt(0);
    ArrayList<String> allPermutations = new ArrayList<>();
    for(int i = 0; i < per.length()+1; i++){
      String first = per.substring(0, i);
      String second = per.substring(i, per.length());
      allPermutations.addAll(permutations(first+ch+second, str.substring(1)));
    }
    return allPermutations;
  }
}
