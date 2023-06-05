package jay_pr_1;

class ProductMain {
    private String name;
    private int quantity;
    private static int totalSold = 0;

    public ProductMain(String name, double price, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void sell(int quantity) {
        this.quantity -= quantity;
        totalSold += quantity;
        System.out.println(quantity + " " + name+ "s sold.");

    }

    public static int getTotalSold() {
        return totalSold;
    }
}

public class Product {
    public static void main(String[] args) {
    	ProductMain apple = new ProductMain("Apple", 0.99, 10);
    	ProductMain banana = new ProductMain("Banana", 0.49, 15);
    	ProductMain orange = new ProductMain("Orange", 0.79, 20);

        apple.sell(5); 
        banana.sell(8); 
        orange.sell(15);

        System.out.println("Total quantity of products sold: " + ProductMain.getTotalSold());
    }
}