import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Vardhan");
        names.add("Rahul");
        names.add("Kiran");
        names.add("Arjun");

        System.out.println("ArrayList = " + names);

        System.out.println("First Element = " + names.get(0));

        names.set(1, "Ravi");

        System.out.println("After Modification = " + names);

        names.remove(2);

        System.out.println("After Removal = " + names);

        System.out.println("Size = " + names.size());

        System.out.println("Contains Vardhan = "
                + names.contains("Vardhan"));

        System.out.println("Elements:");

        for (String name : names)
        {
            System.out.println(name);
        }
    }
}
