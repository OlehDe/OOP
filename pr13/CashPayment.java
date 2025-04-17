package pr13;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено готівкою: " + amount + " грн.");
    }
}
