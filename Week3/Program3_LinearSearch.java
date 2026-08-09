import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) System.out.println("Element found at index: " + index);
        else System.out.println("Element not found");

        sc.close();
    }
}
