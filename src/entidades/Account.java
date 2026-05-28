package entidades;

public class Account {

    private Integer number;
    private String holder;
    private double balance;

    public Account(String holder, Integer number) {
        this.holder = holder;
        this.number = number;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                +", Balance: $ "
                + String.format("%.2f", balance);
    }


}
