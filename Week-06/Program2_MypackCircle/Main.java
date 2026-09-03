import mypack.Circle;

public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle();

        double radius = 5;

        double result = c.area(radius);

        System.out.println("Area of Circle = " + result);
    }
}
