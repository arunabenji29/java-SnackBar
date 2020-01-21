package snackbar;

public class VendingMachine{
	private static int maxId = 0;
	private int id;
	private String name;

	public VendingMachine(String name){
		maxId += 1;
		id = maxId;
		this.name = name;
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
}