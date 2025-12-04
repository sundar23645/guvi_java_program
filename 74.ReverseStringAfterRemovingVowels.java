import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder a=new StringBuilder();
        char[] ar=s.toCharArray();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(ar[i]!='a'&&ar[i]!='e'&&ar[i]!='i'&&ar[i]!='o'&&ar[i]!='u')
            {
                a.append(ar[i]);
                c++;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        else
        System.out.print(a.reverse());
    }
}