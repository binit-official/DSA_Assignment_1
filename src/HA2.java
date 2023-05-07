import java.util.Scanner;
public class HA2 {
   static Scanner sc=new Scanner(System.in);
    public static void main (String []args){

        System.out.println("Enter the number of lines ");
        int n= sc.nextInt();
        sc.nextLine();
        System.out.println("Input lines");
        inout(n);
    }
    public static void inout(int n){
        if (n==0){
            return;
        }
        else{
            String line=sc.nextLine();
            inout(n-1);
            System.out.println(line);
        }
    }
}
