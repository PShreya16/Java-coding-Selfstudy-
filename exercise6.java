//Write a Java program that takes a number as input and 
//prints its multiplication table upto 10.

import java.util.Scanner;
public class exercise6 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int i;
        for (i=1; i<=10; i++){
            System.out.println(+num+ "x" +i+ "=" +(num*i));
        }




    }
    
}
