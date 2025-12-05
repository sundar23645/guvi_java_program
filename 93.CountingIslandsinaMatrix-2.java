import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    boolean vi=true;
                    if(i>0&&arr[i-1][j]==1)vi=false;
                    if(i<n-1&&arr[i+1][j]==1)vi=false;
                    if(j<n-1&&arr[i][j+1]==1)vi=false;
                    if(j>0&&arr[i][j-1]==1)vi=false;
                    if(vi)c++;
                }
                
            }
            
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        else
            System.out.print(c);
        
    }
}