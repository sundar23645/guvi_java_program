import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean f=false;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(f&&n%i==0&&i%2==0)System.out.print(" ");
            if(i%2==0&&n%i==0){
                c++;
                System.out.print(i);
                f=true;
            }
        }
        if(c==0)System.out.print("-1");
    }
}