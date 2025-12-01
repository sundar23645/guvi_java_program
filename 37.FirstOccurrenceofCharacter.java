import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==c){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("-1");
    }
}