import java.util.* ;
public class TempConverter {
    public static void main (String[]args)
    {
    int fah;
    double cel;
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a Fahrenheit degree:");
    fah = input.nextInt();
    input.close();


    cel = ((5.0 / 9.0) * (fah - 32.0));


    System.out.println("Your temperature in Celsius is " + cel);
    }

}
