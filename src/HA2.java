import java.util.Scanner;
public class HA2 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of line to be entered");
        int n= sc.nextInt();
        System.out.println("Enter the lines");
        String []str=new String[n+1];
        for (int i=0; i<=n;i++){
            str[i]= sc.nextLine();
        }
        for (int j = n; j>=0 ; j--) {
            System.out.println(str[j]);

        }

        }
    }

