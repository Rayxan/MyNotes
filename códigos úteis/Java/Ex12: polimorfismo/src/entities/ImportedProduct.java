package entities;

public class ImportedProduct extends Product {
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public double totalPrice() {
		return getPrice() + getCustomFee();
	}
	
	@Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + " (Custom fee: $ " + String.format("%.2f", getCustomFee()) + ")";
	}
}
