public class Futures extends Product  implements ProductPricingService{
    String exchange;
    String contractCode;
    int month;
    int year;

    public Futures(String productId, double currentPrice) {
        super(productId, currentPrice);
    }
    public Futures(String productId, double currentPrice, String exchange, String contractCode, int month, int year) {
        super(productId, currentPrice);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
    }

    @Override
    public double price(String exchange, String ticker) {
        return getCurrentPrice();
    }

    public double price(String exchange, String contractCode, int month, int year) {
        return getCurrentPrice() * month * year;
    }
}
