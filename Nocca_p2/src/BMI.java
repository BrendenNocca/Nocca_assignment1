import java.util.Scanner;
import java.lang.Math;
public class BMI {
	public static double getHeightAndWeight() {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		return num;
		
	}
	
	public static String MetricOrImperial() {
		String Answer;
		Scanner in = new Scanner(System.in);
		System.out.println("Please choose how you want your BMI mesured in");
		System.out.println("Enter Metric or Imperial");
		Answer = in.nextLine();
		Answer = Answer.toUpperCase();
		return Answer;
	}
	public static double BMIcalc(String answer)
	{
		if (answer.equals("IMPERIAL")) {
			final int constant = 703;
			final double two = 2;
			System.out.println("Enter weight in pounds");
			double WeightLB= getHeightAndWeight();
			
			System.out.println("Enter height in Inches");
			double HeightIN= getHeightAndWeight();
			
			double BMI = (constant * WeightLB)/Math.pow(HeightIN,two);
			return BMI;
		}
		else if (answer.equals("METRIC")) {
			final double two =2;
			System.out.println("Enter weight in Kilongrams");
			double WeightKG= getHeightAndWeight();
			
			System.out.println("Enter height in Meters");
			double HeightM= getHeightAndWeight();
			
			double BMI = WeightKG/Math.pow(HeightM,two); 
			return BMI;
		}
		double bmi=0;
		return bmi;
		
	}
	public static void printBMIandChart(double BMInum) {
		System.out.println("UnderWeight = < 18.5");
		System.out.println("Normal Weight = 18.5-24.9");
		System.out.println("Over Weight 25-29.9");
		System.out.println("Obese 30 or >");
		System.out.println("Your BMI:" + BMInum);
		
	}
	public static void main(String[] args) {
		String answer = MetricOrImperial();
		printBMIandChart(BMIcalc(answer));
	}
}
