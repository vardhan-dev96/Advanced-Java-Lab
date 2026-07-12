import java.util.Scanner;

class QuadraticEquation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, root1, root2;

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        d = (b * b) - (4 * a * c);

        if(d > 0)
        {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Discriminant = " + d);
            System.out.println("Roots are Real and Different");
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }
        else if(d == 0)
        {
            root1 = -b / (2 * a);

            System.out.println("Discriminant = " + d);
            System.out.println("Roots are Real and Equal");
            System.out.println("Root1 = Root2 = " + root1);
        }
        else
        {
            System.out.println("Discriminant = " + d);
            System.out.println("Roots are Complex (Imaginary)");
        }

        sc.close();
    }
}