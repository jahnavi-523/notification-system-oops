package notification;

public class Email extends NotificationService {
    Email(String message){
        super(message);
    }
    @Override
    public void notification(String msg) {
        System.out.println("Email : " + msg);
    }
}
