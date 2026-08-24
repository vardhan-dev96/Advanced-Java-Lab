class Student
{
    int rollNo;
    String name;
    final String college = "MVGR";

    Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display()
    {
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("College: " + college);
    }

    final void showMessage()
    {
        System.out.println("This is a final method");
    }
}

public class ThisFinalDemo
{
    public static void main(String[] args)
    {
        Student s = new Student(101, "Vardhan");
        s.display();
        s.showMessage();
    }
}
