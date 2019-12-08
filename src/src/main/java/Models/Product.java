package Models;

public class Product {
    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        Product.productName = productName;
    }

    public static String getProductProducer() {
        return productProducer;
    }

    public static void setProductProducer(String productProducer) {
        Product.productProducer = productProducer;
    }

    public static String getProductPrice() {
        return productPrice;
    }

    public static void setProductPrice(String productPrice) {
        Product.productPrice = productPrice;
    }

    public static String productName;
    public static String productProducer;
    public static String productPrice;

}
