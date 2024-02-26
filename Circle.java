public class Circle 
{
    public static void main (String[]args)
    {
        double radius = 4.28;
        double area = 0;
        double circumference = 0;
        area = Math.PI*radius*radius;
        circumference = 2*Math.PI*radius;
        System.out.println("The area of the cricle is " + area);
        System.out.println("The circumference of the cricle is " + circumference);
    }

}
