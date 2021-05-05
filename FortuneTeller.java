package project;
//import timer and Scanner 
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import java.util.TimerTask;

/** player one
 * 
 * 
 * @author CHAUHAN
 *
 */
public class FortuneTeller {
//create fortune taller class 
	//searches on google
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Fortune Teller Game \n ");
		System.out.println("Play The Game and Know your Future \n  ");
		System.out.println("when you etner 1 to start ' | ' symbol will print out until you won't etnter  2  to stop \n ");
		System.out.println("Rapeat 3 times it will give you 3 reminders & tell you your future \n  ");
		System.out.println(" ");
		System.out.println("Press 1 to start and 2 to stop! Repeat 3 times.");
		// create printing first reminder 
		int firstNumber = startClock() + 1;
		int firstRemainder = firstNumber%3;
		System.out.println("First REminder: " + firstRemainder);
		// create printing second reminder 
		int secondNumber = startClock() + 1;
		int secondRemainder = secondNumber%3;
		System.out.println("Second Reminder: " + secondRemainder);
		
		//create printing third number 
		int thirdNumber = startClock() + 1;
		int thirdRemainder = thirdNumber%3;
		System.out.println("Third Reminder: " + thirdRemainder);
		String makingThreeDigitNum = firstRemainder+ ""+secondRemainder+""+thirdRemainder;
		System.out.println("Your Lucky Reminder Number: " + makingThreeDigitNum);
	
		
		//futurePrediction();
		
		// create switch statements 
		switch( makingThreeDigitNum){
		case "000": System.out.println("This is a great day for expressions your ideas and feelings.");
			System.out.println("Share your hopes and concerns, dreams and aspirations with others. ");
			
		break;
		case "111":
			System.out.println("Romance is in the air.");
			System.out.println("You could be flying deliriously high on the wings of love, in the company of your sweetheart");
		break;
		case "222":
			System.out.println("You will outsmart all your colleagues in the work you do.");
		
			break;
		
		case "001": 
			System.out.println("You will experience a deep emotional attachment with your loved ones");
		
		break;
		case "011":
			System.out.println("you will win big lottery today, GOOD LUCK");
		
		break;
		case "100":
			System.out.println("Don't lose hope, everything is working in progress, you will achive big success");
		
		break;
		
		case"101":
			System.out.println("wooooo! There is BIG surprise waiting for YOU. ");
		
		break;
		case "010":
			System.out.println("You will achive your goal, but you’ll have to work through some turbulence to get there");
			
		break;
		case"110":
			System.out.println("There is big opportunity waiting for you, good luck ");
			
		break;
		
		case "002":
			System.out.println("You will win the lottery, but.. but...but first, You have to buy the lottery;-)");
			
		break;
		
		case "020":
			System.out.println("Do Not hurry, You will find your soulmate very soon,");
		break;
		
		case "022":
			System.out.println("Someone is going to propose you very soon ");
		break;
		case"200":
			System.out.println("You will get your favorite job,");
		
		break;
		case"202":
			System.out.println("You will buy your favorite car very soon");
			
		break;
		
		case "220":
			System.out.println("Just work hard, you will graduate with good grade");
		
		break;
		case "112":
			System.out.println("There is one moment will change your life good way, be ready");
		
		break;
		case"122":
			System.out.println("Don't afraid of challanges, it will increase your confidence levels and desire for self-expression");
		break;
		
		case"211":
			System.out.println("Try to be as clear and to the point as possible. It will avoid confusion later on.");
		break;
		case"212":
			System.out.println("You will have your own new house very soon ");
		break;
		case"221":
		    System.out.println("You will get unexpected money shower");
		break;
		case"012":
			System.out.println("you will have long journey, pack your bag for long vacation");
		break;
		case"102":
			System.out.println("You will get big promotion ");
		break;
		
		case"021":
			System.out.println("Your dream will come true");
		
		break;
		case"120":
		    System.out.println("You will get big Gift on your next birthday,");	
		break;
		case"210":
			System.out.println("All your efforts regarding both your career and your personal life are now coming to a head");
		    System.out.println("A momentum is likely to build up which will lead to a major success for you.");
		break;
		
		case "201":
			System.out.println(" Your generosity will be identified greatly especially by the people who failed to recognize it earlier");
		break;
		default: System.out.println("Try again");
		
		}//close switch
		
		
			

	}
	//create timer, 
	//searched on google for timer 
	public static int startClock() {
		//create timer 
		Timer timer = new Timer();
		//create Scanner
		Scanner sc = new Scanner(System.in);
		int inputCommand = sc.nextInt();
		//create boolean 
		boolean startOrStop = false;
		if(inputCommand == 1) {
			startOrStop = true;
		}
		//create start stop scanner 
		while(!startOrStop) {
			System.out.print("Please enter 1 to start: ");
			
			inputCommand = sc.nextInt();
			if(inputCommand == 1) {
				startOrStop = true;
			}
		}
		//create time in milli second 
		long createdTimeInMilliSec = System.currentTimeMillis();
		while(startOrStop) {
			timer.schedule(new PrintVerticalLine(), 0, 500);
			inputCommand = sc.nextInt();
			if(inputCommand == 2) {
				// stop printing "or | " , press 2
				timer.cancel();
				startOrStop = false;
				long endTimeInMilliSec = System.currentTimeMillis();
				return (int)((endTimeInMilliSec - createdTimeInMilliSec)/1000);
			}
			
		}
		return 0;
	}//close start clock 
	
	static class PrintVerticalLine extends TimerTask {

		@Override
		public void run() {
			System.out.print(" |");
			
		}//close run
		
	}//close class
}//close class 



