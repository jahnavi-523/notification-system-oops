package notification;

public class SMS extends Systems {
   SMS(String message){
        super(message);
        // this.message=message;
    }

    @Override
    public void notification(String msg) {
        System.out.println("SMS: " +msg);
    }
}
