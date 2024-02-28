import java.util.*;

public class Digits_revision{
    public static void main (String[]args)
    {
    int num;
    int ones;
    int tens;
    int hunds;
    int length;
 

    num = 258;
    ones = num % 10;
    tens = ((num / 10) % 10);
    hunds = (num-(tens*10)-(ones))/100;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the length:");
    length = input.nextInt();
    input.close();
    System.out.println("The hundreds place digit is " + hunds);
    System.out.println("The tens place digit is " + tens);
    System.out.println("The ones place digit is " + ones);
    
    }
}
