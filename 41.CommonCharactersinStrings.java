import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean[] check=new boolean[256];
        for(char c:s1.toCharArray()){
            check[c]=true;
        }
        for(char c:s2.toCharArray()){
            if(check[c]){
                System.out.println("yes");
                return;
            }
        }System.out.println("no");
    }
}