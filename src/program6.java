import java.util.*;
public class program6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        int a=sc.nextInt();

        System.out.println(a+" is odd"+isOdd(a));
    }
    public static boolean isOdd(int a){
        return ( ((a & 1)==1));
    }
}