package demo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MayTinhImpl extends UnicastRemoteObject implements MayTinh {
	public MayTinhImpl() throws RemoteException {
		super();
	}

	@Override
	public int cong2so(int a, int b) throws RemoteException {
		return a + b;
	}

	@Override
	public int tru2so(int a, int b) throws RemoteException {
		return a - b;
	}

}
