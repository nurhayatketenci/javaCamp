package javaCampGameProject;

public class CampaignManager {
	
	public void add(Campaign campaign) {
		   System.out.println(campaign.getCampaignName()+" Campaign added");
	   }
	   
	   public void delete(Campaign campaign) {
		   System.out.println(campaign.getCampaignName()+" Campaign deleted");
	   }
	   
	   public void update(Campaign campaign) {
		   System.out.println(campaign.getCampaignName()+" Campaign updated");
	   }
}
