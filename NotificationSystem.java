interface Notifications {
    void sendMessages(String message);
}

class MobileNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Mobile Notification: " + message);
    }
}

class EmailNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class JobNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Job Notification: " + message);
    }
}

class InstaNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("Instagram Notification: " + message);
    }
}

class WhatsAppNotification implements Notifications {
    public void sendMessages(String message) {
        System.out.println("WhatsApp Notification: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {

        Notifications mobile = new MobileNotification();
        Notifications email = new EmailNotification();
        Notifications job = new JobNotification();
        Notifications insta = new InstaNotification();
        Notifications whatsapp = new WhatsAppNotification();

        mobile.sendMessages("New mobile alert!");
        email.sendMessages("You have a new email!");
        job.sendMessages("Java Developer job available!");
        insta.sendMessages("New follower request!");
        whatsapp.sendMessages("You received a new message!");
    }
}