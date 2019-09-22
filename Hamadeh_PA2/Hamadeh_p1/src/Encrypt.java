import java.util.Scanner;

public class Encrypt
{

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int origNum;
		int oneNum;
		int twoNum;
		int threeNum;
		int fourNum;
		
		System.out.println("Enter your four digit integer: ");
		origNum = scnr.nextInt();
		
		fourNum = (((origNum % 10) + 7) % 10);
		origNum /= 10;
		
		threeNum = (((origNum % 10) + 7) % 10);
		origNum /= 10;
		
		twoNum = (((origNum % 10) + 7) % 10);
		origNum /= 10;
		
		oneNum = (((origNum % 10) + 7) % 10);
		origNum /= 10;
		
		System.out.println("" + threeNum + fourNum + oneNum + twoNum);
	}

}
