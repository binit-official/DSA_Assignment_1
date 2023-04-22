import java.util.Scanner;

public class HA4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and column");
        int rows= sc.nextInt();
        int columns= sc.nextInt();
        double[][] a = new double[rows][columns];
        double[][] b = new double[rows][columns];

        double[][] result = addMatrix(a, b);

        // Print out the matrices and their sum
        System.out.println("Matrix A:");
        printMatrix(a);

        System.out.println("Matrix B:");
        printMatrix(b);

        System.out.println("Sum of A and B:");
        printMatrix(result);
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int columns = a[0].length;
        double[][] result = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}