package execise5;

import java.util.Scanner;

public class mystrydoor2 
{
	public static void main(String[] args) 
	{
		
   //create scanner
	Scanner keyboard = new Scanner(System.in);	
	//print welcome message 	
	System.out.println(" Welcome to the Mystery door game ");
	System.out.println(" you have to Answer following Riddles to get bigest mystery door");
	int totalPoints=0;//declare value for total points
	int playerReply;
	// declare player reply
	//print questions and options 
	System.out.println("Quetion 1");
	System.out.println("if eggs are $0.12 a dozen, how many eggs can you get for a doller? ");
	System.out.println("(1) 100 ");
	System.out.println("(2)  8 ");	
	System.out.println("(3)  10");
	int ans11=20;
	int ans12=0;
	int ans13=0;
	//declare variable for options
	playerReply= keyboard.nextInt();
	//create if statements
	if (playerReply==1) {
		System.out.println("correct, you got" + ans11);
		totalPoints=totalPoints+ans11;
	}//close first if
	else 
	{
		System.out.println("Sorry no points:-( try again!");
	}//close first else 
	//prints @2nd Questions
	System.out.println("Quetion 2");
	System.out.println(" How many month(s) has 28 days?");
	System.out.println("(1) 6 ");
	System.out.println("(2) 12 \n(3) 0");
	int ans21=0;
	int ans22=20;
	int ans23=0;
	playerReply= keyboard.nextInt();
	//create if statements for 2nd questions 
	if (playerReply==2)
	{
		totalPoints= totalPoints+ans22;
		// adding points 
		System.out.println("correct, you got:" + ans22);
		//System.out.println(totalPoints);
		
		
	}//close second if
	else 
	{
		System.out.println("Sorry no points:-( Try again!");
		
	}//close second else 
	// create Questions 3
	System.out.println(" Quetion 3: \n How much water is in an empty glass that is 10cm high and has a diameter of 5cm?");
	System.out.println("(1) 200ml \n(2) 100ml \n(3) 0ml ");
	int ans31=0;
	int ans32=0;
	int ans33=20;
	playerReply= keyboard.nextInt();
	if(playerReply==3) 
	{
		System.out.println("correct: you got:" +ans33);
		totalPoints=totalPoints+ans33;
	}//close third if
	
	else
	{
		System.out.println("Soory no poits:-( Try again!");
		
	}//close third else 
	
	System.out.println("Final score: "   +   totalPoints);
	
	//create switch statements 
	switch (totalPoints)
	{
	 
	//for total points 20 smallest Mystery door 
	case 20: System.out.println(" Oooooo! THIS IS SMALLEST MYSTERY DOOR!");
	
     System.out.println(" *==============* \n |\t|\t| \n |\t|\t|\n |\t|\t| \n |\t|\t| \n |\t|\t|");
	 System.out.println(" *==============*");
	
	 System.out.println("you Just Got $10,000. \nYou are still *40* points away from the bigesst Mystery Door. " );
	 System.out.println("Please TRY again");
	
	break;
	//for total points 40 medium mystery door
	case 40: System.out.println(" Hmmmmmm, THIS IS MEDIUM MYSTERY DOOR!");
	
	System.out.println("  ++++++++++++++++ \n ||\tM\t|| \n ||\tE\t|| \n ||\tD\t|| \n ||\tI\t|| \n ||\tU\t|| \n ||\tM\t|| \n ||\t\t||");
	System.out.println("  ++++++++++++++++");
	System.out.println("Ok, still, You Just got $10,000 and iphon 12 pro ");
	System.out.println("You are still *20* points away from bigest Mystery Door.  \nPlease Try again. ");
	
	break;
	//for total points 60 biggest mystery door
	case 60: System.out.println("Yeeey!!!! THIS IS BIGGEST MYSTERY DOOR!!!");
	System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("  @\t\t$\t\t@ \n  @\t\t$\t\t@ \n  @\t\t$\t\t@ \n  @\t\tM\t\t@ \n  @\t\tY\t\t@  \n  @\t\tS\t\t@ \n  @\t\tT\t\t@ ");
	System.out.println("  @\t\tE\t\t@ \n  @\t\tR\t\t@ \n  @\t\tY\t\t@ \n  @\t\t$\t\t@ \n  @\t\t$\t\t@");
	System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println(" CONGRATULATION! You Got $500,0000, one big HOUSE one luxury CAR, and all FURNITURE for your house");
	System.out.println(" Thank you");
	
	}
	
	
	
	}//close main 
	
	

}//close class