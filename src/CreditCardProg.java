import java.util.Scanner;
public class CreditCardProg {
    public static void main(String []args) {
//        CreditCardPaymentInRs ccInr = new CreditCardPaymentInRs();
//        ccInr.setCcNumber("12345");
//        ccInr.setCvv(123);
//        ccInr.setBalanceAmount(100000);
//        ccInr.setCustName("Parvez");
//        System.out.println("Before purchase Balance is Rs. :"+ccInr.getBalanceAmount());
//        ccInr.performPayment(1000); // Method to perform paymnt operatoin
//        System.out.println("After purchase Balance is Rs. :"+ccInr.getBalanceAmount());
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();


        CreditCardClass ccUSD = new CreditCardPaymentInUSD();
        ccUSD.setCcNumber("12345");
        ccUSD.setCvv(123);
        ccUSD.setBalanceAmount(100000);
        ccUSD.setCustName("Parvez");
        System.out.println("Before purchase Balance is Rs. :"+ccUSD.getBalanceAmount());
        ccUSD.performPayment(100); // Method to perform paymnt operatoin
        System.out.println("After purchase Balance is Rs. :"+ccUSD.getBalanceAmount());


    }
}

class CreditCardPaymentInUSD extends CreditCardClass {
    public void performPayment(long amountToBePaid) {
        long balanceAmountUSD = super.getBalanceAmount();
        System.out.println("Amount to be Paid is USD: "+amountToBePaid);
        balanceAmountUSD -= (amountToBePaid*80);
        super.setBalanceAmount(balanceAmountUSD);
        System.out.println("Payment Done in USD");
    }
}

class CreditCardPaymentInYuan extends CreditCardClass {
    public void performPayment(long amountToBePaid) {
        long balanceAmountYuan = super.getBalanceAmount();
        System.out.println("Amount to be Paid is Yuan: "+amountToBePaid);
        balanceAmountYuan -= (amountToBePaid*12);
        super.setBalanceAmount(balanceAmountYuan);
        System.out.println("Payment Done in Yuan");
    }
}

class CreditCardPaymentInRs extends CreditCardClass {
    public void performPayment(long amountToBePaid) {
        long balanceAmountINR = super.getBalanceAmount();
        System.out.println("Amount to be Paid is Rs."+amountToBePaid);
        balanceAmountINR -= amountToBePaid;
        super.setBalanceAmount(balanceAmountINR);
        System.out.println("Payment Done in INR");
    }
}
abstract class CreditCardClass {

    abstract public void performPayment(long amountToBePaid);

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public long getCvv() {
        return cvv;
    }

    public void setCvv(long cvv) {
        this.cvv = cvv;
    }

    private String ccNumber;
    private String custName;
    private long balanceAmount;
    private long cvv;

}