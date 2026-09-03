interface A
{
    void methodA();
}

interface B
{
    void methodB();
}

class C implements A, B
{
    public void methodA()
    {
        System.out.println("Method of Interface A");
    }

    public void methodB()
    {
        System.out.println("Method of Interface B");
    }
}

public class MultipleInheritanceDemo
{
    public static void main(String[] args)
    {
        C obj = new C();

        obj.methodA();
        obj.methodB();
    }
}
