package LabAssignments.Lab6;
class Stack{
    private Node top;
    private String str;
    public Stack(String str){
        this.str = str;
        for(int i = 0; i < str.length(); ++i){
            push(str.charAt(i));
        }
    }

    public void push(char ch){
        Node node = new Node(ch);
        node.next = top;
        top = node;
    }

    public char pop(){
        if(top == null){
            System.out.println("Nothing to be popped! Stack is Empty");
            return ' ';
        }
        char ch = top.data;
        top = top.next;
        return ch;
    }

    public boolean isPalindrome(){
        if(top == null){
            return false;
        }
        StringBuilder rev = new StringBuilder();
        Node node = top;
        while(node != null){
            rev.append(pop());
            node = node.next;
        }
        
        if(this.str.equals(rev.toString())){
            return true;
        }
        return false;
    }
    private class Node{
        private char data;
        private Node next;

        public Node(char ch){
            data = ch;
        }
    }
}
public class StringPalindromeChecker {
    public static void main(String[] arg){
        Stack myStack = new Stack("madam");
        System.out.println("Is Hello a palindrome: "+myStack.isPalindrome());
    }
}
