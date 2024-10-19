public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public Money add(Money other) {
        long totalCents = this.cents + other.cents;
        long totalDollars = this.dollars + other.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    public Money subtract(Money other) {
        long totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }

    public int compareTo(Money other) {
        if (this.dollars > other.dollars) return 1;
        else if (this.dollars < other.dollars) return -1;
        else return Long.compare(this.cents, other.cents);
    }

    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
