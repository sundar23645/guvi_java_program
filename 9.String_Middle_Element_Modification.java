import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(len%2==0){
                if(i==len/2||i==(len/2)-1)
                System.out.print("*");
                else
                System.out.print(c);
            }
            else{
                if(i==len/2)
                System.out.print("*");
                else
                System.out.print(c);
            }
        }
    }
}