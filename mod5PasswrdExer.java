/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author CHAUHAN
 */
public class mod5PasswrdExer 
{
   //creat main class
    public static void main(String[] Whteveruwant)
{
  
 //creat scanner 
Scanner inputScanner = new Scanner(System.in);
int attempts=0;//declare variable for attempts
String Password= "j@v@" ;//declare variable for string password
String userPassword=" ";
//creat while loop 
while(attempts<3){
    //print massege to enter password
    System.out.println("Please, Enter your correct password: ");
    //creat scnner 
    userPassword= inputScanner.nextLine();
    //creat if statement for correct password
   if(userPassword.equals(Password)){
    System.out.println("You entered the correct password.");
    attempts=3;//stope while if ans correct
       
   }//close if
   //creat else statement for wrong password 
   else{
       //print masseges for wrong password
       System.out.println("Sorry! you entered invalid password.");
       System.out.println("you have " + (3-attempts)+  " attempts left");
       System.out.println("Total numbers of attempts allowed 3!");
       attempts++;//adding attepts for wrong password
   }//close else
}//close while 
    //while loop end
    //creat if stetment for last maasges afte while loop end
   if(userPassword.equals(Password)){
       System.out.println("********************************************");
       System.out.println("     Bank Account number: 0123456789");
       System.out.println("     Available Balance($): 5,000,000.98");
       System.out.println("     Pending Deposit($):   3,000,000.75");
       System.out.println("*********************************************");
   }//close second if
      //creat else for last mssage after while loop end
   else{
       System.out.println("Sorry! You entered wrong password 3 times.");
       
   }//close second else
}//close main mathod
    
}//close public class
