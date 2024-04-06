package bank;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Account account=new Account();
        account.accountNum="1234567";
        account.ifscCode="SBIIN000000";
        account.balance=2000.20;
        account.passWord="80578";
        account.userName="sravya";
        Card card=new Card();
        card.cardNo="56789";
        card.cvv="2222";
        card.exp="03.19.24";
        card.account=account;
        ATM atm=new ATM();
        atm.machineId="65837";
        atm.atmBal="2400";
        atm.location="chaitanyapuri";
        Transaction transaction=new Transaction();
        transaction.atm=atm;
        transaction.card=card;
        transaction.withdrawAmt=1000;
        transaction.transactionId="1234567";

    }
}
