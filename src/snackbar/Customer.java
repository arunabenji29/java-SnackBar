package snackbar;

public class Customer{
	private static int maxId=0;
	private int id;
	private String name;
	private double cashOnHand;

	public Customer(String name, double cashOnHand){
		maxId += 1;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}


	public void addCash(double money){
		this.cashOnHand = this.cashOnHand + money;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public double getCashOnHand(){
		return cashOnHand;
	}

	public double buy(double moneySpent){
		this.cashOnHand -= moneySpent;
    return cashOnHand;
	}
}