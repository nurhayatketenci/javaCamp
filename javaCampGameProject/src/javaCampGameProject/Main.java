package javaCampGameProject;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {

		User user=new User(1,"Nurhayat","Ketenci",2000,"5645646544");
		UserManager userManager=new UserManager(new UserCheckManager());
		userManager.add(user);
		
		Campaign campaign=new Campaign(1,"GamersDay",99.9);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);

		
	}

}
