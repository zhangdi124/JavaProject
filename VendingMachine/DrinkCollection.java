package vendingMachine;
import java.text.NumberFormat;

public class DrinkCollection {
/** Represents a collection of Drink. */
	
	private Drink[] collection;
	private int drinkQuantity;
	private double drinkPrice;
	private double drinkTotalCost;
	private int size = 30;
	
	/**Constructor: creates an initially empty collection.
	 * 
	 */
	public DrinkCollection(){
		collection = new Drink[300];
		drinkQuantity = 0;
		drinkTotalCost = 0;
	}
	
	/** Add a method to increase the drink quantity
	 * 
	 * @return
	 */
	private void increasedrinkQuantity(){
		Drink[] temp = new Drink [size];
		for (int Drink = 0; Drink < collection.length; Drink++ )
			temp [Drink]= collection[Drink];
			collection = temp;
	}
	
	/** Add drink to the collection when there are empty space
	 *  in the vending machine.
	 */
	public void addDrink(String name, double foodPrice, boolean diet){
		
		if (drinkQuantity < collection.length)
			increasedrinkQuantity();
		
		collection[drinkQuantity] = new Drink(name, drinkPrice, diet);
			
		drinkTotalCost += drinkPrice;
		drinkQuantity ++;
	}
	
	/** Return a report describing 
	 *  drink Collection.
	 */
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String report ="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Drink Collection\n\n";
		report += "Drink Quantity: " + drinkQuantity + "\n";
		report += "Total Cost: " + fmt.format(drinkTotalCost) + "\n";
		
		report += "\n\nFood List:\n\n";
		for (int drink = 0; drink < drinkQuantity; drink++)
			report  += collection[drink].toString() + "\n";
		
		return report;
	}
	
}
