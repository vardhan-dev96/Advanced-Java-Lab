import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileLineNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try
        {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            int lineNumber = 1;

            while(fileReader.hasNextLine())
            {
                String line = fileReader.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            fileReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        sc.close();
    }
}
