import java.util.Scanner;

public class Decrypt 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		int encryptNum;
		int oneNum;
		int twoNum;
		int threeNum;
		int fourNum;
		
		System.out.println("Enter your four digit encrypted integer: ");
		encryptNum = scnr.nextInt();
		
		
		
		
		fourNum = (encryptNum % 10);
		encryptNum /= 10;
		
		if (fourNum == 8 || fourNum == 9)
		{
		  fourNum = fourNum - 7;
		}

		else 
		{
		  fourNum = fourNum + 3;
		}
		
		
		
		threeNum = (encryptNum % 10);
		encryptNum /= 10;
		
		if (threeNum == 8 || threeNum == 9)
		{
		  threeNum = threeNum - 7;
		}

		else 
		{
		  threeNum = threeNum + 3;
		}
		
		
		
		twoNum = (encryptNum % 10);
		encryptNum /= 10;
		
		if (twoNum == 8 || twoNum == 9)
		{
		  twoNum = twoNum - 7;
		}

		else 
		{
		  twoNum = twoNum + 3;
		}
		
		
		
		oneNum = (encryptNum % 10);
		encryptNum /= 10;
		
		if (oneNum == 8 || oneNum == 9)
		{
		  oneNum = oneNum - 7;
		}

		else 
		{
		  oneNum = oneNum + 3;
		}
		
		
		
		System.out.println("" + threeNum + fourNum + oneNum + twoNum);
	}
}
