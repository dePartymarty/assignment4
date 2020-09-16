package assignment3;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		String output = input.nextLine();

		int answer1 = Integer.parseInt(output, 2);
		
		System.out.println(answer1); //decimal conversion
		
		System.out.println(Driver.decimalToHex(answer1)); //calls hex conversion
	}



public static String decimalToHex(int numberAsAnInt)
{
	String answer = "";
	String map = "0123456789ABCDEF";
	while(numberAsAnInt != 0)
	{
		int temp = numberAsAnInt % 16;
		answer = map.charAt(temp) + answer;
		numberAsAnInt = numberAsAnInt / 16;
	}
	return answer;
}
}