package itx.examples.springboot.demo.dto.notification;

public class NotificationInfo {
    private String notifytype;
    private String retcode;
    private String retmsg;
    private String notifyid;
    private String hash;

    public NotificationInfo(String notifytype, String retcode, String retmsg, String notifyid, String hash) {
        this.notifytype = notifytype;
        this.retcode = retcode;
        this.retmsg = retmsg;
        this.notifyid = notifyid;
        this.hash = hash;
    }

    // Getters and Setters
    public String getNotifytype() {
        return notifytype;
    }

    public void setNotifytype(String notifytype) {
        this.notifytype = notifytype;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getRetmsg() {
        return retmsg;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg;
    }

    public String getNotifyid() {
        return notifyid;
    }

    public void setNotifyid(String notifyid) {
        this.notifyid = notifyid;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}

