import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            int temp=n%10;
            if(temp==k)
            {
                c++;
            }
            n/=10;
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        else
            System.out.print(c);
    }
}