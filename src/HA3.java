import java.util.Scanner;

public class HA3 {
    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the first two array");
        int n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter the elements of the first array");
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        for (int i = 0; i < n; i++) {
            b[i]= sc.nextInt();
        }
        int[] c = dotProduct(a, b);
        System.out.println("Elements of the third array are");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}