import java.util.Scanner;

public class MatrixAdditionMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        System.out.println("Enter first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) a[i][j] = sc.nextInt();

        System.out.println("Enter second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) b[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                for (int k = 0; k < 2; k++)
                    product[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Matrix Addition:");
        printMatrix(sum);
        System.out.println("Matrix Multiplication:");
        printMatrix(product);
        sc.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}
