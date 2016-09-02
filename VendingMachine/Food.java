package vendingMachine;
import java.text.NumberFormat;

public class Food {
	
	private String name;
	private double foodPrice;
	private boolean sugarFree;
	
	/** create a new Food with specified information.
	 * 
	 */
	public Food(String name, double foodPrice, boolean sugarFree){
		this.name = name;
		this.foodPrice = foodPrice;
		this.sugarFree = sugarFree;
	}
	
	/** returns a string description of this Food.
	 * 
	 */
	
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String description;
		
		description = fmt.format(foodPrice)+ "\t" + name +"\t";
		if(sugarFree)
			description += "\t"+ "Sugar Free";
		
		return description;
	}

}
