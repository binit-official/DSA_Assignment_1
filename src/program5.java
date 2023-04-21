import java.util.Scanner;

public class program5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=check(a);
        System.out.println("The number after addition is "+b);

    }
    public static int check(int a){


            while (a > 9) {
                int sum = 0;

                while (a > 0) {
                    sum += a % 10;
                    a /= 10;
                }
                a = sum;
            }
            return a;
        }

    }

