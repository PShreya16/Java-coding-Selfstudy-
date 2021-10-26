import java.util.Scanner;

import javax.swing.InputMap;

//Write a Java program that takes three numbers as input
//to calculate and print the average of the numbers.

public class exercise9 {
    public static void main(String[] args) {
        
    Scanner i=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1=i.nextInt();
    System.out.println("Enter second number: ");
    int num2=i.nextInt();
    System.out.println("Enter third number: ");
    int num3=i.nextInt();
    float average=(num1+num2+num3)/3;
    System.out.println("Average="+average);

        
    }
    
}

