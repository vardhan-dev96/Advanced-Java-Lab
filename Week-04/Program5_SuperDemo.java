class Parent
{
    int x = 10;

    Parent()
    {
        System.out.println("Parent Constructor");
    }

    void display()
    {
        System.out.println("Parent Display Method");
    }
}

class Child extends Parent
{
    int x = 20;

    Child()
    {
        super();
        System.out.println("Child Constructor");
    }

    void display()
    {
        System.out.println("Child Display Method");
        System.out.println("Child x = " + x);
        System.out.println("Parent x = " + super.x);
        super.display();
    }
}

public class SuperDemo
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        System.out.println();
        obj.display();
    }
}
