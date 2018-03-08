import java.text.DecimalFormat;
import java.util.Scanner;

public class W9MD {
	public static void main(String args[]) {
		System.out.println("Between error terms this program was implemented by the Sahas Kiran");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Fisrt enter the measuredvalue of 1st term");
		double MeasuredValue1 = keyboard.nextDouble();                        // this was print on the console here we can enter 1st measuredvalue 
		System.out.println("Now enter the Error term of the 1st term");
		double ErrorValue1 = keyboard.nextDouble();                           // this was print on the console here we can enter 1st Errorvalue 
		System.out.println("");
		System.out.println("Fisrt enter the measuredvalue of 2nd term");
		double MeasuredValue2 = keyboard.nextDouble();                        // this was print on the console here we can enter 2nd measuredvalue 
		System.out.println("Now enter the Error term of the 2nd term");
		double ErrorValue2 = keyboard.nextDouble();                          // this was print on the console here we can enter 2nd Errorvalue 
		System.out.println("");
		keyboard.close();
		
		DecimalFormat kwbd = new DecimalFormat();
		
		
		// here below product of the given inputs along with error terms was performed 
		System.out.println("");
	    System.out.println("Product of the both inputs");
	    double ProductMeasured=MeasuredValue1*MeasuredValue2;
	    double Producterror=(ErrorValue1/MeasuredValue1+ErrorValue2/MeasuredValue2)*(MeasuredValue1*MeasuredValue2);
	    System.out.println(ProductMeasured + "±" +Producterror);    // here the output was  after product of the two input terms
	    System.out.println("Round up value After Multiplication");
	    System.out.println(kwbd.format(ProductMeasured) + "±" +kwbd.format(Producterror));
	    System.out.println("");
	    
	 // here below the difference between the given inputs along with error terms was performed 
	    System.out.println("Quotient between the both inputs");
	    double QuotientMeasured=MeasuredValue1/MeasuredValue2;
	    double QuotientError=(ErrorValue1/MeasuredValue1+ErrorValue2/MeasuredValue2)*(MeasuredValue1/MeasuredValue2);
	    System.out.println(QuotientMeasured + "±" +QuotientError);
	    System.out.println("Round up value after division");
	    System.out.println(kwbd.format(QuotientMeasured) + "±" +kwbd.format(QuotientError));
	    System.out.println("");
	    
		
	}
	
	}


