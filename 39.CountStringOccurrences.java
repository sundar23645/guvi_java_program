import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String[] str=s1.split(" ");
        int c=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(s2)){
                c++;
            }
        }
        if(c!=0)
        System.out.println(c);
        else{
            System.out.println("-1");
        }
    }
}