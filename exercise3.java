//Write a Java program to divide two numbers and print quotient 
//and remainder on the screen.

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend=input.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor=input.nextInt();
        int Quotient=dividend/divisor;
        float Remainder=dividend%divisor;
        System.out.println("Quotient="+Quotient);
        System.out.println("Remainder="+Remainder);
    }
    
}
