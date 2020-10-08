public class Stocks extends Product implements ProductPricingService{

    private String stockTicker;
    private String exchange;

    public Stocks(String productId, double currentPrice) {
        super(productId,currentPrice);
    }

    public Stocks(String productId, double currentPrice,String stockTicker, String exchange) {
        super(productId, currentPrice);
        this.stockTicker = stockTicker;
        this.exchange = exchange;
    }


    @Override
    public double price(String exchange, String ticker) {
        return getCurrentPrice();
    }

    @Override
    public double price(String exchange, String contraCode, int month, int year) {
        return  getCurrentPrice();
    }
}