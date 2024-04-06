package myntra;

public class Product2 {
    public String type;
    public String brand;
    public String brandCode;
    String productCOst;
    ProductSpecification productSpecification;

    @Override
    public String toString() {
        return "Product2{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", brandCode='" + brandCode + '\'' +
                ", productCOst='" + productCOst + '\'' +
                ", productSpecification=" + productSpecification +
                '}';
    }
}
