import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int k=sc.nextInt();
        int c=0;
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(arr1[i]!=arr2[i])c++;
        }
        if(c==k)System.out.print("yes");
        else
        System.out.print("no");
    }
}