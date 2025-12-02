import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=1;
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i;j<n-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    c++;
                }
                else
                break;
            }
            if(c>res)
            {
                res=c;
            }
        }
        if(res==1)
        {
            System.out.print("-1");
        }
        else
        System.out.print(res);
    }
}