package Buoi7.LyThuyet.Bai4;

public class SMSNotification implements Notification {
    @Override
    public void sent(String message) {
        System.out.println("Gui tin sms: " + message);
    }
}
