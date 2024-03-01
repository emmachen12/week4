import java.util.*;

public class DivandMod{

    public static void main (String[] args)
    {
    int integer;
    int integer2;

    int mod;
    int mod2;
    int quot;
    int quot2;


    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    integer = input.nextInt();
    System.out.print("Enter a second integer:");
    integer2 = input.nextInt();
    input.close();

    mod = integer % integer2;
    mod2 = integer2 % integer;
    quot = integer / integer2;
    quot2 = integer2 / integer;

    System.out.println(integer + " / " + integer2 + " = " + quot);
    System.out.println(integer + " % " + integer2 + " = " + mod);
    System.out.println(                                        );
    System.out.println(integer2 + " / " + integer + " = " + quot2);
    System.out.println(integer2 + " % " + integer + " = " + mod2);
    }
}