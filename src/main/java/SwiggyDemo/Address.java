package SwiggyDemo;

public class Address {
    public String area;
    public String street;
    public String hNo;

    public String pincode;

    public Address(String area, String street, String hNo, String pincode) {
        this.area = area;
        this.street = street;
        this.hNo = hNo;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", hNo='" + hNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
