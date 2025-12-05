import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        if(n==1)
        {
            System.out.print("yes");
            return;
        }
        while(c<n)
        {
            c*=2;
        }
        if(c==n)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}