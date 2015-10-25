/**
 * Created by Lawrence on 10/17/15.
 */
public class Product {
    private String code;
    private String description;
    private double price;
    public Product(String initialCode, String initialDescription, double initialPrice) {
        code = initialCode;
        description = initialDescription;
        price = initialPrice;
    }
    public String getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return !(code != null ? !code.equals(product.code) : product.code != null);
    }

    @Override
    public String toString() {
        return code + "_" + description + "_" + price;
    }
}
