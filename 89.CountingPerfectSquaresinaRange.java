import java.util.Scanner;
public class Main {
    public static boolean sq(int n)
    {
        int s=(int)Math.sqrt(n);
        if(s*s==n)
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
        for(int i=a+1;i<b;i++)
        {
            if(sq(i))c++;
        }
        if(c==0)System.out.print("-1");
        else
        System.out.print(c);
    }
}