//Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;
public class exercise8 {
    public static void main(String[]args){
        Scanner i=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r=i.nextInt();
        double Area=3.14*r;
        double Perimeter=2*3.14*r;
        System.out.println("Area of the circle: " +Area);
        System.out.println("Perimeter of the circle: " +Perimeter);

    }
    
}
