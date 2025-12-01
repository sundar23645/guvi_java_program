import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=1;
        while(a>0)
        {
            int temp=a%10;
            res*=temp;
            a/=10;
        }
        System.out.println(res);
    }
}