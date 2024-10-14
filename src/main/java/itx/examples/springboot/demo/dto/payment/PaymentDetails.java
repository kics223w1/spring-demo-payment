package itx.examples.springboot.demo.dto.payment;

public class PaymentDetails {
    private String storeid;
    private String currency;
    private String storeorderno;
    private String payamt;
    private String servicename;

    public PaymentDetails(String storeid, String currency, String storeorderno, String payamt, String servicename) {
        this.storeid = storeid;
        this.currency = currency;
        this.storeorderno = storeorderno;
        this.payamt = payamt;
        this.servicename = servicename;
    }

    // Getters and Setters
    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStoreorderno() {
        return storeorderno;
    }

    public void setStoreorderno(String storeorderno) {
        this.storeorderno = storeorderno;
    }

    public String getPayamt() {
        return payamt;
    }

    public void setPayamt(String payamt) {
        this.payamt = payamt;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }
}

