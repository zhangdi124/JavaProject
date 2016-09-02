package vendingMachine;
import java.text.NumberFormat;

public class Drink {

	
	private String name;
	private double drinkPrice;
	private boolean diet;
	
	/** create a new Drink with specified information.
	 * 
	 */
	public Drink(String name, double drinkPrice, boolean diet){
		this.name = name;
		this.drinkPrice = drinkPrice;
		this.diet = diet;
	}
	
	/** returns a string description of this Drink.
	 * 
	 */
	
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String description;
		
		description = fmt.format(drinkPrice)+ "\t" + name +"\t";
		if(diet)
			description += "\t"+ "diet";
		
		return description;
	}

}

