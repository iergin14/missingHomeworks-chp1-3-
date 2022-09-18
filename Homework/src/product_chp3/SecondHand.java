package product_chp3;

public class SecondHand extends Product implements Locateable{
	
	private String model;
	private String department;
	
	public SecondHand(String name, String sku, String description, Boolean isGift,Float tax, Float price, String model, String department) {
		super(name, sku, description, isGift, tax, price);
		this.model = model;
		this.department = department;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getLocation() {
		System.out.println(super.getName() +"is in the " + this.getDepartment() + " department.");
		
	}

	@Override
	public void getDepot() {
		System.out.println(super.getName() +" is not in the depot");
		
	}

}
