import java.util.Scanner;
public class myJavastory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		time twoSec = new time();
		
		boolean run = true;
		
		Scanner scanners = new Scanner(System.in); 
		while (run){
		System.out.println("Do you want to go on an adventure? yes or no ");
		String answer = scanners.next();
		
		if (answer.equals("yes")){
			System.out.println("Get ready for an exciting adventure with twists and turns!");
			break;
		}
		else if (answer.equals("no")){
			System.out.println("Why not, adventures are fun?");
		}else{
			System.out.println("Don't waste my time! I have a story to tell!");
			
			twoSec.twoSeconds();
			
		}}
		
		twoSec.twoSeconds();
		
		Scanner character = new Scanner(System.in);
		while (run){
		System.out.println("Choose a character: tiger, shark, or dog");
		String answer_2 = scanners.next();
		
		if (answer_2.equals("tiger")){
			System.out.println("Somebody's feeling fierce today! Let me hear your ROAR!");
			break;
		}
		else if (answer_2.equals("shark")){
			System.out.println("Just keep swimming. Just keep swimming! Continue on.");
			break;
		}else if (answer_2.equals("dog")){
			System.out.println("Are you all bark and no bite? Continue on.");
			break;
		}else{
			System.out.println("Don't waste me time! I have a story to tell!");
			
			twoSec.twoSeconds();
			
		}}
		
		twoSec.twoSeconds();
		
		Scanner ability = new Scanner(System.in);
		while (run){
		System.out.println("Choose an ability: invisibility, flight, or strength");
		String answer_3 = scanners.next();
		
		if (answer_3.equals("invisibility")){
			System.out.println("Don't use this power the wrong way! Continue on.");
			break;
		}
		else if (answer_3.equals("flight")){
			System.out.println("So you want to fly like a eagle huh? Continue on.");
			break;
		}else if (answer_3.equals("strength")){
			System.out.println("Brawn over mind type of person ay? Continue on.");
			break;
		}else{
			System.out.println("Don't waste me time! I have a story to tell!");
			
			twoSec.twoSeconds();
			
		}}
		
		twoSec.twoSeconds();
		
		Scanner location = new Scanner(System.in);
		while (run){
		System.out.println("Choose where you are from: jungle, ocean, or city");
		String answer_4 = scanners.next();
		
		if (answer_4.equals("jungle")){
			System.out.println("Are you the king/queen of the jungle? Continue on.");
			break;
		}
		else if (answer_4.equals("ocean")){
			System.out.println("Don't get lost in the vastness of the ocean! Continue on.");
			break;
		}else if (answer_4.equals("city")){
			System.out.println("Don't get caught by animal control! Continue on.");
			break;
		}else{
			System.out.println("Don't waste me time! I have a story to tell!");
			
			twoSec.twoSeconds();
			
		}}
		
		twoSec.twoSeconds();
		
		System.out.println("Compiling your story good sir!......");
		twoSec.twoSeconds();
		System.out.println("Or are you a woman?......");
		twoSec.twoSeconds();
		System.out.println("It doesn't matter at this point. You already in the rabbit hole. Time to continue on your way!");
        
        
  }
	}


	


