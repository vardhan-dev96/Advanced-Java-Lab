class Student
{
    int rollNo;
    String name;

    public void display()
    {
        System.out.println("Student Details");
    }
}

public class ReflectionClassDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class<?> c = Class.forName("Student");

            System.out.println("Class Name = " + c.getName());
            System.out.println("Superclass = " + c.getSuperclass());
            System.out.println("Is Interface = " + c.isInterface());

            System.out.println("Methods:");

            java.lang.reflect.Method[] methods = c.getDeclaredMethods();

            for (java.lang.reflect.Method method : methods)
            {
                System.out.println(method.getName());
            }
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found");
        }
    }
}
