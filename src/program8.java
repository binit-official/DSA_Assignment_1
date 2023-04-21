import java.util.*;
public class program8 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows and columns of the 2D matrix");
        int m=sc.nextInt();
        int n= sc.nextInt();
        int s=0;
        int[][] a =new int[m][n];
        System.out.println("Enter the elements of rows and columns of the 2D matrix");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]= sc.nextInt();
                s+=a[i][j];
            }
        }
        System.out.println("The sum of the matrix is "+s);

    }
}
