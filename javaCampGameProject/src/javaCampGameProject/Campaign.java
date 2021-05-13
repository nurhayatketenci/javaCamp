package javaCampGameProject;

public class Campaign {
   private int campaignId;
   private String campaignName;
   private Double discount;
   
   public Campaign(int campaignId, String campaignName, Double discount) {
	super();
	this.campaignId = campaignId;
	this.campaignName = campaignName;
	this.discount = discount;
}

public int getCampaignId() {
	return campaignId;
}

public void setCampaignId(int campaignId) {
	this.campaignId = campaignId;
}

public String getCampaignName() {
	return campaignName;
}

public void setCampaignName(String campaignName) {
	this.campaignName = campaignName;
}

public Double getDiscount() {
	return discount;
}

public void setDiscount(Double discount) {
	this.discount = discount;
}
   
}
