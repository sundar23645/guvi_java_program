import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] freq=new int[256];
        for(char c:s.toCharArray())
        {
            freq[c]++;
        }
        int c=0;
        for(int i=0;i<256;i++)
        {
            if(freq[i]==1)
            {
                c++;
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