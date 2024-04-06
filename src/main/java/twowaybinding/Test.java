package twowaybinding;

public class Test {
    public static void main(String[] args) {
        State state=new State();
        state.stateName="tg";
        state.stateCapital="hyd";
        Country country=new Country();
        country.countryName="India";
        country.countryCapital="Delhi";
        state.country=country;
        country.state=state;
        System.out.println(country.state.stateCapital);
        System.out.println(state.country.countryCapital);
    }
}
