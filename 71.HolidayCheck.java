import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        if(a.equals("saturday")||a.equals("sunday"))
        {
            System.out.print("yes");
        }
        else
            System.out.print("no");
        
    }
}