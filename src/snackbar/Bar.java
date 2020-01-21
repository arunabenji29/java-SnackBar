package snackbar;

public class Bar
{
	public static void main(String[] args){

		Customer jane = new Customer("Jane",45.25);
		Customer bob = new Customer("Bob",33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips",36,1.75,food.getId());
		Snack choc = new Snack("Chocolate Bar",36,1.00,food.getId());
		Snack pretzel = new Snack("Pretzel",30,2.00,food.getId());

		Snack soda = new Snack("Soda",24,2.50,drink.getId());
		Snack water = new Snack("Water",20,2.75,drink.getId());

    // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
	    System.out.println(soda.totalCost(3));
	    System.out.println(soda.buySnack(3));
	    System.out.println(jane.getCashOnHand());
	    System.out.println(jane.buy(soda.totalCost(3)));

	}
}