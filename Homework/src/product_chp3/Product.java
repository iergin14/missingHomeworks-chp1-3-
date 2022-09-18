package product_chp3;

public class Product {

	private String name;
	private String sku;
	private String description;
	private Boolean isGift;
	private Float tax;
	private Float price;
	
	
	public Product(String name, String sku, String description, Boolean isGift,Float tax, Float price) {
		this.name = name;
		this.sku = sku;
		this.description = description;
		this.isGift = isGift;
		if(isGift) {
			this.tax = (float) 0.0;
			this.price = (float) 0.0;
		}else {
			this.tax = tax;
			this.price = price;	
		}
	}

	public String getSku() {
		return this.sku;
	}

	public String getDescription() {
		return this.description;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}
	
	
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	public Boolean getIsGift() {
		return isGift;
	}

	public void setIsGift(Boolean isGift) {
		this.isGift = isGift;
	}


}
