package notification;

public class User {
    public static void main(String[] args) {
        NotificationService system=new Email("the OTP is 2234");
        system.notifyUser();
        NotificationService system1 =new WhatsApp(" ");
        system1.notifyUser();
        NotificationService system2=new SMS("hi");
        system2.notifyUser();


    }
}
