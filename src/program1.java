import java.util.Scanner;

public class program1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number grater than 2");
        int a=sc.nextInt();
        int c=0;
        for(int i=1;i>=1;i++){
            a/=2;
            if (a>=2){
                c+=1;
            }
            else{
                break;
            }
        }
        System.out.print("Number of time it will be divided "+c);
    }
}
