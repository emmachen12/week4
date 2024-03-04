import java.util.*;


public class AccountSetup {
    public static void main (String[]args)  
    {
    int name;
    int pass;


    Scanner input = new Scanner(System.in);
    System.out.print("Enter your full name:");
    name = input.nextInt();
    System.out.print("Enter your password:");
    pass = input.nextInt();
    input.close();


    System.out.println("Your name is " + name);
    System.out.println("Your password " + pass);
    }
}
