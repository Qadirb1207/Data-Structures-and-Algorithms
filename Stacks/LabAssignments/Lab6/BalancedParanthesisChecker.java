package LabAssignments.Lab6;

class Stack{
    private char[] data;
    private int index;

    public Stack(int capacity){
        this.data = new char[capacity];
        this.index = -1;        
    }

    public void push(char ch){
        data[++index] = ch;
    }

    public char pop(){
        return data[index--];
    }

    public boolean isEmpty() {
       return this.index == -1;
    }
}
public class BalancedParanthesisChecker {
    private static boolean isBalanced(String str){
        boolean isBalanced = false;
        Stack stack = new Stack(str.length());
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //1. If ch is an opening bracket push it on top of the stack
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            //2. If ch is a closing bracket and
            if(ch == ')' || ch == '}' || ch == ']'){
                //a. Stack is empty, the expression is not balanced just return false
                if(stack.isEmpty()){
                    return false;
                }
                //b. If top is not matching with ch then the expression is not balanced just return false
                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')
                ){
                    return false;
                }
            }

        }
        /*3. If the stack is still not empty then there is remaining some unbalanced brackets
         so return false, else the brackets are balanced*/
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String brackets = "[]()";
        System.out.println(isBalanced(brackets));
    }
}
