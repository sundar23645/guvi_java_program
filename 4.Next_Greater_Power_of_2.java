import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
        while(res<=n){
            res=res*2;
        }
        System.out.println(res);
    }
}