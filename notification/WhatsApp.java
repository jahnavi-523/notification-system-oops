package notification;

public class WhatsApp extends NotificationService {
 WhatsApp(String message){
        super(message);

    }


    @Override
    public void notification(String msg) {
        System.out.println("WhatsApp: " + msg);
    }
}
