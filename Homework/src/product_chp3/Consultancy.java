package product_chp3;

public class Consultancy extends Product{

	private String consultingType;
	
	public Consultancy(String name, String sku, String description, Boolean isGift,Float tax, Float price, String consultingType) {
		super(name, sku, description, isGift, tax, price);
		this.consultingType = consultingType;
	}
	
	public String getModel() {
		return consultingType;
	}
	
	public void setModel(String consultingType) {
		this.consultingType = consultingType;
	}

}
