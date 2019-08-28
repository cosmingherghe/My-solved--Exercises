public class CheckingAccount extends StandardAccount {
  private double overdraft = 0.0;

  CheckingAccount(double overdraft) {
    this.overdraft = overdraft;
  }

  CheckingAccount(int id, double balance, double overdraft){
    super(id, balance);
    this.overdraft = overdraft;
  }

  public void withdraw(double amount) {
    if(this.overdraft + super.getBalance() - amount > 0) {
		  if(super.getBalance() - amount > 0){
        super.withdraw(amount);
      }
      else{
        this.overdraft -= (amount - super.getBalance());
        super.withdraw(super.getBalance());
        System.out.println("You are using your overdraft!\n Your overdraft is now: " + this.overdraft );
      }
    }
    else
      System.out.println("Not enough funds to complete transaction.");
	}

//In this article, we looked at four methods to access a class name in Java. These methods are: getSimpleName(), getName(), getTypeName() and getCanonicalName().

  public String toString() { 
    return  "\nClass Name: " + super.getClass().getName() + "\nDate created: " + super.getDateCreated() + "\nAccount number: " + super.getId() + "\nBalance: " + super.getBalance() + "\nAnnual interest rate: " + super.getAnnualInterestRate() + "\nOverdraft: " + overdraft;
  }

}
