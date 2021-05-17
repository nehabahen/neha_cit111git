import java.util.Scanner;

public class basicBodyKnowledge {
	
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int playerReply;
		System.out.println("Hello! Weolcome to the biology Quize...\nLet's learn about basic human body systems. ");
		System.out.println("let's stsrt with Frist basic Queston. \n How many Systems are there in the human body");
		playerReply= keyboard.nextInt();
		if(playerReply==11) {
			System.out.println("Yeep, you are Right There are 11 systems in human body");
			System.out.println("(1) Skeletal System. \n(2) Endocrine System \n(3) Cardiovascular System \n(4) Integumentary system");
			System.out.println("(5) Urinary system \n(6) Nervous system \n(7) Digestive system \n(8) Muscular system ");
			System.out.println("(9) Muscular system \n(10) Immune system \n(11) Respiratory System ");
			System.out.println(" Here few quetions from some of those systems");
			System.out.println(" hit enter for que");
			//playerReply= keyboard.nextInt();
			//System.out.println();
			//bodySystem();
			startQuiz();
		}// close if
		else {
			System.out.println("Nope!!!!  There are 11 systems in human body");
			System.out.println("(1) Skeletal System. \n(2) Endocrine System \n(3) Cardiovascular System \n(4) Integumentary system");
			System.out.println("(5) Urinary system \n(6) Nervous system \n(7) Digestive system \n(8) Muscular system ");
			System.out.println("(9) Muscular system \n(10) Immune system \n(11) Respiratory System ");
			System.out.println(" Here few quetions from some of those systems");
			startQuiz();
		}// close else
		

		
		
	}//close main 

	public static void startQuiz() {
		System.out.println("Do you want to start Quiz???? \n Hit 1 to start");
		int playerReply;
		Scanner keyboard=new Scanner(System.in);
		playerReply= keyboard.nextInt();
		switch (playerReply) {
		
		case 1:  System.out.println("OK let's start quize. ");
		System.out.println("select the number whatever you want to learn about");
		bodySystem();
		break;
		}
		
	}// close start quiz
	
	
	
	public static void bodySystem() {
		System.out.println("(1) Skeletal System. \n(2) Endocrine System \n(3) Cardiovascular System \n(4) Integumentary system");
		System.out.println("(5) Urinary system \n(6) Nervous system \n(7) Digestive system");
		int playerReply;
		Scanner keyboard=new Scanner(System.in);
		playerReply= keyboard.nextInt();
		switch (playerReply) {
		case 1:
			System.out.println("Quetion=1");
			System.out.println(" How many bones are in newborn body? \n(1) 206 \n(2) 270 \n(3) 200 \n(4) 276");
			playerReply= keyboard.nextInt();
		if(playerReply==2) {
			System.out.println("Correct! There are around 270 bones at birth.");
			System.out.println("This total decreases to around 206 bones by adulthood after some bones get fused together");
			
		}//close if 
		else {
			System.out.println("NOT QUITE RIGHT, There are around 270 bones at birth. ");
			System.out.println("This total decreases to around 206 bones by adulthood after some bones get fused together");
		}//close else
		
		System.out.println("Quetion=2");
		System.out.println("How many types of bone are there?");
		System.out.println("(1) 8 \n(2) 9 \n(3) 4  \n(4) 8");
		playerReply= keyboard.nextInt();
		if (playerReply==3) {
		System.out.println("CORRECT,There are four different types of bone in the human body:\r\n"
				+ "Long bone – has a long, thin shape. ...\r\n"
				+ "Short bone – has a squat, cubed shape. ...\r\n"
				+ "Flat bone – has a flattened, broad surface. ...\r\n"
				+ "Irregular bone – has a shape that does not conform to the above three types.");
		
		}//close if
		else {
			System.out.println("NOT QUITE CORRECT..There are four different types of bone in the human body:\n"
					+ " \"Long bone – has a long, thin shape. ...\n"
					+ " \"Short bone – has a squat, cubed shape. ...\n"
					+ " \"Flat bone – has a flattened, broad surface. ...\n"
					+ " \"Irregular bone – has a shape that does not conform to the above three types.");
		}//close else
		System.out.println("Quetion=3");
		System.out.println("What’s the smallest bone in the body?");
		System.out.println("(1) Stapes \n(2) ulna \n(3) Femur \n(4) fibula ");
		playerReply= keyboard.nextInt();
		if(playerReply==1) {
		System.out.println("CORRECT");
		System.out.println("the sound waves vibrate three bones known as the ossicles, which are made up of the malleus, the incus, and the stapes");
		System.out.println("The stapes is the smallest bone in the human body.");		
			
		}//close if
		else {
		System.out.println("NOT QUITE RIGHT");
		System.out.println("the sound waves vibrate three bones known as the ossicles, which are made up of the malleus, the incus, and the stapes");
		System.out.println("The stapes is the smallest bone in the human body.");
		
		}//close else
		
		System.out.println("Quetion=2. \n This gland is sometimes called the master gland, though it is only about the size of a pea:");
		
		
		
		}
	
		
		
		
		
		
	
		
		
		
	}//close body system
}//close public class
