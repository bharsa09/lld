package lld.ISP.GoodCode;

public class Client {

    public static void main(String[] args) {
        NotificationChannel emailChannel = new EmailService();
        NotificationService notificationService = new NotificationService(emailChannel);
        notificationService.notifyUser("Hello via Email!");

        NotificationChannel smsChannel = new SMSService();
        notificationService = new NotificationService(smsChannel);
        notificationService.notifyUser("Hello via SMS!");

        NotificationChannel additionChannel = new additionNotification();
        notificationService = new NotificationService(additionChannel);
        notificationService.notifyUser("Hello via Addition Notification!");
    }
}
