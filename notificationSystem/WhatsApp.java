package notificationSystem;

public class WhatsApp extends Systems {
 WhatsApp(String message){
        super(message);

    }


    @Override
    public void notification(String msg) {
        System.out.println("WhatsApp: " + msg);
    }
}
