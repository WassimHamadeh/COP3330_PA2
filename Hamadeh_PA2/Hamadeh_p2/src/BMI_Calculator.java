import java.util.Scanner;
import java.lang.Math;

public class BMI_Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		String unit;
		double weightK;
		double heightM;;
		double weightLB;
		double heightI;
		double BMI;
		String bmiChart;
		
		System.out.println("Hello! Would you like to use Metric or Imperial to find your BMI?:");
		unit = scnr.next();
		
		bmiChart = "    BMI CHART   \nUnderweight < 18.5\nNormal weight = 18.5 – 24.9\nOverweight = 25 – 29.9\nObesity > 29.9";
			
   
		if (unit.equals("Metric") || unit.equals("metric") )
		{
			System.out.println("Good choice! What is your weight in kilos?");
			weightK = scnr.nextDouble();
			System.out.println("How about your height in meters?");
			heightM = scnr.nextDouble();
			
			BMI = (weightK / Math.pow(heightM, 2));
			System.out.println("Your BMI is " + BMI);
			System.out.println();
			System.out.println("" + bmiChart);
		}
		
		if (unit.equals("Imperial") || unit.equals("imperial") )
		{
			System.out.println("Good choice! What is your weight in pounds?");
			weightLB = scnr.nextDouble();
			System.out.println("How about your height in inches?");
			heightI = scnr.nextDouble();
			
			BMI = ((703 * weightLB) / (Math.pow(heightI, 2)));
			System.out.println("Your BMI is " + BMI);
			System.out.println();
			System.out.println("" + bmiChart);
		}

    }
}
