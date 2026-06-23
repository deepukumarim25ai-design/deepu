public class day_15 {
    static String[] items = {"Ice cream","Cold coffee","Shake"};

    private static int nextOrderIndex = 0;

    private static final Object LOCK = new Object();

    static void pickOrder(){
        String Order;
        while (true){
            synchronized (LOCK){
                if (nextOrderIndex>= items.length){
                    return;
                }
                Order = items[nextOrderIndex];
                nextOrderIndex++;
            }
            System.out.println(Thread.currentThread().getName() + " is preparing : "+ Order);
        }
    }
    static void main() throws InterruptedException{
        Thread chefOne = new Thread(() -> pickOrder(), "chefOne");
        Thread chefTwo = new Thread(() -> pickOrder(), "chefTwo");

        chefOne.start();
        chefTwo.start();

        chefOne.join();
        chefTwo.join();
    }
}