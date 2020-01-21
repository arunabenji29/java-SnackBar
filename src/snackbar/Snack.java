package snackbar;

public class Snack
{
	public int maxId=0;
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

	public VendingMachine getVendingId(){
		return this.vendingId;
	}

	public void addQuantity(int givenQuantity){
		this.quantity = this.quantity+givenQuantity;
	}

	public void buySnack(int buyQuantity){
		this.quantity = this.quantity-buyQuantity;
	}

	public int totalCost(int quantity){
		double totalCost = quantity * this.cost;
		return totalCost;
	}

}