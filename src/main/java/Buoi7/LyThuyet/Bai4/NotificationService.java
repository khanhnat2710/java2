package Buoi7.LyThuyet.Bai4;

public class NotificationService {
    private Notification channel;

    public NotificationService(Notification channel) {
        this.channel = channel;
    }

    public Notification getChannel() {
        return channel;
    }

    public void notifyUser(String message) {
        channel.sent(message);
    }
}
