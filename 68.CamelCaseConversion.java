import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder b=new StringBuilder();
        for(String a:s.trim().split("\\s+"))
        {
            if(!a.isEmpty())
            {
                b.append(Character.toUpperCase(a.charAt(0))).append(a.substring(1).toLowerCase());
            }
        }
        System.out.print(b);
    }
}