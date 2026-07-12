class AdditionCLI
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);
        System.out.println("Sum = " + sum);
    }
}