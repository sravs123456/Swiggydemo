package SwiggyDemo;

import java.util.List;

public class RestaurantService {
    public String restaurantName;
    public String restaurantNo;
    public String rating;
    Address address;
    List<Dishes>dishesList;

    @Override
    public String toString() {
        return "RestaurantService{" +
                "restaurantName='" + restaurantName + '\'' +
                ", restaurantNo='" + restaurantNo + '\'' +
                ", rating='" + rating + '\'' +
                ", address=" + address +
                ", dishesList=" + dishesList +
                '}';
    }
}
