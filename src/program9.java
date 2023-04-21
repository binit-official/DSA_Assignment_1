import java.util.*;
public class program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the square matrix");
        int n = sc.nextInt();
        double[][] a = new double[n][n];
        System.out.println("Enter the elements of rows and columns of the square matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(a);
        System.out.println("The sum of the major diagonal is " + sum);
        sc.close();
    }

    public static double sumMajorDiagonal(double[][] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    sum += a[i][i];
                }
            }

        }
        return sum;
    }
}
