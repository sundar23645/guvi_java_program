import java.util.*;
public class Main {
    public static int roman(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int val=map.get(s.charAt(i));
            
            if(i+1<s.length()&&map.get(s.charAt(i+1))>val)
            {
                res-=val;
            }
            else
            res+=val;
        }
        return res;
    }
    public static boolean isValidRoman(String s) {
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c != 'I' && c != 'V' && c != 'X' &&
            c != 'L' && c != 'C' && c != 'D' && c != 'M') {
            return false;
        }
    }
    return true;
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        if(!isValidRoman(s))
        {
            System.out.print("-1");
        }
        else
        {
        int num=roman(s);
        
        System.out.print(num);
        }
        
    }
}