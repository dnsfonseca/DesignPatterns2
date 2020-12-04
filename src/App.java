import services.SalesService;
import products.SimpleProdutos;
import products.Produtos;

import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) throws Exception {
    SimpleProdutos Notebook = new SimpleProduct("Notebook", 4690.90);
    SimpleProdutos Chair = new SimpleProduct("Chair", 759.39);
    SimpleProdutos Table = new SimpleProduct("Table", 499.99);
    SimpleProdutos Headset = new SimpleProduct("Table", 299.89);

    List<Product> products = new ArrayList<>();
    products.add(Notebook);
    products.add(Chair);
    products.add(Table);
    products.add(Headset);

    SalesService seller = new SalesService();
    seller.sellProdutos(products);
  }
}
