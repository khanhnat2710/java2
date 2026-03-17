package Buoi7.LyThuyet.Bai3;

public class PaymentProcessor {
    public void paymentProcessor(PaymentMode paymentMode){
        if (paymentMode == PaymentMode.CASH) {
            CashPayment cashPayment = new CashPayment();
            cashPayment.acceptPayment();
        } else if (paymentMode == PaymentMode.CREDIT_CARD) {
            CreditCardPayment creditCardPayment = new CreditCardPayment();
            creditCardPayment.acceptPayment();
        }
    }
}
