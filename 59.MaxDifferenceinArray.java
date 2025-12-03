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
        int res=0;
        for(int i=n-1;i>=0;i--)
        {
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j])
                {
                    max=arr[i]-arr[j];
                }
                if(max>res)
                {
                    res=max;
                }
            }
        }
        System.out.print(res);
    }
}