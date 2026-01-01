package lld.ISP.BadCode;

public class NotificationService {

    private SMSService smsService;
    private EmailService emailService;

    public NotificationService(SMSService smsService, EmailService emailService) {
        this.smsService = smsService;
        this.emailService = emailService;
    }

    public void sendSMSNotification(String message) {
        smsService.sendSMS(message);
    }

    public void sendEmailNotification(String message) {
        emailService.sendEmail(message);
    }
}


//Problem with this code is that NotificationService is tightly coupled with both SMSService and EmailService.
// If we want to add more notification methods in the future, we would have to modify NotificationService, violating the Open/Closed Principle.
// A better approach would be to define a common interface for notification services and have NotificationService depend on that interface instead.

//USING INTERFACES TO SOLVE THE PROBLEM ISP= INTERFACE SEGREGATION PRINCIPLE
