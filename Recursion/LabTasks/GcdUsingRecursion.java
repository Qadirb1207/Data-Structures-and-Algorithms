package Recursion.LabTasks;

import java.util.Scanner;
public class GcdUsingRecursion {
    private static int gcd(int num1, int num2){
        if(num1 % num2 == 0){
            return num2;
        }
        int qtnt = num1%num2;
        return gcd(num2, qtnt);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter another Number = ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            int gcd = gcd(num1, num2);
            if(gcd > 1)
                System.out.println("GCD of "+num1+" and "+num2+" numbers is: "+gcd);
            else
                System.out.println("GCD is not possible");
        }else{
            int gcd = gcd(num2, num1);
            if(gcd > 1)
                System.out.println("GCD of "+num2+" and "+num1+" numbers is: "+gcd);
            else
                System.out.println("GCD is not possible");
        }
        sc.close();
    }
}
