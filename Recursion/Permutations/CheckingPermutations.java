package Permutations;

public class CheckingPermutations{
  public static void main(String[] args){
    String str = "listen";
    String permutationalStr = "silent";
    System.out.println(arePermutationsOfEachOther(str, permutationalStr, ""));
    //arePermutationsOfEachOther(str, "");
  }
  
  public static boolean arePermutationsOfEachOther(String orgStr, String perStr, String per){
    if(orgStr.isEmpty()){
      return per.equals(perStr);
    }
    char ch = orgStr.charAt(0);
    for(int i = 0; i < per.length()+1; i++){
      String first = per.substring(0,i);
      String second = per.substring(i, per.length());
      if(arePermutationsOfEachOther(orgStr.substring(1), perStr, first+ch+second)){
        return true;
      }
    }
    return false;
  }
}
