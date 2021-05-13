package javaCampGameProject;

public class Sale {
	private int saleId;
	private int userId;
	private int productId;
	private int totalPrice;
	
	public Sale(int saleId, int userId, int productId, int totalPrice) {
		super();
		this.saleId = saleId;
		this.userId = userId;
		this.productId = productId;
		this.totalPrice = totalPrice;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
