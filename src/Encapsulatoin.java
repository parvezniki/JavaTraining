public class Encapsulatoin {
    public static void main(String []arg) {
        CreditCard cc1 = new CreditCard();
        cc1.setCardNumber(123456);
        cc1.setCustomerName("Prudhvi");

        CreditCard cc2 = new CreditCard();
        cc2.setCardNumber(98765);
        cc2.setCustomerName("Ajay");

        System.out.println(cc1.getCardNumber()+" - "+cc1.getCustomerName());
        System.out.println(cc2.getCardNumber()+" - "+cc2.getCustomerName());
    }
}

class CreditCard {
    private long cardNumber;
    private String customerName;


    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        ///
        ///
        ///
        this.cardNumber = cardNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
