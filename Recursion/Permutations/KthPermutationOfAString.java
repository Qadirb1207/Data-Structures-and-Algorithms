package Permutations;

import java.util.ArrayList;
public class KthPermutationOfAString{
  public static void main(String[] args){
    String str = "1234";
    int k = 24;
    ArrayList<String> list = allPermutations(str, "");
    //System.out.println(list);
    System.out.println(list.get(k-1));
  }
  
  public static ArrayList<String> allPermutations(String str, String per){
    if(str.isEmpty()){
      ArrayList<String> list = new ArrayList<>();
      list.add(per);
      return list;
    }
    ArrayList<String> permutations = new ArrayList<>();
    char ch = str.charAt(0);
    
    for(int i = 0; i <= per.length(); i++){
      String first = per.substring(0, i);
      String second = per.substring(i, per.length());
      permutations.addAll(allPermutations(str.substring(1), first+ch+second));
    }
    return permutations;
  }
}
