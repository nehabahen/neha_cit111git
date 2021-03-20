
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
public class mod5RetirementPlan 
{
    //creat Retirement plan
    //and get social Security 
    //creat main mathod 
      public static void main(String[] args)
      {
       double age;
       //creat  scanner 
       Scanner socialSecurity =new Scanner(System.in); 
       

         //creat while loop
       while(true)
       {
           System.out.println("Please, Enter your right age: ");
           //creat Scanner 
           age=socialSecurity.nextDouble();
           //creat if statment for compare age
           if(age < 65 && age > 0)
           {
               //print massges 
               System.out.println("Sorry keep Working! ");
           }else if(age > 65)
           {
               System.out.println("Wahoo! Grab the Newspaper and Martini!!!");
           }else{
               System.out.println("You entred Invalid age");
           }//end second else stmt

       }//end second while
      } //public Static void main(String[] args);{
     
 }//close public class
