import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=d[i])
            {
                count++;
            }
        }
        if(count==1)
        System.out.print("yes");
        else
        System.out.print("no");
        
    }
    
}