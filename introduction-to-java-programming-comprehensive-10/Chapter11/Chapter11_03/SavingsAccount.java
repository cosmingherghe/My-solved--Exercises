public class SavingsAccount extends StandardAccount {
  SavingsAccount(){
  };

  SavingsAccount(int id, double balance){
    super(id, balance); 
  }

  public String toString() { 
    return  "\nClass Name: " + super.getClass().getName() + "\nDate created: " + super.getDateCreated() + "\nAccount number: " + super.getId() + "\nBalance: " + super.getBalance() + "\nAnnual interest rate: " + super.getAnnualInterestRate() + "\nOverdraft: N/A";
  }
}
