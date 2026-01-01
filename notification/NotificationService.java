package notification;

public abstract class NotificationService {
   private String message;
    NotificationService(String message){
        this.message=message;
    }
   protected abstract void notification(String message);
    private boolean validation(String message) {
        if(message==null || message.trim().isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }
    public void notifyUser(){
        if(validation(this.message)){
            notification(this.message);
        }
    }
}
