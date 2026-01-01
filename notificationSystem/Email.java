package notificationSystem;

public class Email extends Systems {
    Email(String message){
        super(message);
    }
    @Override
    public void notification(String msg) {
        System.out.println("Email : " + msg);
    }
}
