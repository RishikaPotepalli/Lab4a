package lab4;

public class CurrentAccount extends Account{

       private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	public CurrentAccount() {
		super();
	}

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		if((super.getBalance() + amount) > overDraftLimit) {
			System.out.println("Over Draft Limit has been exceeded.");
		}
		//return true or false
	}
       
}

}
