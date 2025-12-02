import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[m];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int len=m+n;
        int[] res=new int[len];
        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }
        for(int i=0;i<m;i++)
        {
            res[n+i]=arr1[i];
        }
        Arrays.sort(res);
        for(int i=0;i<len;i++)
        {
            if(i!=0)
            {
                System.out.print(" ");
            }
            System.out.print(res[i]);
        }
    }
}