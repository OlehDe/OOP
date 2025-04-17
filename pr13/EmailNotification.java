package pr13;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Сповіщення на пошту: " + message);
    }
}
