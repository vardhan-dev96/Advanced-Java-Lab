import java.util.Scanner;
import java.util.StringTokenizer;

class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers separated by spaces: ");
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;

        System.out.println("Integers:");
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            int number = Integer.parseInt(token);
            System.out.println(number);
            sum = sum + number;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
