public class BankAccount {
    private int checking;
    private int saving;
    private int cashRewards;

    public BankAccount(int checking, int saving, int cashRewards) {
        this.checking = checking;
        this.saving = saving;
        this.cashRewards = cashRewards;
    }

    public int getChecking() {
        return checking;
    }

    public void setChecking(int checking) {
        this.checking = checking;
    }

    public int getSaving() {
        return saving;
    }

    public void setSaving(int saving) {
        this.saving = saving;
    }

    public int getCashRewards() {
        return cashRewards;
    }

    public void setCashRewards(int cashRewards) {
        this.cashRewards = cashRewards;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "checking='" + checking +"'"+
                ", saving='" + saving +"'"+
                ", cashRewards='" + cashRewards +"'"+
                '}';
    }

    public static void main(String[] args) {
     BankAccount char1 = new BankAccount(6000,500,250);
        char1.setChecking(12000);
        int checking =char1.getChecking();
        char1.setSaving(600);
        System.out.println("char1 = " + char1);

        BankAccount char2 = new BankAccount(10000,1000,550);
        char2.setChecking(19000);
        char2.setSaving(7000);
        int saving = char2.getSaving();
        System.out.println("char2 = " + char2);

        BankAccount char3 = new BankAccount(20000,2000,350);
        char3.setChecking(15000);
        char3.setSaving(900);
        System.out.println("char2 = " + char3);

        if(checking > saving){
            System.out.println("Checking is larger than savings");

        }
        else{
            System.out.println("Savings is larger than checking");
        }
    }
}
