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
        int e=0,o=0;
        int ev=0,od=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e++;
                ev=arr[i];
            }
            else
            {
                o++;
                od=arr[i];
            }
        }
        if(o==1)
        {
            System.out.print(od);
        }
        else if(e==1)
        {
            System.out.print(ev);
            
        }
        else
            System.out.print("-1");
    }
}