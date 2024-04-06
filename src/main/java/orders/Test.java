package orders;

public class Test {
    public static void main(String[] args) {
        Address address=new Address();
        address.area="hyd";
        address.houseNum="23-34";
        address.mobileNum="567890";
        address.street="2";
        address.pincode="521175";
        Product product=new Product();
        product.productName="Biriyani";
        product.price=600;
        OrderItems orderItems=new OrderItems();
        orderItems.noOfItems="2";
        orderItems.quantity=2;
        orderItems.price=600;
        orderItems.product=product;
        Order order=new Order();
        order.orderId="123456";
        order.price=500;
        order.orderItems=orderItems;
        order.address=address;
        System.out.println(orderItems.product.price);




    }
}
