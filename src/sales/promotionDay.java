package sales;
import product.Product;

public class promotionDay implements SalesProxy {
  public void sell(Product product) {
    System.out.println("Discounts of up to 80% \n");
    double newProductPrice = this.getBlackFridayPrice(product.getPrice(), 60);
    product.setPrice(newProductPrice);
    new NormalSale().sell(product);
  }

  private double getBlackFridayPrice (double price, int discount) {
    return price - ((price * discount) / 100);
  }
}
