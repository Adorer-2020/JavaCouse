import java.util.ArrayList;
import java.util.Scanner;

public class StockManager
{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<Product>();    //对象容器

    void addProduct() {
        int stocks;
        String id;
        boolean flag = true;
        System.out.println("请输入产品名：");
        String name = scanner.nextLine();
        System.out.println("请输入产品ID：");
        id = scanner.nextLine();
        System.out.println("请输入产品库存：");
        stocks = scanner.nextInt();
        String blank = scanner.nextLine();      //接收空格
        for(Product product:products) {
            if(id.equals(product.getID())) {
                System.out.println("当前ID已存在，无法添加，请更换ID重新输入");
                flag = false;
                break;
            }
        }
        if(flag) {
            Product product = new Product(stocks, id, name);
            products.add(product);
        }
    }

    void printProductDetails() {
        int i = 0;
        for (Product product : products) {
            System.out.println("product."+(++i));
            System.out.println("=======================");
            System.out.println(product.toString());
            System.out.println("=======================");
            System.out.println("\n");

        }
    }

    Product findProduct(String id) {
        for (Product product : products)
            if (product.getID().equals(id))
                return product;
        return null;
    }

    int numberInStock(String id) {
        for(Product product:products)
            if(product.getID().equals(id))
                return product.getStocks();
        return 0;
    }

    void delivery(String id) {
        boolean flag = true;
        for (Product product : products)
            if (product.getID().equals(id))
            {
                flag = false;
                System.out.println("请输入你要增加的库存数量：");
                int num = scanner.nextInt();
                product.increaseQuantity(num);
            }
        if(flag)
            System.out.println("该ID不存在!");

    }

    void printLowStockProducts(int level) {
        for (Product product:products)
            if(product.getStocks()<level)
                System.out.println(product.toString());

    }

    Product findProductByName(String name) {
        for(Product product:products)
            if(name.equals(product.getName()))
                return product;
        return null;
    }
}
