class OperatorsDemo
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;

        System.out.println("Initial value of a = " + a);

        System.out.println("Pre Increment : " + (++a));

        System.out.println("Post Increment : " + (a++));

        System.out.println("Value of a after Post Increment : " + a);

        System.out.println("Pre Decrement : " + (--a));

        System.out.println("Post Decrement : " + (a--));

        System.out.println("Value of a after Post Decrement : " + a);

        System.out.println();

        System.out.println("Bitwise AND = " + (a & b));

        System.out.println("Bitwise OR = " + (a | b));

        System.out.println("Bitwise XOR = " + (a ^ b));

        System.out.println("Bitwise Complement of a = " + (~a));

        System.out.println("Left Shift = " + (a << 2));

        System.out.println("Right Shift = " + (a >> 2));
    }
}