package Buoi7.LyThuyet.Bai4;

public class App {
    public static void main(String[] args) {
        Notification sms = new SMSNotification();
        Notification email = new EmailNotification();
        NotificationService smsService = new NotificationService(sms);
        smsService.notifyUser("Ban nha chung cu");
        NotificationService emailService = new NotificationService(email);
        emailService.notifyUser("Ban nha chung cu");
    }
}
