package myntra;

import java.util.List;

public class Shop {
    public List<Product2> product2List;
    public void productAvailability(Product2 product2){
        if(product2List.contains(product2)){
            System.out.println("product avalabile" +product2);
        }
        else {
            System.out.println("product not avalable");
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "product2List=" + product2List +
                '}';
    }
}

