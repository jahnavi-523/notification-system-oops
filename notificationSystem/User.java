package notificationSystem;

public class User {
    public static void main(String[] args) {
        Systems system=new Email("the OTP is 2234");
        system.notifyUser();
        Systems system1 =new WhatsApp(" ");
        system1.notifyUser();
        Systems system2=new SMS("hi");
        system2.notifyUser();


    }
}
