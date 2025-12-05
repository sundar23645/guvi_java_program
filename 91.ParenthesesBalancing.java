import java.util.*;
public class Main {
    public static boolean ch(String s)
    {
        Stack<Character> stack=new Stack<>();
        
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                stack.push(c);
            }
            else if(c==')')
            {
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if(c==')'&&top!='(')return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(ch(s))System.out.print("yes");
        else
        System.out.print("no");
    }
}