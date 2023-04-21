import java.util.Scanner;

public class program3 {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        int sum=0;
        int prd=1;
        do {
            int d=a%10;
            sum+=d;
            prd*=d;
            a/=10;

        }while (a!=0);
        if (sum==prd)System.out.println("yes it is a spy number ");
        else System.out.println("nope");
    }
}

