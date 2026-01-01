package lld.ISP.GoodCode;

public class EmailService implements NotificationChannel{
    @Override
    public void sendNotification(String message) {
        // Logic to send email
        System.out.println("Sending email: " + message);
    }
}
