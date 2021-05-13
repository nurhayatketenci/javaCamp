package javaCampGameProject;

import java.rmi.RemoteException;

public class UserManager {
	public UserCheckManager _userCheckManager;
	
	public UserManager(UserCheckManager _userCheckManager) {
		super();
		this._userCheckManager = _userCheckManager;
	}
	
	public void add(User user) throws RemoteException {
		if(_userCheckManager.checkIfRealUser(user)) {
			System.out.println("User Added");
		}else {
			System.out.println("User information does not match");
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" User deleted");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" User updated");
	}



}
