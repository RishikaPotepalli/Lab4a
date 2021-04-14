package lab4;

public class SavingAccount extends Account {
		   
		private final  double  minimumBalance = 500;
		
		public SavingAccount() {
			super();
		}

		@Override
		public void withDraw(double amount) {
			if((super.getBalance() - amount) >= minimumBalance) {
			        super.withDraw(amount);
			}else {
				System.out.println("The withdraw cannot be done. Account should hold 500 as minimum balance.");
			}
		}

		
	     
	}

}
