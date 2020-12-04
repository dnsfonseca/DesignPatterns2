package observer;

public class Email implements StockObserver {
  public void announce () {
    System.out.println("This product is available! \n");
    System.out.println("We are almost done with your purchase, thank you! \n");
  }
}
