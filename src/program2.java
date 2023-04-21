import java.util.Scanner;

public class program2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the weight in kg");
        double k= sc.nextDouble();
        System.out.print("Enter the height in meter");
        double h= sc.nextDouble();
        double f=k/(Math.pow(h,2));
        if (f<18.5) System.out.print("UnderWeight");
        else if (f>=18.5 && f<24.9) System.out.print("Normal Weight");
        else if (f>=25.0 && f<29.9) System.out.print("overWeight");
        else System.out.print(f+"obese");
        sc.close();
    }
}
