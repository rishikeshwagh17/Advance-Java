package pojos;

public class Account {
	//Account POJO  - id | name | type | bal
	private int accNo;
	private String customerName;
	private String acType;
	private double balance;
	
	public Account() {
		super();
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customerName=" + customerName + ", acType=" + acType + ", balance="
				+ balance + "]";
	}
	
}
