import java.util.*;
public class Main {
    public static int max(int arr[])
    {
        int len=arr.length,max=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n+k];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean f=false;
        for(int i=n;i<k+n;i++)
        {
            arr[i]=sc.nextInt();
            int r=max(arr);
            if(f)System.out.print(" ");
            System.out.print(r);
            f=true;
        }
    }
}