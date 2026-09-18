class Box<T>
{
    private T value;

    void setValue(T value)
    {
        this.value = value;
    }

    T getValue()
    {
        return value;
    }
}

public class GenericClassDemo
{
    public static void main(String[] args)
    {
        Box<Integer> intBox = new Box<Integer>();
        intBox.setValue(100);
        System.out.println("Integer Value = " + intBox.getValue());

        Box<String> stringBox = new Box<String>();
        stringBox.setValue("Java");
        System.out.println("String Value = " + stringBox.getValue());
    }
}
