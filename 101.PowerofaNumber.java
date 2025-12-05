import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k==1)
        {
            if(n==1)
            System.out.print("yes");
            else
            System.out.print("no");
        }
        int pow=1;
        while(pow<n)
        {
            pow*=k;
        }
        if(pow==n)
        System.out.print("yes");
        else
        System.out.print("no");
        
        
    }
}