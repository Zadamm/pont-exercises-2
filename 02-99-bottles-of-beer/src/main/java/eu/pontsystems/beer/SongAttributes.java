package eu.pontsystems.beer;

public class SongAttributes {
	private String bottleType;
	private String liquidType;
	
	public SongAttributes() {
		bottleType = "bottle";
		liquidType = "beer";
	}
	
	
	public SongAttributes(String bottleType, String liquidType) {
		this.bottleType = bottleType;
		this.liquidType = liquidType;
	}


	public String getQuantity(int q) {
		String quantity = "";
		if(q>= 1) quantity = Integer.toString(q);
		else if(q == 0) quantity = "no more";
		else quantity = "99";
		return quantity;
	}
	
	public String getContainer(int q) {
		if(q != 1) return bottleType + "s";
		else return bottleType;
	}
	
	public String getAction(int q) {
		if(q!=0) return "Take one down and pass it around, ";
		else return "Go to the store and buy some more, ";
	}
	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;
	}
	public String getLiquidType() {
		return liquidType;
	}
	public void setLiquidType(String liquidType) {
		this.liquidType = liquidType;
	}
}
