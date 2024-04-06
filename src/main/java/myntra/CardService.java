package myntra;

public class CardService {
    public Product purchase(Card card){
        Product product=new Product();
        product.jeans=1000;
        product.tshirt=2000;
        product.tops=1000;
        product.sarees=1000;
        product.leggings=2000;

        product.cost=product.tshirt+product.jeans+product.sarees+product.leggings+product.tops;
        int amount=card.cardLimit - product.cost;
        int amount2=amount-card.availableBal;
        System.out.println(amount);
        System.out.println(amount2);
        return product;
    }
}
