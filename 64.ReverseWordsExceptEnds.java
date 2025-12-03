import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] word=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length;i++)
        {
            String wo=word[i];
            if(wo.length()<=2)
            {
                str.append(wo);
            }else{
            char first=wo.charAt(0);
            char last=wo.charAt(wo.length()-1);
            String mid=wo.substring(1,wo.length()-1);
            String rev=new StringBuilder(mid).reverse().toString();
            
            str.append(first).append(rev).append(last);
            }
            if(i!=word.length-1)
            {
                str.append(" ");
            }
        }
        System.out.print(str.toString());
    }
}