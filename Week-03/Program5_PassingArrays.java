import java.util.Scanner;

public class PassingArrays {
    static void display(int[] arr) {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }

    static void modifyFirstElement(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.println("Array passed to display method:");
        display(arr);

        modifyFirstElement(arr);
        System.out.println("Array after modifying first element in method:");
        display(arr);
        sc.close();
    }
}
