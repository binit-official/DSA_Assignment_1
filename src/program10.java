import java.util.*;
public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] a = new double[3][4];
        System.out.println("Enter the elements of rows and columns of the 2D matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextDouble();

            }
        }
        System.out.println("Enter the column to be added");
        int colno=sc.nextInt();
        double sum=sumColumn(a,colno);

        System.out.println("The sum of the "+colno+" column is "+ sum);

    }
    public static double sumColumn(double[][]a, int colno){
        double s=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (colno==j){
                    s+=a[i][j];

                }

            }
        }
        return s;

    }

}
