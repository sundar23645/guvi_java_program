import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuilder sb=new StringBuilder();
		char[] c=a.toCharArray();
		for(int i=0; i<a.length(); i++)
		{
			int a1=c[i]+3;
			if(c[i]=='X')System.out.print("A");
			else if(c[i]=='Y')System.out.print("B");
			else if(c[i]=='Z')System.out.print("C");
			else
				System.out.print((char)a1);
		}
	}
}