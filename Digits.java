public class Digits
{
    public static void main (String[]args)
    {
    int num;
    int ones;
    int tens;
    int hunds;

    num = 258;
    ones = num % 10;
    tens = ((num / 10) % 10);
    hunds = (num-(tens*10)-(ones))/100;

    System.out.println("The hundreds place digit is " + hunds);
    System.out.println("The tens place digit is " + tens);
    System.out.println("The ones place digit is " + ones);

    }
}
