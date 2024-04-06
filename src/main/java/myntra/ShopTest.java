package myntra;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {
    public static void main(String[] args) {
        Product2 product2=new Product2();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.colour="black";
        productSpecification.size = "m";
        productSpecification.price = 5000;
        product2.brand="butterfly";
        product2.type = "jeans";
        product2.brandCode = "766567";
        product2.productSpecification=productSpecification;


        Product2 product3=new Product2();
        ProductSpecification legging=new ProductSpecification();
        legging.price=1000;
        legging.size = "m";
        legging.colour="black";
        product3.brand="eagle";
        product3.type="legging";
        product3.brandCode="86754564";
        product3.productSpecification=legging;
        Shop shop=new Shop();
        List<Product2>product2List=new ArrayList<>();
        product2List.add(product2);
        product2List.add(product3);
        shop.product2List=product2List;
        System.out.println(product2.type);
        System.out.println(productSpecification.size);
        System.out.println(product3.type);
        System.out.println(legging.size);
shop.productAvailability(product3);
shop.productAvailability(product2);
    }
}
