package bankdetails;

import java.util.UUID;

public class BankService {
    public AccountDetails accountDetails(UserDetails userDetails) {
        AccountDetails accountDetails=new AccountDetails();
        Address address=new Address();
        address.area="srNagar";
        address.country="India";
        address.flatNo="58";
        address.pincode="521175";
        String name=userDetails.firstName+userDetails.lastName;
        accountDetails.userName=name;
        accountDetails.userAddress=userDetails.address;
        accountDetails.bankAddress=userDetails.address;
        accountDetails.accountNum= UUID.randomUUID().toString();
        accountDetails.ifscCode="97656624665";


        return accountDetails;
    }
}
