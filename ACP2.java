public class CashRegister {

    private double purchase;
    private double payment;
    private int itemCount;

    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        return "Purchase = " + purchase +
               ", Payment = " + payment +
               ", Items = " + itemCount;
    }

    public static int countTotal(CashRegister[] registers) {
        int total = 0;

        for (CashRegister register : registers) {
            total += register.getItemCount();
        }

        return total;
    }

    public static void main(String[] args) {

        CashRegister register1 = new CashRegister();
        register1.recordPurchase(100.0);
        register1.recordPurchase(250.0);
        register1.receivePayment(400.0);

        CashRegister register2 = new CashRegister();
        register2.recordPurchase(50.0);
        register2.recordPurchase(75.0);
        register2.recordPurchase(125.0);
        register2.receivePayment(300.0);

        System.out.println("Register 1");
        System.out.println(register1);
        System.out.println("Items Purchased: " + register1.getItemCount());
        System.out.println("Change: " + register1.giveChange());

        System.out.println();

        System.out.println("Register 2");
        System.out.println(register2);
        System.out.println("Items Purchased: " + register2.getItemCount());
        System.out.println("Change: " + register2.giveChange());

        CashRegister[] registers = {register1, register2};

        System.out.println();
        System.out.println("Total Items Purchased: " + CashRegister.countTotal(registers));
    }
}
