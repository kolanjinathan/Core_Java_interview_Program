
public class Account {

	public static void main(String[] args) {
		// Test s=new Account(78);
		// s.st="nathan";
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	private int accountNumber;
	private String holderName;

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the holderName
	 */
	public String getHolderName() {
		return holderName;
	}

	/**
	 * @param holderName the holderName to set
	 */
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		return result;
	}

	public boolean equals(Object object) {

		Account aa = (Account) object;
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (accountNumber != aa.accountNumber) {
			return false;
		}
		return true;
	}
}
