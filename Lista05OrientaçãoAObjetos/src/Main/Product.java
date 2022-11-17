package Main;

public class Product {

	public String productName;
	public float costPrice = 0;
	public float salePrice = 0;
	public float profitMargin = 0;
	public float companyExpenses = 0;
	
	public void calculationOfProfitMargin() {
		
		this.profitMargin = ((this.salePrice - (this.costPrice + this.companyExpenses)) / this.salePrice) * 100;
	}
}

