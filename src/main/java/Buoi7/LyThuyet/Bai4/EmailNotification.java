package Buoi7.LyThuyet.Bai4;

public class EmailNotification implements Notification {
    @Override
    public void sent(String message) {
        System.out.println("Gui email: " + message);
    }
}
