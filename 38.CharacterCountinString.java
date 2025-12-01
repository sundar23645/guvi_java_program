import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            if(c1==c){
                count++;
            }
        }
        if(count!=0)
        System.out.println(count);
        else{
            System.out.println("-1");
        }
    }
}