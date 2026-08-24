import java.io.File;
import java.util.Scanner;

class FileInformation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);

        System.out.println("File exists: " + file.exists());
        System.out.println("File is readable: " + file.canRead());
        System.out.println("File is writable: " + file.canWrite());

        if(file.isFile())
            System.out.println("Type: File");
        else if(file.isDirectory())
            System.out.println("Type: Directory");
        else
            System.out.println("Type: Does not exist");

        System.out.println("Length: " + file.length() + " bytes");
        sc.close();
    }
}
