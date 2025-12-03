import java.util.Scanner;
public class Main {
    public static boolean iso(String s,String t)
    {
        if(s.length()!=t.length())return false;
        int[] arr1=new int[256];
        int[] arr2=new int[256];
        
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(arr1[c1]!=arr2[c2])return false;
            
            arr1[c1]=i+1;
            arr2[c2]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        
        if(iso(s,t))
        {
            System.out.print("yes");
        }
        else
            System.out.print("no");
    }
}