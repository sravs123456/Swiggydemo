package creditcarddemo;

import java.util.UUID;

public class CardService {
    public Card getCard(User user){
        Card card=new Card();
        card.cardHoldersName=user.firstName+user.lastName;
        card.cardNum= UUID.randomUUID().toString();
        card.CVV="465";
        card.expDate="15/03/24";
        return card;
    }
}
