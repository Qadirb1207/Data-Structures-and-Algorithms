package Problems;

import java.util.Scanner;

class Stack{
  private int[] binaryData;
  private int index;
  
  public Stack(int num){
    this.binaryData = new int[32];
    this.index = -1;
    
    int i = num;
    while(i != 0){
      int digit = i%2;
      push(digit);
      i /= 2;
    }
  }
  
  private void push(int digit){
      binaryData[++index] = digit;
      
  }
  
  private int pop(){
      return binaryData[index--];
  }
  
  public void toBinary(){
    for(int i = 0; i < binaryData.length; i++){
      if(index == -1) break;
      System.out.print(pop());
      
    }
  }
}

public class DecimalToBinary{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int num = sc.nextInt();
    Stack stack = new Stack(num);
    System.out.print("Binary of "+num+" is: ");
    stack.toBinary();
    System.out.println();
    sc.close();
    }
  }

