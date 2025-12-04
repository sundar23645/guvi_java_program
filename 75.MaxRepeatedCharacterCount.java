import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        char[] a=c.toCharArray();
        int max=0;
        for(int i=0;i<c.length();i++)
        {
            int co=0;
            for(int j=i+1;j<c.length();j++)
            {
                if(a[i]==a[j])
                {
                    co++;
                }
            }
            if(co>max)
            {
                max=co;
            }
        }
        if(max==0)
        {
            System.out.print("0");
        }
        else
        System.out.print(max+1);
    }
}