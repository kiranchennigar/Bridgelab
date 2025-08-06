class Customer{
	String name;
	int customerId;
	
	public Customer(String name,int customerId) {
		this.name=name;
		this.customerId=customerId;
	}
}
 
 abstract class Account{
	 static int accCounter = 1000;
	 int accountNumber;
	 Customer customer;
	 double balance;
	 
	 public Account(Customer customer,double initialDeposit) {
		 this.customer=customer;
		 this.balance=initialDeposit;
		 this.accountNumber= ++accCounter;
	 }
	 public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    public abstract void withdraw(double amount);

	    public void printStatement() {
	        System.out.println("Account No: " + accountNumber);
	        System.out.println("Customer: " + customer.name);
	        System.out.println("Balance: " + balance);
	    }
 }
 
 class SavingsAccount extends Account {
	    public SavingsAccount(Customer customer, double deposit) {
	        super(customer, deposit);
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient funds in Savings Account.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	    }
	}
 
 class CurrentAccount extends Account {
	    final double overdraftLimit = 5000;

	    public CurrentAccount(Customer customer, double deposit) {
	        super(customer, deposit);
	    }

	    public void withdraw(double amount) {
	        if (amount > (balance + overdraftLimit)) {
	            System.out.println("Overdraft limit exceeded in Current Account.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        }
	    }
	}
 
 
 class Bank{
	 Account [] accounts=new Account[10];
	 int count=0;
	 
	 public Account createAccount(String type, Customer customer, double deposite) {
		 Account acc=null;
		 if(type.equalsIgnoreCase("savings")) {
			 acc=new SavingsAccount(customer,deposite);
		 }
		 else if(type.equalsIgnoreCase("current")) {
			 acc=new CurrentAccount(customer,deposite);
		 }
		 if(acc != null && count < accounts.length) {
			 accounts[count++]=acc;
			 System.out.println("Account created successfully : "+acc.accountNumber);
		 }
		 return acc;
	 }
 }
 

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		Customer kiran=new Customer("kiran",101);
		Customer varun=new Customer("varun",102);
		
		Account acc1=bank.createAccount("savings",kiran,1000);
		Account acc2 = bank.createAccount("current", varun, 2000);

        System.out.println("\n--- Transactions ---");
        acc1.deposit(500);
        acc1.withdraw(2000); 
        acc1.withdraw(1000);
        acc1.printStatement();

        System.out.println();

        acc2.withdraw(6000);
        acc2.printStatement();

	}

}
