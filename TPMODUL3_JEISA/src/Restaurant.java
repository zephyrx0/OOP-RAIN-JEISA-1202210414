public class Restaurant implements Runnable {

  private boolean waitingForPickup = false;
  private static final Object lock = new Object();
  private static int foodNumber = 1;
          
  @Override
  public void run() {
    while (true) {
        makeFood();
        try {
          Thread.sleep(3000);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
    }
  }
          
  public void setWaitingForPickup(boolean waitingForPickup) {
    this.waitingForPickup = waitingForPickup;
  }
          
  public static int getFoodNumber() {
    return foodNumber;
  }
          
  public void makeFood() {
    synchronized(Restaurant.lock) {

        if (this.waitingForPickup) {
            try {
                System.out.println("Restoran: Menunggu waiter mengantar pesanan");
                Restaurant.lock.wait();
            } catch (InterruptedException a) {
                a.printStackTrace();
            }
          
        }

        waitingForPickup = true;
        System.out.println("Restoran:  membuat pesanan nomor " + foodNumber++);
        Restaurant.lock.notifyAll();
        System.out.println("Restoran: memberitahu waiter untuk mengambil pesanan\n");
    }
 }
          
  public static Object getLock() {
    return lock;
  }
}