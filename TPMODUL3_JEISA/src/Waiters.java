public class Waiters implements Runnable {

  private final int orderQty;
  private final int customerID;
  static int foodprice = 10000;
          
          
  @Override
  public void run() {
          
    while (true) {
        getFood();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
    }
  }

  public Waiters(int customerID, int orderQty) {
    this.customerID = customerID;
    this.orderQty = orderQty;
  }

  public void orderInfo() {
    System.out.println("==========================================================");
    System.out.println("ID Customer: " + this.customerID);
    System.out.println("Jumlah makanan: " + this.orderQty);
    System.out.println("Total harga: " + this.orderQty * foodprice);
    System.out.println("==========================================================");
  }
          
  public void getFood() {
    synchronized(Restaurant.getLock()) {
          
        System.out.println("Waiter: Makanan siap untuk di antar");
        Restaurant coffeeMachine = new Restaurant();
        coffeeMachine.setWaitingForPickup(false);


        if (Restaurant.getFoodNumber() == this.orderQty + 1) {
            orderInfo();
            System.exit(0);
        }
        Restaurant.getLock().notifyAll();
        System.out.println("Waiter: memberitahu restaurant untuk membuat makanan lagi\n");
          
    }
  }
}