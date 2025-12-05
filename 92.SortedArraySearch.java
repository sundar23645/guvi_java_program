import java.util.Scanner;
public class Main {
    public static boolean bin(int arr[],int l,int r,int k)
    {
        while(l<=r)
        {
            int m=(l+r)/2;
            if(arr[m]==k)
            {
                return true;
            }
            else if(arr[m]>k)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(bin(arr,0,n-1,k))
        System.out.print("yes");
        else
        System.out.print("no");
        
    }
}