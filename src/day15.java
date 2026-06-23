import java.util.Arrays;

public class day15 {
     static void main() throws InterruptedException{
         Runnable ChefTask = () -> {
             String[] items = {"Ice cream","Dosa","Coffee"};
             for (String item : items) {
                 System.out.println("Cooking Items:" + item);
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };
         Thread ChefThread = new Thread(ChefTask,"chef-thread");
         ChefThread.start();
         ChefThread.join();
     }
}