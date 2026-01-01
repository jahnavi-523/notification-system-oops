package notification;

public class SMS extends NotificationService {
   SMS(String message){
        super(message);
        // this.message=message;
    }

    @Override
    public void notification(String msg) {
        System.out.println("SMS: " +msg);
    }
}
