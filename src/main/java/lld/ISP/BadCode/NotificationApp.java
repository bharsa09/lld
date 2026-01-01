package lld.ISP.BadCode;

public class NotificationApp {

    public static void main(String[] args) {
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(smsService,emailService);
    }
}
