import java.util.*;
public class GradeAvg {
    public static void main (String[] args)
    {
    int grad1;
    int grad2;
    int grad3;
    int grad4;
    int grad5;
    int avg;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an grade 1:");
    grad1 = input.nextInt();
    System.out.print("Enter a grade 2:");
    grad2 = input.nextInt();
    System.out.print("Enter an grade 3:");
    grad3 = input.nextInt();
    System.out.print("Enter an grade 4:");
    grad4 = input.nextInt();
    System.out.print("Enter an grade 5:");
    grad5 = input.nextInt();
    input.close();

    avg = ((grad1 + grad2 + grad3 + grad4 + grad5) / 5);

    System.out.print("Your Average Is: " + avg);
    }
}
