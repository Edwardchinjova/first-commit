package com.example.kenacfinale.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class SaveDataResponse {
    @Id
    private  String loanID;
    private  String customerNumber;
    private  String fullname;
    private  String id_number;
    private  String amount_to_disbused;
    private  String months_to_pay;
    private  String Bank;
    private  String bank_account_no;
    private  String Update;
    private  String STATUS;
    private  String time;
}
