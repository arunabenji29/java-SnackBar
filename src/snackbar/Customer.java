package snackbar;

public class Customer{
	private static int maxId=0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingId;

	public Snack(String name, int quantity, double cost,int vendingId){
		
		maxId += 1;
		id = maxId;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.vendingId = vendingId;

	}


	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setCost(double cost){
		this.cost = cost;
	}

	public double getCost(){
		return cost;
	}

	public void setVendingId(int id){
		this.vendingId = id;
	}

	public int getVendingId(){
		return this.vendingId;
	}

	public void addQuantity(int givenQuantity){
		this.quantity = this.quantity+givenQuantity;
	}

	public int buySnack(int buyQuantity){
    System.out.println("before buying: "+ this.quantity);
		this.quantity = this.quantity-buyQuantity;
    System.out.println("after buying: "+ this.quantity);
    return this.quantity;
	}

	public double totalCost(int quantity){
		double totalCost = quantity * this.cost;
		return totalCost;
	}
}