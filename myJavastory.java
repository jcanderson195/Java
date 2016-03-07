import java.util.Scanner;
public class myJavastory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		time twoSec = new time();
		time fiveSec = new time();
		time tenSec = new time();
		
		Result_Tiger result1 = new Result_Tiger();
		Result_Tiger result2 = new Result_Tiger();
		Result_Tiger result3 = new Result_Tiger();
		Result_Tiger result4 = new Result_Tiger();
		Result_Tiger result5 = new Result_Tiger();
		Result_Tiger result6 = new Result_Tiger();
		Result_Tiger result7 = new Result_Tiger();
		Result_Tiger result8 = new Result_Tiger();
		Result_Tiger result9 = new Result_Tiger();
		
		Result_shark result_1 = new Result_shark();
		Result_shark result_2 = new Result_shark();
		Result_shark result_3 = new Result_shark();
		Result_shark result_4 = new Result_shark();
		Result_shark result_5 = new Result_shark();
		Result_shark result_6 = new Result_shark();
		Result_shark result_7 = new Result_shark();
		Result_shark result_8 = new Result_shark();
		Result_shark result_9 = new Result_shark();
		
		
		Result_dog result_01 = new Result_dog();
		Result_dog result_02 = new Result_dog();
		Result_dog result_03 = new Result_dog();
		Result_dog result_04 = new Result_dog();
		Result_dog result_05 = new Result_dog();
		Result_dog result_06 = new Result_dog();
		Result_dog result_07 = new Result_dog();
		Result_dog result_08 = new Result_dog();
		Result_dog result_09 = new Result_dog();
		
		
		boolean run = true;
		
		int choice;
		choice = 0;
		
		int choice2;
		choice2 = 0;
		
		int choice3;
		choice3 = 0;
		
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
			choice = 100;
			break;
		}
		else if (answer_2.equals("shark")){
			System.out.println("Just keep swimming. Just keep swimming! Continue on.");
			choice = 200;
			break;
		}else if (answer_2.equals("dog")){
			System.out.println("Are you all bark and no bite? Continue on.");
			choice = 300;
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
			choice2 = 10;
			break;
		}
		else if (answer_3.equals("flight")){
			System.out.println("So you want to fly like a eagle huh? Continue on.");
			choice2 = 20;
			break;
		}else if (answer_3.equals("strength")){
			System.out.println("Brawn over mind type of person ay? Continue on.");
			choice2 = 30;
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
			choice3 = 1;
			break;
		}
		else if (answer_4.equals("ocean")){
			System.out.println("Don't get lost in the vastness of the ocean! Continue on.");
			choice3 = 2;
			break;
		}else if (answer_4.equals("city")){
			System.out.println("Don't get caught by animal control! Continue on.");
			choice3 = 3;
			break;
		}else{
			System.out.println("Don't waste me time! I have a story to tell!");
			
			twoSec.twoSeconds();
			
		}}
		
		twoSec.twoSeconds();
		
		System.out.println("Compiling your story good sir!......");
		
		fiveSec.fiveSeconds();
		
		System.out.println("Or are you a woman?......");
		
		fiveSec.fiveSeconds();
		
		System.out.println("It doesn't matter at this point. You're already in the rabbit hole. Time to continue on your way!");
        
		tenSec.tenSeconds();
		
		Scanner forward = new Scanner(System.in); 
		while (run){
		System.out.println("Are you ready? yes or no?");
		String answer_5 = scanners.next();
		
		if (answer_5.equals("yes")){
			System.out.println("Alright lets go!");
			break;
		}
		else if (answer_5.equals("no")){
			System.out.println("Why not? You're already so far!");
		}else{
			System.out.println("Seriously man? You're still wasting my time!");
			
			twoSec.twoSeconds();
			
		}}
		
		if (choice + choice2 + choice3 ==  111) {
			
			result1.tiger1();
		} 
		
		else if (choice + choice2 + choice3 ==  112){
			
			result2.tiger2();
		}
		
		else if (choice + choice2 + choice3 ==  113){
	
			result3.tiger3();
		}
		
		else if (choice + choice2 + choice3 ==  121){
			
			result4.tiger4();
		}
		
		else if (choice + choice2 + choice3 ==  122){
			
			result5.tiger5();
		}
		
		else if (choice + choice2 + choice3 ==  123){
			
			result6.tiger6();
		}
		
		else if (choice + choice2 + choice3 ==  131) {
			
			result7.tiger7();
		}
		
		else if (choice + choice2 + choice3 ==  132){
			
			result8.tiger8();
		}
		
		else if (choice + choice2 + choice3 ==  133){
			
			result9.tiger9();
		}
		
		else if (choice + choice2 + choice3 ==  211){
			
			result_1.shark1();
		}
		
		else if (choice + choice2 + choice3 ==  212){
			
			result_2.shark2();
		}
		
		else if (choice + choice2 + choice3 ==  213){
			
			result_3.shark3();
		}
		
		else if (choice + choice2 + choice3 ==  221){
			
			result_4.shark4();
		}
		
		else if (choice + choice2 + choice3 ==  222){
			
			result_5.shark5();
		}
		
		else if (choice + choice2 + choice3 ==  223){
			
			result_6.shark6();
		}
		
		else if (choice + choice2 + choice3 ==  231){
			
			result_7.shark7();
		}
		
		else if (choice + choice2 + choice3 ==  232){
			
			result_8.shark8();
		}
		
		else if (choice + choice2 + choice3 ==  233){
			
			result_9.shark9();
		}
		
		else if (choice + choice2 + choice3 ==  311){
			
			result_01.dog1();
		}
		
		else if (choice + choice2 + choice3 ==  312){
			
			result_02.dog2();
		}
		
		else if (choice + choice2 + choice3 ==  313){
			
			result_03.dog3();
		}
		
		else if (choice + choice2 + choice3 ==  321){
			
			result_04.dog4();
		}
		
		else if (choice + choice2 + choice3 ==  322){
			
			result_05.dog5();
		}
		
		else if (choice + choice2 + choice3 ==  323){
			
			result_06.dog6();
		}
		
		else if (choice + choice2 + choice3 ==  331){
			
			result_07.dog7();
		}
		
		else if (choice + choice2 + choice3 ==  332){
			
			result_08.dog8();
		}
		
		else if (choice + choice2 + choice3 ==  333){
			
			result_09.dog9();
		}
		
		
  }
	}


	


