package by.htp.banksystem.entityClient;
import java.util.Arrays;

import by.htp.banksystem.entityAccount.*;

public abstract class Client {
	private String  nameClient;
	private String typeClient;
	private Account [] account;
	
	
	public Account[] getAccount() {
		return account;
	}
	public void setAccount(Account[] account) {
		this.account = account;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(account);
		result = prime * result + ((nameClient == null) ? 0 : nameClient.hashCode());
		result = prime * result + ((typeClient == null) ? 0 : typeClient.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (!Arrays.equals(account, other.account))
			return false;
		if (nameClient == null) {
			if (other.nameClient != null)
				return false;
		} else if (!nameClient.equals(other.nameClient))
			return false;
		if (typeClient == null) {
			if (other.typeClient != null)
				return false;
		} else if (!typeClient.equals(other.typeClient))
			return false;
		return true;
	}
	
}
