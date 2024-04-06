package bankdetails;

public class Test {
    public static void main(String[] args) {
        UserDetails userDetails=new UserDetails();
        Address userAddress=new Address();
     userAddress.flatNo="75";
     userAddress.pincode="5098080";
     userAddress.country="India";
     userAddress.area="Miyapur";

        userDetails.firstName="chennamsetti";
        userDetails.lastName="sravya";
        userDetails.dateOfBirth="12.10.24";
        userDetails.mobileNum="8769608708";
        userDetails.gender="female";
        userDetails.address=userAddress;
        BankService bankService=new BankService();
        AccountDetails accountDetails= bankService.accountDetails(userDetails);
        System.out.println("Account No; "+ accountDetails.accountNum);




    }
}
