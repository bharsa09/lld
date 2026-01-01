package lld.ISP.GoodCode;

public class additionNotification implements NotificationChannel{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending addition notification: " + message);
    }
}
