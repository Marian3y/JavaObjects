

public class Bank {
    private String name;
    private float balance;



    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float withdraw(float howmuch) {
        if(howmuch > balance) {
            System.out.println("You have insufficient funds");
        }
        else{
            balance-=howmuch;
        }
        return balance;
    }
    public float deposit(float howmuch) {
        balance += howmuch;
        return balance;
    }


    public Bank(String name, float balance) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Bank checking = new Bank("Checking", 12300);
        System.out.println(checking);

        Bank savings = new Bank("Savings", 1000);
        System.out.println(savings);

        int amount = 300;   //utils.getNumber("Withdraw from Checking:");
        checking.withdraw(amount);
        System.out.println("checking = " + checking);

    }
}