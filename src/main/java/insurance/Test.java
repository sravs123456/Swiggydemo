package insurance;

public class Test {
    public static void main(String[] args) {
        UserDetails userDetails=new UserDetails();
        userDetails.healthDetails="good";
        userDetails.phNo="256284978796";
        userDetails.userName="sravya";
        userDetails.age="26";
        userDetails.gender="female";
        InsuranceService insuranceService=new InsuranceService();
        InsuranceDetails insuranceStatus=insuranceService.Insurance();
        System.out.println(insuranceStatus.name +"  " + insuranceStatus.policyId);
    }
}
