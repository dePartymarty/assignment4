package assignment3;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String s = myObj.nextLine();
		int n = Integer.parseInt(s);
		String one = "";
		String two = "";
		int ans1;
		int remain;
		
		do
		{
			ans1 = n / 2;
			remain = n % 2;
			one = Integer.toString(remain);
			two = one + two;
			n = ans1;
		}
		while (n > 0);
		System.out.println(two);
	}
}
