public class PalindromeArray {
    public static boolean isPalindrome(int[] arr){
        int left = 0, right = arr.length-1;
        boolean isPalindrome = false;
        for(int i = 0; i < arr.length/2; i++){
            if(arr[left++] == arr[right--]){
                isPalindrome = true;
            }else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 9};
        System.out.println("Is Palindrome?: "+isPalindrome(arr));
    }
}
