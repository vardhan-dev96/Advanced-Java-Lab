import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student
{
    int rollNo = 101;
    String name = "Vardhan";

    public void display()
    {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
    }
}

public class ReflectionFieldMethodDemo
{
    public static void main(String[] args)
    {
        try
        {
            Student obj = new Student();
            Class<?> c = obj.getClass();

            Field[] fields = c.getDeclaredFields();

            System.out.println("Fields in Student class:");

            for (Field field : fields)
            {
                System.out.println(field.getName());
            }

            Method method = c.getDeclaredMethod("display");

            System.out.println("\nInvoking display() method:");

            method.invoke(obj);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
