import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a=obj.nextInt();
        int d=obj.nextInt();
        int n=obj.nextInt();
        int sum=(n*(2*a+(n-1)*d))/2;
        System.out.print(sum);
    }
}