package Problems;

class Stack{
  private int[] arr;
  private int top;
  
  Stack(String exp){
    this.arr = new int[exp.length()];
    this.top = -1;
  }
  
  public void push(int val){
    if(isFull()){
      System.out.println("Stack is Full!!!");
      return;
    }
    arr[++top] = val;
  }
  
  public int pop(){
    if(isEmpty()){
      System.out.println("Stack is Empty!!!");
      return -1;
    }
    return arr[top--];
  }
  
  public boolean isFull(){
    return top == arr.length-1;
  }
  
  public boolean isEmpty(){
    return top == -1;
  }
  
   public int evaluate(String exp){
      for(int i = 0; i < exp.length(); ++i){
        if(exp.charAt(i) != '+' && exp.charAt(i) != '-' && exp.charAt(i) != '/' && exp.charAt(i) != '*'){
          int num = exp.charAt(i) - '0';
          push(num);
        }else if(exp.charAt(i) == '+'){
          int result = pop()+pop();
          push(result);         
        }else if(exp.charAt(i) == '-'){
          int a = pop();
          int b = pop();
         int result  = b-a;
         push(result);
        }else if(exp.charAt(i) == '*'){
          int a = pop();
          int b = pop();
          int c = a*b;
          push(c);
        }else{
          int a = pop();
          int b = pop();
          if(a == 0){
            System.out.println("Cannot divide by zero!!");
            return -100000;
          }
          push(b/a);
        }
      }
      return pop();
    }
}
public class PostfixExpressionEvaluation{
  public static void main(String[] args){
    Stack stack = new Stack("23+4*");
    System.out.println(stack.evaluate("03+4-"));
  }
}
