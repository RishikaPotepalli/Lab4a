package lab4;
import java.util.Scanner;

public class MainAccount {


		static Account a[] = new Account[1000];
		static Scanner sc = new Scanner(System.in);
		static int index = 0;
		public static void main(String[] args) {
			MainAccount ma = new MainAccount();
			while(true) {
				System.out.println("Enter the requirement:\n1. Create a new account\n2. WithDraw\n3. Deposite\n");
				
				int option = Integer.parseInt(sc.nextLine());
				switch(option) {
				     case 1:
				    	 ma.insertAccount();
				    	 break;
				     case 2:
				    	 System.out.println("Enter the withdraw amount");
				    	 double amount = Double.parseDouble(sc.nextLine());
				    	 ma.withDraw(amount);
				    	 break;
				     case 3:
				    	 System.out.println("Enter the deposit amount");
				    	 double amount1 = Double.parseDouble(sc.nextLine());
				    	 ma.deposite(amount1);
				    	 break;
				    	 
				}
			}

		}
		public void insertAccount() {
			 System.out.println("Enter the Account holder name");
	    	 String name = sc.nextLine(); 	 
	    	 System.out.println("Enter the Account holder age");
	    	 float age = Float.parseFloat(sc.nextLine());
	    	 
	    	 Person p = new Person(name,age);
	    	 Account a = new Account(p);
	    	 System.out.println("Enetr the Initial Balance");
	    	 double bal = Double.parseDouble(sc.nextLine());
	    	 a.setBalance(bal);
	    	 addAccount(a);
		}
		public void addAccount(Account account) {
			a[index++] = account;
		}
		public void deposite(double amount) {
			for(int i = 0;i < index;i++) {
			    a[i].deposite(amount);
			    display(a[i]);
			}
		}
		public void withDraw(double amount) {
			for(int i = 0;i < index;i++) {
			     a[i].withDraw(amount);
			     display(a[i]);
			}
		}

		public void display(Account a) {
			System.out.println("The Account Holder Number: "+a.getAccNum());
			System.out.println("The Account Holder Name: "+a.getAccHolder().getName());
			System.out.println("The Account Holder Age: "+a.getAccHolder().getAge());
			System.out.println("The Account Balance: "+a.getBalance());
		}

	}


