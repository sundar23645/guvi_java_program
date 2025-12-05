import java.util.*;
public class Main {
    public static boolean prime(int n)
    {
        if(n<=1)return false;
        int c=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            if(prime(i)){
                arr.add(i);
            }
        }
        int c=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i;j<arr.size();j++)
            {
                if(arr.get(i)*arr.get(j)==n)
                {
                    if(arr.get(i)>=arr.get(j))System.out.println(arr.get(i)+" "+arr.get(j));
                    else
                    System.out.println(arr.get(j)+" "+arr.get(i));
                    c++;
                }
            }
        }
        if(c==0||n<=1)System.out.print("-1");
    }
}