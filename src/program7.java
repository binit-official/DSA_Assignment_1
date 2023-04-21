import java.util.Scanner;
public class program7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element of an array");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter all element of the array");
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
       int max=a[0];
        int min=a[0];
        int maxpo=-1;
        int minpo=-1;
        int maxc=0;
        int minc=0;
        for (int j : a) {
            if (j > max) {
                max = j;
            } else if (j == max) {
                maxc += 1;
            } else if (j == min) {
                minc += 1;
            }
            if (j < min) {
                min = j;
            }
        }

        for (int i=0; i<a.length; i++){
            if (a[i]==max && maxpo==-1){
                maxpo=i;

            }
            if (a[i]==min){
                minpo=i;
            }
        }
        System.out.println("Maximum element: " + max + ", occurs " + maxc + " times");
        System.out.println("Minimum element: " + min + ", occurs " + minc + " times");
        System.out.println("Position of first occurrence of maximum: " +maxpo);
        System.out.println("Position of last occurrence of minimum: " + minpo);






    }



    }

