package insurance;

public class InsuranceService {
    public InsuranceDetails Insurance(){
        InsuranceDetails insuranceDetails=new InsuranceDetails();
        insuranceDetails.policyId="765665";
        insuranceDetails.amount="5000";
        insuranceDetails.name="sravya";
        insuranceDetails.mobileNo="934859600593";
        insuranceDetails.expDate="15.03.24";
        return insuranceDetails;
    }
}
