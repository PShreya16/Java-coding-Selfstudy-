//Write a Java program to print the sum (addition),
//multiply, subtract, divide and remainder of two numbers. 

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class exercise5 {
    public static void main(String []args){
    
    Scanner input= new Scanner(System.in);
    System.out.println("Enter first number:");
    int Num1=input.nextInt();
    System.out.println("Enter second number:");
    int Num2=input.nextInt();   
    int Sum=Num1+Num2;
    int Mul=Num1*Num2;
    int sub=Num1-Num2;
    int div=Num1/Num2;
    int rem=Num1%Num2;
    System.out.println(Num1+"+"+Num2+"="+Sum);
    System.out.println(Num1+"*"+Num2+"="+Mul);
    System.out.println(Num1+"-"+Num2+"="+sub);
    System.out.println(Num1+"/"+Num2+"="+div);
    System.out.println(Num1+"%"+Num2+"="+rem);
    }
}
