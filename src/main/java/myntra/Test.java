package myntra;

public class Test {
    public static void main(String[] args) {
       Product1 product1=new Product1();
       product1.colour="blue";
      // product1.prize="2000";
       product1.size="m";
       product1.type="jeans";

       ShopingService service=new ShopingService();
        service.selectProduct(product1);
    }
}
