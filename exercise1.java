import java.util.Scanner;


    public class exercise1{
      public static void main(String []args){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname= input.next();
        System.out.println("Enter your last name: ");
        String lname= input.next();
        System.out.println("Hello\n"+fname+" "+lname);
    }
}