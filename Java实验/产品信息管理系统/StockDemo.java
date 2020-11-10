import java.util.Scanner;

public class StockDemo {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        StockManager stockmanager = new StockManager();
        String id = null;
        while(true) {
            System.out.println("===============菜单===============");
            System.out.println("1.添加产品");
            System.out.println("2.输出所有产品信息");
            System.out.println("3.查询产品（产品ID）");
            System.out.println("4.查询产品数量");
            System.out.println("5.增加库存");
            System.out.println("6.查找库存低于某数量的产品信息");
            System.out.println("7.查询产品（产品名字）");
            System.out.println("exit.退出系统");
            System.out.println("==================================");
            System.out.println("输入你要进行的操作：");
            String choice = In.nextLine();
            switch(choice) {
                case "1":
                    stockmanager.addProduct();
                    break;
                case "2":
                    stockmanager.printProductDetails();
                    break;
                case "3":
                    System.out.println("输入你要查询产品的ID：");
                    id = In.nextLine();
                    Product reProduct = stockmanager.findProduct(id);
                    if(reProduct==null)
                        System.out.println("未查到该产品");
                    System.out.println(reProduct.toString());
                    break;
                case "4":
                    System.out.println("输入你要查询产品的ID：");
                    id = In.nextLine();
                    if(stockmanager.numberInStock(id)!=0)
                        System.out.println("该产品库存数量："+stockmanager.numberInStock(id));
                    break;
                case "5":
                    System.out.println("输入你要增加库存的产品的ID：");
                    id = In.nextLine();
                    stockmanager.delivery(id);
                    break;
                case "6":
                    System.out.println("输入给定水平值：");
                    int level = In.nextInt();
                    String blank = In.nextLine();   //接收空格
                    stockmanager.printLowStockProducts(level);
                    break;
                case "7":
                    System.out.println("输入要查询的产品名字：");
                    String name = In.nextLine();
                    if(stockmanager.findProductByName(name)==null)
                        System.out.println("该产品不存在");
                    else{
                        reProduct = stockmanager.findProductByName(name);
                        System.out.println(reProduct.toString());
                    }
                    break;
                case "exit":
                    System.exit(0);

                default:
                    System.out.println("输入选项有误，请重新输入：");
            }
        }
    }
}
