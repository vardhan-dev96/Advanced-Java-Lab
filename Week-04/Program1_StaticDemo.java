class StaticDemo
{
    static String college = "MVGR College";

    int rollNo;
    String name;

    StaticDemo(int r, String n)
    {
        rollNo = r;
        name = n;
    }

    static
    {
        System.out.println("Static Block Executed");
    }

    static void displayCollege()
    {
        System.out.println("College Name: " + college);
    }

    void displayStudent()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String args[])
    {
        StaticDemo s1 = new StaticDemo(101, "Vardhan");
        StaticDemo s2 = new StaticDemo(102, "Rahul");

        displayCollege();

        s1.displayStudent();
        System.out.println();

        s2.displayStudent();
    }
}
