package com.example.kenacfinale.contoller;


import com.example.kenacfinale.model.SaveDataRequest;
import com.example.kenacfinale.model.SaveDataResponse;
import com.example.kenacfinale.repository.SaveDataDAO;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://127.0.0.1:5500", maxAge = 3600)
@RestController
@Slf4j
@RequestMapping(value = "/Escrow2077/v004/api")

public class HomeController {
    @GetMapping(path = "/checkHealthy", produces = {"application/json"})
    public ResponseEntity<?> checkMe() {
        return (ResponseEntity.status(HttpStatus.OK).body("API Healthy"));
    }

    @Autowired
    SaveDataDAO saveDataDAO;
    SaveDataRequest saveDataRequest;
    SaveDataResponse saveDataResponse = new SaveDataResponse();

    @RequestMapping(path = "/saveData", method = RequestMethod.POST, produces = {"application/json"})
    public ResponseEntity<?> saveData(@NonNull @RequestBody SaveDataRequest saveDataRequest) {
        if (saveDataRequest.getClass().isInstance(SaveDataRequest.class)) {
            log.error("Zvaendwa");
            return ResponseEntity.badRequest().build();
        } else {
            try {
                saveDataDAO.save(saveDataRequest);
                boolean mike = saveDataDAO.updateNeccessaryTables(saveDataRequest.getCreatedBy(), saveDataRequest.getRoleid());

                //                List<SaveDataDAO.SavedDataResponse> saveDataResponses = saveDataDAO.getSavedData(saveDataRequest.getIdNo());
                if (mike = true) {
                    saveDataResponse.setCustomerNumber("Created");
                    saveDataResponse.setAmount_to_disbused(saveDataRequest.getLoanAmount());
                    saveDataResponse.setFullname(saveDataRequest.getForenames());
                    saveDataResponse.setId_number(saveDataRequest.getIdNo());
                    saveDataResponse.setBank(saveDataRequest.getBank());
                    saveDataResponse.setBank_account_no(saveDataRequest.getBankaccountno());
                    saveDataResponse.setMonths_to_pay(saveDataRequest.getLoanTenure());
                    saveDataResponse.setSTATUS("MCC APPROVAL");
                    saveDataResponse.setLoanID("Created");
                    saveDataResponse.setUpdate("CREATED SUCCESSFULLY");
                    saveDataResponse.setTime(getCurrentTimeStamp());
                    return ResponseEntity.ok().body(saveDataResponse);
                } else {
                    saveDataResponse.setCustomerNumber("Failed");
                    saveDataResponse.setAmount_to_disbused(saveDataRequest.getLoanAmount());
                    saveDataResponse.setFullname(saveDataRequest.getForenames());
                    saveDataResponse.setId_number(saveDataRequest.getIdNo());
                    saveDataResponse.setBank(saveDataRequest.getBank());
                    saveDataResponse.setBank_account_no(saveDataRequest.getBankaccountno());
                    saveDataResponse.setMonths_to_pay(saveDataRequest.getLoanTenure());
                    saveDataResponse.setSTATUS("Failed");
                    saveDataResponse.setLoanID("Failed");
                    saveDataResponse.setUpdate("FAILED TO CREATE");
                    saveDataResponse.setTime(getCurrentTimeStamp());
                }
            } catch (Exception ex) {

//                saveDataResponse.setCustomerNumber("Created");
//                saveDataResponse.setAmount_to_disbused(saveDataRequest.getLoanAmount());
//                saveDataResponse.setFullname(saveDataRequest.getForenames());
//                saveDataResponse.setId_number(saveDataRequest.getIdNo());
//                saveDataResponse.setBank(saveDataRequest.getBank());
//                saveDataResponse.setBank_account_no(saveDataRequest.getBankaccountno());
//                saveDataResponse.setMonths_to_pay(saveDataRequest.getLoanTenure());
//                saveDataResponse.setSTATUS("MCC APPROVAL");
//                saveDataResponse.setLoanID("Created");
//                saveDataResponse.setUpdate("CREATED SUCCESSFULLY");
//                saveDataResponse.setTime(getCurrentTimeStamp());
//                return ResponseEntity.ok().body(saveDataResponse);
//                //return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(saveDataResponse);
            }
        }
        return null;
    }
    private String getCurrentTimeStamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmm'T'ss");
        LocalDateTime now = LocalDateTime.now();
        return "rct".concat(dtf.format(now));
    }
}

