package Optional;

public class GiftOptional {
	private String giftName;
	private int quantity;
	
	public GiftOptional(String gName, int n){
		this.giftName = gName;
		this.quantity = n;
	}

	public GiftOptional(){
		this.giftName = null;
		this.quantity = 0;
	}
	
	public GiftOptional(int n){
		this.giftName = null;
		this.quantity = n;
	}
	
	public String getGiftName() {
		return giftName;
	}

	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
