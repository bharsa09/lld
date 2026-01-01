package lld.ISP.GoodCode;

public class SMSService implements NotificationChannel{
    @Override
    public void sendNotification(String message) {
        // Logic to send SMS
        System.out.println("Sending SMS: " + message);
    }
}
