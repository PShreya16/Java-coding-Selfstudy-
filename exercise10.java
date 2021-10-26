//Write a Java program to swap two variables.

import java.util.Scanner;
public class exercise10 {
    public static void main(String[]args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=i.nextInt();
        System.out.println("Enter b: ");
        int b=i.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Before Swapping: a, b= "+a+","+b);
        System.out.println("After Swapping: b, a= "+b+","+a);
    }
}
