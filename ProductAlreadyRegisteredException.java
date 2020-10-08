public class ProductAlreadyRegisteredException extends Exception {
    private String product;

    public ProductAlreadyRegisteredException(String productId)  {
        this.product = productId;
    }
    @Override
    public String toString() {
        return "ProductAlreadyRegisteredException{" +
                "productId='" + product + '\'' +
                '}';
    }
}


