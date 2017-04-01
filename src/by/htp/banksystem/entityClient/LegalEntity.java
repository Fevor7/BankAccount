package by.htp.banksystem.entityClient;

public class LegalEntity extends Client{
	private String typeClient = "юридическое лицо";

	public String getTypeClient() {
		return typeClient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((typeClient == null) ? 0 : typeClient.hashCode());
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
		LegalEntity other = (LegalEntity) obj;
		if (typeClient == null) {
			if (other.typeClient != null)
				return false;
		} else if (!typeClient.equals(other.typeClient))
			return false;
		return true;
	}
	
}
