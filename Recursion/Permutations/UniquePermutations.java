package Permutations;

import java.util.ArrayList;
public class UniquePermutations{
  public static void main(String[] args){
    //ArrayList<String> list = new ArrayList<>();
    //list.add("hello");
    //list.add("world");
    //System.out.println(isExists(list, "world", 0));
    System.out.println(uniquePermutations("", "aac",new ArrayList<>())); 
  }
  
  public static ArrayList<String> uniquePermutations(String per, String str, ArrayList<String> permutations){
    
    if(str.isEmpty()){
      if(permutations.size() >= 1 && !(doesExists(permutations, per, 0))){
        permutations.add(per);
      }else if(permutations.size() < 1){
        permutations.add(per);
      }
      return permutations;
    }
    
    char ch = str.charAt(0);
    for(int i = 0; i < per.length()+1; i++){
      String first = per.substring(0, i);
      String second = per.substring(i, per.length());
      uniquePermutations(first+ch+second, str.substring(1), permutations);
    }
    return permutations;
  }
  
  private static boolean doesExists(ArrayList<String> list, String per, int index){
    if(index == list.size()){
      return false;
    }
    
    if(per.equals(list.get(index))){
      return true;
    }else{
      return doesExists(list, per, index+1);
    }
  }
}
