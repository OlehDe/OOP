package pr13;

import java.util.List;

public class Order {
    private final List<String> items;
    private double total;
    private final PaymentMethod paymentMethod;
    private final Notification notification;

    public Order(List<String> items, double total, PaymentMethod paymentMethod, Notification notification) {
        this.items = items;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.notification = notification;
    }

    public void processOrder() {
        // Оплата замовлення
        paymentMethod.pay(total);

        // Сповіщення про замовлення
        notification.send("Ваше замовлення: " + String.join(", ", items) + " на суму " + total + " грн.");
    }

    public void addItem(String item) {
        items.add(item);
        total += 10;  // Припустимо, кожен товар додає 10 грн до вартості
    }
}
