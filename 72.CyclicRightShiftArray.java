import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        while(b!=0)
        {
            int temp=arr[a-1];
            for(int i=a-1;i>=1;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            b--;
        }
        for(int i=0;i<a;i++)
        {
            if(i!=0)
            {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }
}