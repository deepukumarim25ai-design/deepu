public class Day14 {
     interface Notification {
         void send(String to,String message);
     }
     static class EmailNotification implements Notification{
         @Override
         public void send(String to,String message){
             System.out.println("Sending Email: " + message + ", to " + to);
         }
     }
     static class WhatsappNotification implements Notification{
         @Override
         public void send(String to, String message) {
             System.out.println("Sending WhatsApp: " + message + ", to " + to);
         }
     }
     static Notification getNotification(Day14 factory,String type){
         return switch (type) {
             case "Email" -> new EmailNotification();
             case "WhatsApp" -> new WhatsappNotification();
             default -> throw new IllegalArgumentException("Invalid Notification type: " + type);
         };
     }
     static void main(){
         Day14 factory = new Day14();

         String type = "Email";
         getNotification(factory,type).send("Manisha","Hello");
         getNotification(factory,type).send("Diksha","hii..");
     }
}