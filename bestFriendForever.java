
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHAUHAN
 */
public class bestFriendForever 
{
   
    public static void main(String[] args){
     
      int finalScore=0;
      int playerReply;
              
      
      Scanner inputScanner;
      
      //creat scanner
      inputScanner = new Scanner(System.in);
      
      //print welcome massage 
      System.out.println("Hello! Welcome to the BFF game!");
      System.out.println("My name is Barbie and looking for sweet personality friend.");
      System.out.println("Please read carefully to Ans the Que:");
      
      //ask first Question 
      
      System.out.println("please choose the number and hit the Enter.");
      System.out.print("Que_1: ");
      System.out.println("What is your favorite Chocolate?");
      //give options
      System.out.println("1: KitKat");
      System.out.println("2: Reese's");
      System.out.println("3: Godiva");
      System.out.println("4: Kisses");
      System.out.println("5: Dairy Milk");
      System.out.println("6: Other");
      int kitkat=20;
      int reeses=30;
      int godiva=40;
      int kisses=50;
      int dairyMilk=60;
      int other=-5;
     
      playerReply= inputScanner.nextInt();
      
      if(playerReply==1)
      {
      // 1 Kitkat
      //chocoScore=chocoScore+20;
       finalScore = finalScore + 20;
      
      System.out.println("Kitkat: "+ kitkat);
      
      }//close 1 if statement
      else if (playerReply==2)
      {
          
      finalScore=finalScore+30;
      //chocoScore=chocoScore+30;
      System.out.println("Reese's: "+ reeses);
      
      
       }//close else 1 ststement
      else if (playerReply==3){
          finalScore=finalScore+40;
          System.out.println("Godiva: "+ godiva);
          
      }//close if else godiva
      else if (playerReply==4)
      {
          finalScore=finalScore+50;
          System.out.println("Kisses: "+ kisses);
          
      }//close statement else if kisses
      else if(playerReply==5)
      {
          finalScore=finalScore+60;
          System.out.println("Dairy Milk: " +dairyMilk);
          
      }//close else if statment dairymilk
      else if (playerReply==6)
      {
          System.out.println("other: "+other);
          finalScore=finalScore-5;
      }//close if statment
       else if(playerReply>6)
       {
             System.out.println("You are not getting any points, it has to be under 1 to 6.");
      
       }//close else if for not get point
    
      
       //ask ssecond question
       System.out.print("Que_2: ");
       System.out.println("waht is your favorite store for shopping?");
      //print option for quetion 2
       System.out.println("1: Target");
       System.out.println("2: JCpenny");
       System.out.println("3: Old navy");
       System.out.println("4: Macy's");
       System.out.println("5: Sears");
       System.out.println("6: Other");
       int Target=20;
       int jcpenny=30;
       int oldNavy=40;
       int macys=50;
       int sears=10;
       int otherr=-5;
       playerReply= inputScanner.nextInt();
     
      if(playerReply==1){
          System.out.println("Target: "+ Target);
          finalScore = finalScore + 20;
      }//if statement end target
      
          else if(playerReply==2){
              finalScore=finalScore+30;
          System.out.println("JCpenny: " +jcpenny);
                  
                  }//close else2nd jcpenny
          else if(playerReply==3){
              finalScore=finalScore+40;
              
            System.out.println("Old Navy: "+oldNavy);  
          } //close que 2 if statment old navy
          else if(playerReply==4){
              finalScore=finalScore+50;
             System.out.println("Macy's: "+ macys);
              
          }//close if statement
          else if(playerReply==5){
              finalScore=finalScore+10;
              System.out.println("Sears: "+sears);
              
          }//if else close statment
          else if (playerReply==6){
           System.out.println("Other: "+otherr);
           finalScore=finalScore-5;
              
          }//close if else statment
          else if(playerReply>6){
             System.out.println("You are not getting any points, it has to be under 1 to 6.");
              
          }//close if statment
      //question 3
      System.out.print("Que_3: ");
      System.out.println("What is your favorite Subject?");
      System.out.println("1: Maths");
      System.out.println("2: Science");
      System.out.println("3: Arts");
      System.out.println("4: Physical Education");
      System.out.println("5: Computer");
      System.out.println("6: Other");
      int maths=10;
      int scie=20;
      int arts=30;
      int phyEdu=40;
      int comp=50;
      int othr=-5;
      playerReply=inputScanner.nextInt();
      // creat if statement for que 3
      if(playerReply==1)
      {
      System.out.println("Maths: "+maths);
      finalScore=finalScore+10;
      }//close if statements math 
      else if(playerReply==2)
      {
       System.out.println("Science: "+scie);
       finalScore=finalScore+20;
          
      } //close if statments science
      else if (playerReply==3)
      {
       System.out.println("Arts: "+arts);
       finalScore=finalScore+30;
      }//close if statment arts
      else if (playerReply==4)
      {
       System.out.println("Physical Education: "+phyEdu);
       finalScore=finalScore+40;  
      }//close if statment, physical education
      else if(playerReply==5)
      {
       System.out.println("Computer: "+comp);
       finalScore=finalScore+50;    
      }//close if statment, comp
      else if(playerReply==6)
      {
          System.out.println("Other: "+othr);
      finalScore=finalScore-5;
      
      }//close if statment,other
       else if(playerReply>6){
             System.out.println("You are not getting any points, it has to be under 1 to 6.");
       }//close if statment for not getting points
    
      //creat question 4 last que
      System.out.print("Que_4: ");
      System.out.println("Do you like coding?");
      System.out.println("1: Yes");
      System.out.println("2: No");
      int yes=45;
      int no=-15;
      
      playerReply=inputScanner.nextInt();
      if(playerReply==1)
      {
          System.out.println("Yes: "+yes);
          finalScore=finalScore+45;
       }//if statment end, yes
         else if(playerReply==2)
       {
          System.out.println("No: "+no);
          finalScore=finalScore-15;   
       }//end else if statment ,no
          System.out.println("Final Score: "+finalScore);
       
       if(finalScore>60)
       {
           System.out.println("yey! You won the BFF game, Let's be Friends.");
           
           
       }//close if last statment
       else
       {
           System.out.println("SORRY! We can't be friends, plz try again.");
           
       }//close else statment
       
          
      
      
      
  }//close main
          
           
    
}//close class

