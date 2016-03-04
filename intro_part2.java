import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class intro_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanners = new Scanner(System.in); 
		System.out.println("Are you Justin or Bobby? ");
		String name = scanners.next();
		
		double pay_A;
		pay_A = 17.24;
		
		double pay_B;
		pay_B = 23.43;
		
		
		int hours_A;
		hours_A = 34;
		
		double totalPay_A;
		totalPay_A = pay_A * hours_A;
		
		int hours_B;
		hours_B = 47;
		
		int overtime_hours;
		overtime_hours = 7;
		
		int noOverTime;
		noOverTime = 40;
		
		double totalPay_B;
		totalPay_B = pay_B * hours_B;
		
		
		double time_half;
		time_half = (pay_B / 2) + pay_B;
		
		double payAndOvertime;
		payAndOvertime = (time_half * overtime_hours)+ (noOverTime * pay_B);
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
	    
		String payFormatted_A = formatter.format(totalPay_A);
        String payFormatted_B = formatter.format(payAndOvertime);
        String payFormatted_C = formatter.format(totalPay_B);
        
		
		
		
		if (name.equals("Justin")){
			System.out.println("You get " + payFormatted_A);
		}
		else if (name.equals("Bobby")){
			System.out.println("With time and a half, you get " + payFormatted_B + " Without time and a half, you get " + payFormatted_C);
		}else{
			System.out.println("Why are you here?");
		}
	
		

				
	}

}
