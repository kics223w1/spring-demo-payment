package itx.examples.springboot.demo.dto.payment;

public class PayerInfo {
    private String payerid;
    private String payeremail;
    private String custom;

    public PayerInfo(String payerid, String payeremail, String custom) {
        this.payerid = payerid;
        this.payeremail = payeremail;
        this.custom = custom;
    }

    // Getters and Setters
    public String getPayerid() {
        return payerid;
    }

    public void setPayerid(String payerid) {
        this.payerid = payerid;
    }

    public String getPayeremail() {
        return payeremail;
    }

    public void setPayeremail(String payeremail) {
        this.payeremail = payeremail;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }
}
