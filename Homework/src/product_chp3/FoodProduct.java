package product_chp3;
import java.util.Date;

public class FoodProduct extends Product implements Locateable{

	private Date productionDate;
	private int life;
	
	public FoodProduct(String name, String sku, String description, Boolean isGift,Float tax, Float price, Date productionDate, int life) {
		super(name, sku, description, isGift, tax, price);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	@Override
	public void getLocation() {
		System.out.println(super.getName() +"is located in Istanbul");
		
	}

	@Override
	public void getDepot() {
		System.out.println(super.getName() +"is storaged in Germany");
	}

}
