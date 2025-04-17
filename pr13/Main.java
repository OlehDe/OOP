package pr13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PaymentMethod paymentMethod = new CardPayment();
        Notification notification = new PhoneNotification();

        Order order = new Order(Arrays.asList("Сендвіч", "Кава"), 50, paymentMethod, notification);

        order.processOrder();

        order.addItem("Салат");
        order.processOrder();
    }
}
