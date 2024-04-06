package SwiggyDemo;

public class Dishes {
    public String disheName;

    public Dishes(String disheName) {
        this.disheName = disheName;
    }

    @Override
    public String toString() {
        return "Dishes{" +
                "disheName='" + disheName + '\'' +
                '}';
    }
}
