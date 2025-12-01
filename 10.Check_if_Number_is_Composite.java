import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("no");
            return;
        }
        int f=0;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
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