package Recursion.LabTasks;
import java.util.Scanner;
public class PalindromeString {
    private static boolean isPalindrome(String s, int left, int right){
        boolean isPalindrome = true;
        if(left == right){
            return isPalindrome;
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            isPalindrome = false;
            return isPalindrome;
        }
        return isPalindrome(s, left+1, right-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String = ");
        String str = sc.nextLine();
        boolean ans = isPalindrome(str, 0, str.length()-1);
        if(ans)
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+" is not a palindrome.");

        sc.close();
    }
}
