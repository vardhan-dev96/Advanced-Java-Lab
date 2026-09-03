import java.util.Random;

public class RandomDemo
{
    public static void main(String[] args)
    {
        Random r = new Random();

        int num1 = r.nextInt(100);
        int num2 = r.nextInt(100);

        double num3 = r.nextDouble();

        boolean value = r.nextBoolean();

        System.out.println("Random Integer 1 = " + num1);
        System.out.println("Random Integer 2 = " + num2);
        System.out.println("Random Double = " + num3);
        System.out.println("Random Boolean = " + value);
    }
}
