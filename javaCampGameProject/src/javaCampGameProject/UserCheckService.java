package javaCampGameProject;

import java.rmi.RemoteException;

public interface UserCheckService  {
     boolean checkIfRealUser(User user) throws RemoteException;
}
