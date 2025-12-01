import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}