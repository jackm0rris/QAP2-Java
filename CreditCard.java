public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person owner, Money limit) {
        this.owner = owner;
        this.creditLimit = new Money(limit); 
        this.balance = new Money(0); // the balance is 0
    }

    // Accessor methods
    public Money getBalance() {
        return new Money(balance); // copy of the balance
    }

    public Money getCreditLimit() {
        return new Money(creditLimit); // copy of the credit limit
    }

    public String getPersonals() {
        return owner.toString();
    }

    // charge money
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
