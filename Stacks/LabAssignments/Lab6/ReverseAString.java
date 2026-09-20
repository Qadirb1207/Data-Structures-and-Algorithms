package LabAssignments.Lab6;

import java.util.Scanner;
class Stack{
    private char[] data;
    private int index;

    public Stack(String str){
        this.data = new char[str.length()];
        this.index = -1;
        for(int i = 0; i < str.length(); i++){
            push(str.charAt(i));
        }
    }

    public void push(char ch){
        data[++index] = ch;
    }

    public char pop(){
        return data[index--];
    }

    public String reverse(){
        StringBuilder rev = new StringBuilder();
        System.out.println(this.index);
        for(int i = 0; i < data.length; i++){
            rev.append(pop());
        }
        return rev.toString();
    }
}
public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String str = sc.nextLine();

        Stack myStack = new Stack(str);

        System.out.println("Original String is: "+str);
        System.out.println("Reversed String is: "+myStack.reverse());

        sc.close();
    }
}
