package entities;

public class Account {
	private int account_number;
	private String name;
	private double initial_deposit;
	
	public Account(int account_number, String name) {
		this.account_number = account_number;
		this.name = name;
	}

	public Account(int account_number, String name, double initialDeposit) {
		this.account_number = account_number;
		this.name = name;
		deposit(initialDeposit);
	}

	public double getAccount_number() {
		return account_number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitial_deposit() {
		return initial_deposit;
	}

	public void setInitial_deposit(double initial_deposit) {
		this.initial_deposit = initial_deposit;
	}
	
	public void deposit(double amount) {
		initial_deposit += amount;
	}
	public void withdraw(double amount) {
		initial_deposit -= amount + 5.0;
	}

	public String toString() {
		return "Account "
			   + account_number
			   + ", Holder: "
			   + name
			   + ", initial_deposit: $"
			   + String.format("%.2f", initial_deposit);
	}

}
