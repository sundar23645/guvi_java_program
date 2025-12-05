import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        Arrays.sort(arr,(a,b)->{
            if(a.length()!=b.length())
            {
                return a.length()-b.length();
            }
            return a.compareTo(b);
        });
        for(int i=0;i<arr.length;i++)
        {
            if(i!=0)System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}