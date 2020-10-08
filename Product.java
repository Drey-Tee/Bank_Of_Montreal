import java.util.LinkedList;

public class Product implements MontrealTradedProducts {
    private String productId;
    private double currentPrice;

    public Product(String productId, double currentPrice) {
        this.productId = productId;
        this.currentPrice = currentPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        LinkedList<String> productList = new LinkedList<>();
        productList.add(productId);
        if (productList.contains(productId))
            throw new ProductAlreadyRegisteredException(productId);

    }

    @Override
    public void trade(Product product, int quantity) {
        double tr = getCurrentPrice() * quantity;
        System.out.println("Your trade is " + tr);
    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
