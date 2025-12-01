import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.next();
        int f=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}