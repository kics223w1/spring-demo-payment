package itx.examples.springboot.demo.dto.notification;


import itx.examples.springboot.demo.dto.payment.PaymentDetails;
import itx.examples.springboot.demo.dto.payment.PayerInfo;
import itx.examples.springboot.demo.dto.payment.TransactionDetails;
import itx.examples.springboot.demo.dto.payment.PaymentDetails;

public class PayletterNotification {

    private PaymentDetails paymentDetails;
    private PayerInfo payerInfo;
    private TransactionDetails transactionDetails;
    private NotificationInfo notificationInfo;

    public PayletterNotification(PaymentDetails paymentDetails, PayerInfo payerInfo,
                                 TransactionDetails transactionDetails, NotificationInfo notificationInfo) {
        this.paymentDetails = paymentDetails;
        this.payerInfo = payerInfo;
        this.transactionDetails = transactionDetails;
        this.notificationInfo = notificationInfo;
    }

    // Getters and Setters
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(PayerInfo payerInfo) {
        this.payerInfo = payerInfo;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    public void setNotificationInfo(NotificationInfo notificationInfo) {
        this.notificationInfo = notificationInfo;
    }
}

