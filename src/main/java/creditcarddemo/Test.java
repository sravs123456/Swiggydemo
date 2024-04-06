package creditcarddemo;

public class Test {
    public static void main(String[] args) {
        User user=new User();
        Address address=new Address();
        address.area="srNagar";
        address.country="India";
        address.flatNo="76";
        address.pincode="538738";
        user.firstName="chennamsetti";
        user.lastName="sravya";
        user.age="25";
        user.adharNum="876297592";
        user.mobileNum="765971361026";
        user.address=address;
        CardService cardService=new CardService();

        Card card =cardService.getCard(user);
        System.out.println(card.cardHoldersName);
        System.out.println(card.cardNum);
        System.out.println(card.CVV);
        System.out.println(card.expDate);

    }
}
