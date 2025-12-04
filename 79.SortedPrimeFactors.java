import java.util.Scanner;
public class Main {
	public static boolean prime(int a)
	{
		if(a<=1)return false;
		int c=0;
		for(int i=2; i<=a; i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean f=false;
		for(int i=0; i<=a; i++)
		{
			if(f&&a%i==0&&prime(i))
			{
				System.out.print(" ");
			}
			if(prime(i)&&a%i==0)
			{
				System.out.print(i);
				f=true;
			}
		}
	}
}