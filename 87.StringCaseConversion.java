import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(arr[i]))
            {
                System.out.print(Character.toLowerCase(arr[i]));
            }
            else
                System.out.print(Character.toUpperCase(arr[i]));

        }
    }
}