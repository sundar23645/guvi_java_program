import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i>0&&arr[i]==arr[i-1])
                {
                    continue;
                }
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr1[j]){
                    if(c!=0)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(arr[i]);
                    c++;
                }
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        
    }
}