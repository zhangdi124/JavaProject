package vendingMachine;
import java.text.NumberFormat;

public class FoodCollection {
/** Represents a collection of Food. */
	
	private Food[] collection;
	private int foodQuantity;
	private double foodPrice;
	private double foodTotalCost;
	private int size = 30;
	
	/**Constructor: creates an initially empty collection.
	 * 
	 */
	public FoodCollection(){
		collection = new Food[300];
		foodQuantity = 0;
		foodTotalCost = 0;
	}
	
	/** Add a method to increase the food quantity
	 * 
	 * @return
	 */
	private void increasefoodQuantity(){
		Food[] temp = new Food [size];
		for (int Food = 0; Food < collection.length; Food++ )
			temp [Food]= collection[Food];
			collection = temp;
	}
	
	/** Add food to the collection when there are empty space
	 *  in the vending machine.
	 */
	public void addFood(String name, double foodPrice, boolean sugarFree){
		
		if (foodQuantity < collection.length)
			increasefoodQuantity();
		
		collection[foodQuantity] = new Food(name, foodPrice, sugarFree);
			
		foodTotalCost += foodPrice;
		foodQuantity ++;
	}
	
	/** Return a report describing 
	 *  Food Collection.
	 */
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String report ="~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
		report += "Food Collection\n\n";
		report += "Food Quantity: " + foodQuantity + "\n";
		report += "Total Cost: " + fmt.format(foodTotalCost) + "\n";
		
		report += "\n\nFood List:\n\n";
		for (int food = 0; food < foodQuantity; food++)
			report  += collection[food].toString() + "\n";
		
		return report;
	}
	
}
