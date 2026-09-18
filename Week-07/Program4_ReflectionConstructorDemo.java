import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

class Student
{
    int rollNo;
    String name;

    public Student()
    {
        rollNo = 101;
        name = "Vardhan";
    }

    public Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display()
    {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
    }
}

public class ReflectionConstructorDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class<?> c = Student.class;

            Constructor<?>[] constructors = c.getDeclaredConstructors();

            System.out.println("Number of Constructors = " + constructors.length);

            for (Constructor<?> constructor : constructors)
            {
                System.out.println("\nConstructor: " + constructor.getName());

                Parameter[] parameters = constructor.getParameters();

                System.out.println("Number of Parameters = " + parameters.length);

                for (Parameter parameter : parameters)
                {
                    System.out.println("Parameter Type = "
                            + parameter.getType().getName());
                }
            }

            Constructor<?> constructor =
                    c.getDeclaredConstructor(int.class, String.class);

            Student obj =
                    (Student) constructor.newInstance(102, "Rahul");

            System.out.println("\nObject created using Reflection:");

            obj.display();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
