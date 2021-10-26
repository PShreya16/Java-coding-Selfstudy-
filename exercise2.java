//Write a Java program to print the sum of two numbers.
import java.util.Scanner;

public class exercise2{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Input first number: ");
        int Num1=input.nextInt();
        System.out.println("Input second number: ");
        int Num2=input.nextInt();
        int Sum= Num1 + Num2;

        System.out.println("Sum="+Sum );

    }
}