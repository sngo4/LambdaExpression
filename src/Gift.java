

public class Gift {
	String Name;
	int Quantity;
	
	public Gift(String name, int quantity){
		this.Name = name;
		this.Quantity = quantity;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
