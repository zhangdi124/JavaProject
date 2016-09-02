package vendingMachine;

public class Main {

	/** Create FoodCollection and DrinkCollection objects
	 *  and add Food or Drink when stock is low. Prints reports
	 *  on the status of the collections. 
	 *  
	 */
	public static void main(String[] args) {
		FoodCollection food = new FoodCollection();
		
		food.addFood("candy bar", 3.00, false);
		food.addFood("MM", 5.00, false);
		food.addFood("bear Burgar", 15.00, true);
		
		System.out.println(food);
		
		DrinkCollection drink = new DrinkCollection();
		
		drink.addDrink("diet coke", 2.00, true);
		drink.addDrink("Sprit", 1.50, false);
		drink.addDrink("Green Tea Latte", 5.37, true);
		
		System.out.println(drink);

	}

}
