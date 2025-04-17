package pr13;

public class PhoneNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Сповіщення на телефон: " + message);
    }
}
