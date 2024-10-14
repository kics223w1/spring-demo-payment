package itx.examples.springboot.demo.controller;

import itx.examples.springboot.demo.dto.notification.NotificationInfo;
import itx.examples.springboot.demo.dto.notification.PayletterNotification;
import itx.examples.springboot.demo.dto.payment.PayerInfo;
import itx.examples.springboot.demo.dto.payment.PaymentDetails;
import itx.examples.springboot.demo.dto.payment.TransactionDetails;
import itx.examples.springboot.demo.services.HashService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@RestController
@RequestMapping(path = "/payletter")
public class PayletterServiceController {

    private static final Logger LOG = LoggerFactory.getLogger(PayletterServiceController.class);
    private static final String HASH_KEY = "PL_Merchant";

    private final HashService hashService = new HashService();

    @PostMapping(path = "/noti")
    public ResponseEntity<String> receiveNotification(
            @RequestParam String storeid,
            @RequestParam String countrycode,
            @RequestParam String currency,
            @RequestParam String storeorderno,
            @RequestParam String payamt,
            @RequestParam String payerid,
            @RequestParam String payeremail,
            @RequestParam String servicename,
            @RequestParam(required = false) String custom,
            @RequestParam(required = false) String payinfo,
            @RequestParam String pginfo,
            @RequestParam String timestamp,
            @RequestParam String hash,
            @RequestParam String notifytype,
            @RequestParam String paytoken,
            @RequestParam String trantime,
            @RequestParam String retcode,
            @RequestParam(required = false) String retmsg,
            @RequestParam(required = false) String poqtoken,
            @RequestParam String cardkind,
            @RequestParam String cardno,
            @RequestParam String notifyid) {

        LOG.info("Received Payletter Notification: storeid={}, currency={}, storeorderno={}, payamt={}, payerid={}, notifytype={}",
                storeid, currency, storeorderno, payamt, payerid, notifytype);

        // 1. Check if the required parameters are present
        if (storeid == null || currency == null || storeorderno == null || payamt == null || payerid == null || timestamp == null) {
            return ResponseEntity.ok("<RESULT>FAIL</RESULT>");
        }

        // 2. Validate the return code
        if (!"0".equals(retcode)) {
            return ResponseEntity.ok("<RESULT>FAIL</RESULT>");
        }

        // 3. Verify the SHA256 hash
        String hashData = storeid + currency + storeorderno + payamt + payerid + timestamp + HASH_KEY;
        String verifyHash = hashService.generateHash(hashData);
        if (!verifyHash.equals(hash)) {
            return ResponseEntity.ok("<RESULT>FAIL</RESULT>");
        }

        // 4. Process according to NotifyType
        switch (notifytype) {
            case "1":
                // Success/Purchasing processing progress
                // Implement success logic here (e.g., charge the customer)
                break;
            case "2":
                // Refund/Cancellation processing
                // Implement refund logic here
                break;
            default:
                // Invalid NotifyType, refer to documentation
                break;
        }

        // Return OK if everything was processed successfully
        return ResponseEntity.ok("<RESULT>OK</RESULT>");
    }
}
