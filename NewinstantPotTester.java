package cit111finalproject;

import java.util.Scanner;

//instantPot is kind of pressure cooker
//with many methods

public class NewinstantPotTester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	int playerReply;
	//boolean playerReply= false;
		
		Scanner sc = new Scanner(System.in);
		
      System.out.println("welcome to instantPot pressure cooker cooking kitchen \n Let's cook in InstantPot");
      
      System.out.println(" so first you Turn ON the pressure cooker \n Press 1 to start and 2 to OFF or quit cooking");
      playerReply= sc.nextInt();
      
     // if(playerReply==2) {
   	  // System.out.println("Thank you");
   	   
   	   
       if(playerReply==1) { 
   	   System.out.println("OK here all information");
   	   
      
      
      
     // playerReply= sc.nextInt();
       System.out.println("what do you want to cook Today");
       System.out.println("here some options");
       System.out.println("(1) veggie \n(2) Rice \n(3) Beans \n(4) Yogurt  \n(5) Boiled \n(6) Broth");
       playerReply= sc.nextInt();
       
    // create switch statment
       
       switch (playerReply) {
       case 1: 
       NewinstantPot.normalTemp = 10;
    	  NewinstantPot veggies = new NewinstantPot("Vegetables","Steam mode");
 	     veggies.displayPot();
    	  
 	     adjustTemp();
 	     
		
		break;
		case 2:
			NewinstantPot.normalTemp = 14;
		NewinstantPot rice = new NewinstantPot("Rice","Pressure cook mode");
		rice.displayPot();
		adjustTemp();
		break;
		
		case 3:
			NewinstantPot.normalTemp = 30;
		NewinstantPot beans = new NewinstantPot("Beans", "Pressure Cook mode");
		beans.displayPot();
		adjustTemp();
		break;
		
		case 4:
			NewinstantPot.normalTemp = 12;
		NewinstantPot saute = new NewinstantPot("veggies","saute (keep warm) mode");
		saute.displayPot();
		adjustTemp();
		break;
		
		case 5:
			NewinstantPot.normalTemp = 16;
		NewinstantPot potato = new NewinstantPot("Mashed Potato", "Pressure Cook mode");
		potato.displayPot();
		adjustTemp();
		break;
		
		case 6:
			NewinstantPot.normalTemp = 40;
		NewinstantPot broth = new NewinstantPot("Vegetable Broth", "Boiling Mode mode");
		broth.displayPot();
		adjustTemp();
		break;
		
       }
       
       }// close if statement
       else {
    	    
    	   	   System.out.println("Thank you");
       }
	}
	public static void adjustTemp() {
		 
		 int lowTemp ;
		 lowTemp= NewinstantPot.normalTemp*2;
		 int highTemp = NewinstantPot.normalTemp/2;
		 int playerReply;
	     Scanner sc = new Scanner(System.in);
	     System.out.println(" Choose your Temprature for Cooking");
	  
		System.out.println("(1) Law \n(2) Normal \n(3) High");
		playerReply= sc.nextInt();
		 if (playerReply==1) {
			 //System.out.println(lowTemp);
			 System.out.println("Cooking Time with Low Temp:  " + lowTemp + " Min");
			 System.out.println("Yeeey!!  Your Food will be ready in: " + lowTemp+ " Min");
		 } else if (playerReply==2) {
			// System.out.println(NewinstantPot.normalTemp);
			
			 System.out.println("Cooking Time with Normal Temp: " + NewinstantPot.normalTemp + " Min");
			 System.out.println("Yeeey!!  Your Food will be ready in: " + NewinstantPot.normalTemp + " Min");
		 }
		 
			 else if(playerReply==3) {
				 //System.out.println(highTemp);
				 System.out.println("Cooking Time with High Temp: " + highTemp + " Min");
				 System.out.println("Yeeey!!  Your Food will be ready in: " + highTemp + " Min");
			 }
			
			 }// close adjustTemp method
		

	}// close class

