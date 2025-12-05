import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[256];
        for(char c:s.toCharArray())
        {
            if(c!=' ')
            {
                freq[c]++;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<256;i++)
        {
            if(freq[i]<min&&freq[i]>0)
            {
                min=freq[i];
            }
        }
        StringBuilder sb=new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char c:s.toCharArray())
        {
            if(c!=' '&&freq[c]==min&&!seen[c])
            {
                seen[c]=true;
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}