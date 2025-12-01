import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=Math.abs(n-m);
        if(a%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}