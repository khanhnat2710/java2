package Buoi8.Bai2;

import java.util.List;

public interface Payment {
    Object status();
    List<Object> getPayment();
    void initiateLoanPayment();
    void initiatePayments();
    void initiateRePayment();
}
