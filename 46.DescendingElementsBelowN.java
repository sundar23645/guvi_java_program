import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            
            if(arr[i]<n)
            {
                System.out.print(arr[i]);
                c++;
            }
            if(i<n-1&&arr[i]<n){
                System.out.print(" ");
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}