import java.util.* ;
public class TempConverter {
    public static void main (String[]args)
    {
    int fah;
    int cel;


    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Fahrenheit degree:");
    fah = input.nextInt();
    input.close();


    cel = (5 / 9 * (fah - 32));


    System.out.println("Your temperature in Celsius is " + cel);
    }

}
