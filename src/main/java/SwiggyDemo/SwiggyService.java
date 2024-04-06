package SwiggyDemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
    public RestaruentList getrestaurentList(){
        RestaurantService restaurantService=new RestaurantService();
        restaurantService.restaurantName="sevenStar";
        restaurantService.restaurantNo="6574465343222";
        restaurantService.rating="4.5";


        Address restaurantaddress=new Address("chaitanyapuri","vvnagar","4-2","521176");
        restaurantService.address=restaurantaddress;
        Dishes biriyani=new Dishes("Biriyani");
        Dishes staters=new Dishes("staters");
        Dishes muttonBiriyani=new Dishes("muttonBiriyani");


        List<Dishes>SevenstardishesList=new ArrayList<>();
        SevenstardishesList.add(biriyani);
        SevenstardishesList.add(staters);
        SevenstardishesList.add(muttonBiriyani);
        restaurantService.dishesList=SevenstardishesList;



        RestaurantService restaurantService1=new RestaurantService();
        restaurantService1.restaurantName="FoodPlaza";
        restaurantService1.restaurantNo="976436878754";
        restaurantService1.rating="4.3";

        Address restaurant1address=new Address("srNagar","2","32-3","9786554");
        restaurantService1.address=restaurant1address;

        Dishes ChickenBiriyani=new Dishes("ChickenBiriyani");
        Dishes KFC=new Dishes("KFC");
        Dishes juicyMandi=new Dishes("juivyMandi");

        List<Dishes>FoodPlazadishes=new ArrayList<>();
        FoodPlazadishes.add(ChickenBiriyani);
        FoodPlazadishes.add(KFC);
        FoodPlazadishes.add(juicyMandi);
        restaurantService1.dishesList=FoodPlazadishes;

        List<RestaurantService> restaurantServices=new ArrayList<>();
        restaurantServices.add(restaurantService);
        restaurantServices.add(restaurantService1);

        RestaruentList restaruentList = new RestaruentList();
        restaruentList.restaurantList=restaurantServices;



        return restaruentList;

    }
}
