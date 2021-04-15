package execise5;
//import java scanner
import java.util.Scanner;

public class week8converter {
	public static void main(String[] args)
	{
		System.out.println("let's convert SI unit to Metric measurement!");
		//declare variable 
		Scanner keyboard=new Scanner(System.in);
		//convert pound to kilogram 
		double unitlb;
		double unitkg= 0.453592;
		System.out.println("Please enter the number to covert pound to Kilogram: ");
		unitlb=keyboard.nextDouble();
		unitconverter(unitlb,unitkg);
		 
		//convert mile to kilometer
		
		double unitMile;
		double unitkm=1.60934;
		System.out.println("Please enter the number to convert Mile to Kilometer: ");
		unitMile=keyboard.nextDouble();
		unitconverter(unitMile, unitkm);
		//convert inch to centimeter 
		double unitInch;
		double unitCm=2.54;
		System.out.println("Please enter the number to convert Inch to Centimeter: ");
		unitInch=keyboard.nextDouble();
		unitconverter(unitInch, unitCm);
	}//close main 

	

//create another method 
	public static void unitconverter(double number1, double number2) {
		double result=number1*number2;
		System.out.println(result);
		
	}// close second main method
}//close class
