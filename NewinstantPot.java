package cit111finalproject;
import java.util.Scanner;
public class NewinstantPot {

	private String materialName;
	//private String tempPresure;
	private String cookingMethod;
	//private String cookingTime;
	static int normalTemp ;
	public NewinstantPot() {
		
	}
	
	public NewinstantPot(String materialName,  String cookingMethod ) {
		this.materialName = materialName;
		//this.tempPresure = tempPressure;
		this.cookingMethod = cookingMethod;
		//this.cookingTime = cookingTime;
		this.normalTemp = normalTemp;
	}
	
	 public void displayPot() {
		 System.out.println("Raw material Name: " + this.materialName);
		 System.out.println("cooking Method: " + this.cookingMethod);
		// System.out.println("Pressure: " +  this.tempPresure);
	    // System.out.println("Cooking Time: " + this.cookingTime);
	
	}// close displayPot methods 
	
	 
	
	 }//close class
