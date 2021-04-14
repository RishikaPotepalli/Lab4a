package lab4;

public class Account {

	private long accNum = 1;
	private double balance;
	private Person accHolder;
	public Account() {
		super();
	}
	public Account(Person accHolder) {
		super();
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		long newNum = accNum;
		   accNum++;
		return newNum;
	}

	public void deposite(double amount) {
		balance += amount; 
	}
	public void withDraw(double amount) {
	    balance -= amount;
	}
	
}

}
