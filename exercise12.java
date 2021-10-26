//Write a Java program to compare two numbers.

import java.util.Scanner;
public class exercise12 {
    public static void main(String[]args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=i.nextInt();
        System.out.println("Enter second number: ");
        int b=i.nextInt();
        if (a==b){
            System.out.println(a+ " is equal to " +b);
        }
        else if(a>b){
            System.out.println(a+ " is greater than " +b);
        }
        else 
            System.out.println(b+ " is greater than " +a);
        
    }
    
}
