class InvalidMarksException extends Exception
{
    public InvalidMarksException(String message)
    {
        super(message);
    }
}

public class Program1ii_UserDefinedExceptionDemo
{
    public static void main(String[] args)
    {
        int marks = 120;

        try
        {
            if (marks > 100)
            {
                throw new InvalidMarksException(
                    "Marks cannot be greater than 100"
                );
            }

            System.out.println("Valid Marks = " + marks);
        }
        catch (InvalidMarksException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}