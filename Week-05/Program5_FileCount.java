import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int lines = 0;
        int words = 0;
        int characters = 0;

        try
        {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNextLine())
            {
                String line = fileReader.nextLine();
                lines++;
                characters += line.length();

                if(!line.trim().isEmpty())
                {
                    String wordArray[] = line.trim().split("\\s+");
                    words += wordArray.length;
                }
            }

            fileReader.close();
            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        sc.close();
    }
}
