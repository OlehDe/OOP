package pr13;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено карткою: " + amount + " грн.");
    }
}
