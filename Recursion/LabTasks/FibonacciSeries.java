package Recursion.LabTasks;
import java.util.Scanner;

public class FibonacciSeries {
    private static int fib(int num){
        if(num < 2){
            return num;
        }
        return fib(num-2)+fib(num-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series:");

        for(int i = 0; i <= num; i++){
            System.out.print(fib(i)+ "  ");
        }
        System.out.println();
        sc.close();
    }
}
