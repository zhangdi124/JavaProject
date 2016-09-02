package rock;
import java.util.Scanner; 
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		String answer;   // User's play 
		String personPlay;
		String computerPlay =" "; // Computer's play
		int computerInt;  // Randomly generated number used to determine computer's play 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your play: ");
		answer = scan.nextLine(); // Get player's play -- not that this is stored as a string 
		personPlay = answer.toUpperCase(); // make player's play uppercase for ease of comparison 
		
		Random generator = new Random ();
		computerInt = generator.nextInt(3); // Generate computer's play (0,1,2)
		System.out.println("Computer randomly generated answer is: "+computerInt);// Translate computer's randomly generated play to string switch (computerInt)
		
	
		if (computerInt ==0)
		{
			computerPlay = "R";
			System.out.println("My play is: "+computerPlay);
		
		}
		
		if (computerInt == 1)
		{
			computerPlay ="P";
			System.out.println("My play is: "+computerPlay);
		}
		if (computerInt == 2)
		{
			computerPlay ="S";
			System.out.println("My play is: "+computerPlay);
		}


		
		//Print computer's play
		//See who won. Use nested ifs instead of &&.
		if (personPlay.equals(computerPlay))
			System.out.println("It's a tie!");
		else if (personPlay.equals("R"))
			 if (computerPlay.equals("S"))
				System.out.println("Rock crushes scissors. You win!"); 
			 else if (computerPlay.equals("P"))
				System.out.println("Paper wrapps rocks. I win!");
			
			
			 
					if (personPlay.equals("P"))
						if (computerPlay.equals("R"))
							System.out.println("Rock wrapps papers. I win!!");
						else if (computerPlay.equals("S"))
							System.out.println("Scissor cuts papers. I win!!");
			 
			 
					if (personPlay.equals("S"))
						if (computerPlay.equals("P"))
							System.out.println("Scissor cuts papers. You win!!!");
						else if (computerPlay.equals("R"))
							System.out.println("Rock crushes scissors. I win!!!");		
			
				
		
	}



}
