import java.util.Scanner;
public class Main {
    public static boolean prime(int n)
    {
        if(n<=1)return false;
        int c=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++)
        {
            if(prime(i))
            {
                c++;    
            }
        }
        System.out.print(c);
    }
}