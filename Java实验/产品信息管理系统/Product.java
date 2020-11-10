public class Product {
    private int stocks;
    private String name;
    private String ID;
    Product() { stocks = 0;name = null;ID = null; }
    Product(int stocks, String id, String name) {
        this.stocks = stocks;
        this.ID = id;
        this.name = name;
    }
    public void increaseQuantity (int addition) { stocks = stocks+addition; }
    public void SellOne() { stocks--; }
    String getID() { return ID; }
    String getName() { return name;}
    int getStocks() {return stocks;}
    public String toString() {
        String stocksString = ""+stocks;
        return "产品名称："+name+"\n产品ID:"+ID+"\n产品库存"+stocksString;
    }
}