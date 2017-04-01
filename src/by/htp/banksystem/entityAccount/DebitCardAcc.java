package by.htp.banksystem.entityAccount;

public class DebitCardAcc extends Account{
	private String typeAccount = "DebitCardAcc";

	public String getTypeAccount() {
		return typeAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((typeAccount == null) ? 0 : typeAccount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCardAcc other = (DebitCardAcc) obj;
		if (typeAccount == null) {
			if (other.typeAccount != null)
				return false;
		} else if (!typeAccount.equals(other.typeAccount))
			return false;
		return true;
	}
	
}
