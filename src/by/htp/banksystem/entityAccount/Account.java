package by.htp.banksystem.entityAccount;

public class Account {
	private String typeAccount;
	private double balance = 0.0;
	private boolean statusBlock = false;
	private int namberAccount;
	
	
	public int getNamberAccount() {
		return namberAccount;
	}
	public void setNamberAccount(int namberAccount) {
		this.namberAccount = namberAccount;
	}
	public boolean isStatusBlock() {
		return statusBlock;
	}
	public void setStatusBlock(boolean statusBlock) {
		this.statusBlock = statusBlock;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getTypeAccount() {
		return typeAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + namberAccount;
		result = prime * result + (statusBlock ? 1231 : 1237);
		result = prime * result + ((typeAccount == null) ? 0 : typeAccount.hashCode());
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (namberAccount != other.namberAccount)
			return false;
		if (statusBlock != other.statusBlock)
			return false;
		if (typeAccount == null) {
			if (other.typeAccount != null)
				return false;
		} else if (!typeAccount.equals(other.typeAccount))
			return false;
		return true;
	}
	
	
}
