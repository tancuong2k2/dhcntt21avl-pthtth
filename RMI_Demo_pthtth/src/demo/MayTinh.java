package demo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MayTinh extends Remote {
	int cong2so(int a, int b) throws RemoteException;
	int tru2so(int a, int b) throws RemoteException;
}
