package product_chp3;

public class ClothProduct extends Product implements Locateable{

	private String sex;
	private String size;

	public ClothProduct(String name, String sku, String description, Boolean isGift,Float tax, Float price, String sex, String size) {
		super(name, sku, description, isGift, tax, price);
		this.sex = sex;
		this.size = size;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void getLocation() {
		System.out.println(super.getName() +"is located in Izmir");
	}

	@Override
	public void getDepot() {
		System.out.println(super.getName() +"is located in Italy");
		
	}

}
