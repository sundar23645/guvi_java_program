import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Double userInput = obj.nextDouble();
        System.out.println((int)Math.ceil(userInput));
    }
}