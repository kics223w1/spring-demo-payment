package itx.examples.springboot.demo.dto.payment;

public class TransactionDetails {
    private String pginfo;
    private String timestamp;
    private String paytoken;
    private String trantime;
    private String cardkind;
    private String cardno;

    public TransactionDetails(String pginfo, String timestamp, String paytoken, String trantime, String cardkind, String cardno) {
        this.pginfo = pginfo;
        this.timestamp = timestamp;
        this.paytoken = paytoken;
        this.trantime = trantime;
        this.cardkind = cardkind;
        this.cardno = cardno;
    }

    // Getters and Setters
    public String getPginfo() {
        return pginfo;
    }

    public void setPginfo(String pginfo) {
        this.pginfo = pginfo;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPaytoken() {
        return paytoken;
    }

    public void setPaytoken(String paytoken) {
        this.paytoken = paytoken;
    }

    public String getTrantime() {
        return trantime;
    }

    public void setTrantime(String trantime) {
        this.trantime = trantime;
    }

    public String getCardkind() {
        return cardkind;
    }

    public void setCardkind(String cardkind) {
        this.cardkind = cardkind;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }
}

