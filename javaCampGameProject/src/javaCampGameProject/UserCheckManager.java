package javaCampGameProject;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealUser(User user) throws RemoteException {
 
		KPSPublicSoapProxy kpsProxy=new KPSPublicSoapProxy();
		boolean result=kpsProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityNumber()),user.getFirstName().toUpperCase(),
				user.getLastName().toUpperCase(),user.getBirthOfDate());
		return result;
	}

	

}
