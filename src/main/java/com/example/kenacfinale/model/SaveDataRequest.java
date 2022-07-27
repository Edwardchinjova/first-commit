package com.example.kenacfinale.model;



import lombok.*;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "kenacsubmissions")

public class SaveDataRequest {

    @javax.persistence.Id
    @GeneratedValue(
            strategy= GenerationType.IDENTITY
    )
    private  int Id;

    @Column(name = "BRANCH_CODE", nullable = false)
    private String branchCode;

    @Column(name = "BRANCH_NAME", nullable = false)
    private String branchName;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "GENDER", nullable = false)
    private String gender;

    @Column(name = "FORENAMES", nullable = false)
    private String forenames;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "IDNO",unique = true, nullable = false)
    private String idNo;

    @Column(name = "DOB", nullable = false)
    private LocalDate dob;


    @Column(name = "NATIONALITY", nullable = false)
    private String nationality;

    @Column(name = "USACitizenShip", nullable = false)
    private String usaCitizenship;

    @Column(name = "USAResidentCard", nullable = false)
    private String usaResidentCard;

    @Column(name = "NO_DEPENDANTS", nullable = false)
    private String noOfDependants;

    @Column(name = "Street_Number", nullable = false)
    private String streetNumber;

    @Column(name = "Street_Name", nullable = false)
    private String streetName;

    @Column(name = "Town", nullable = false)
    private String Town;

    @Column(name = "POSTALADDRESS", nullable = false)
    private String postalAddress;

    @Column(name = "HOME_TYPE", nullable = false)
    private String homeType;

    @Column(name = "HOME_LENGTH", nullable = false)
    private String homeLength;

    @Column(name = "PHONE_NO", nullable = false)
    private String phoneNumber;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "INITIALS", nullable = false)
    private String initials;

    @Column(name = "INSOLVENT", nullable = false)
    private String insolvent;

    @Column(name = "MARITAL_STATUS", nullable = false)
    private String maritalStatus;


    @Column(name = "INSOLVENTDETAIL", nullable = false)
    private String insolventDetail;

    @Column(name = "MICROFINANCERELATED", nullable = false)
    private String microfinanceRelated;

    @Column(name = "MICROFINANCERELATEDNAME", nullable = false)
    private String microfinanceRelatedName;

    @Column(name = "CURR_EMPLOYER", nullable = false)
    private String currEmployer;


    @Column(name = "CURR_EMP_ADD", nullable = false)
    private String currEmpAdd;


    @Column(name = "CURR_EMP_LENGTH_YEAR", nullable = false)
    private String currEmpLengthYear;


    @Column(name = "CURR_EMP_PHONE", nullable = false)
    private String currEmpPhone;


    @Column(name = "CURR_EMP_EMAIL", nullable = false)
    private String currEmpEmail;

    @Column(name = "CURR_EMP_POSITION", nullable = false)
    private String currEmpPosition;


    @Column(name = "CURR_EMP_SALARY", nullable = false)
    private String currEmpSalary;


    @Column(name = "CURR_EMP_NET", nullable = false)
    private String currEmpNet;


    @Column(name = "OtherIncomeSources")
    private String otherIncomeSources;

    @Column(name = "MONTHLYSALARYDATE", nullable = false)
    private String monthlySalaryDate;

    @Column(name = "SPOUSE_NAME", nullable = false)
    private String spouseName;

    @Column(name = "SPOUSE_ADDRESS", nullable = false)
    private String spouseAddress;

    @Column(name = "SPOUSE_EMAIL", nullable = false)
    private String spouseEmail;

    @Column(name = "SPOUSE_EMPLOYER", nullable = false)
    private String spouseEmployer;

    @Column(name = "SPOUSE_EMPADD", nullable = false)
    private String spouseEmpAdd;

    @Column(name = "SPOUSE_PHONE", nullable = false)
    private String spousePhone;

    @Column(name = "Nextofkin_REL_NAME", nullable = false)
    private String nextOfKinRelName;

    @Column(name = "NEXTOFKIN_REL_ADD", nullable = false)
    private String nextOfKinRelAdd;


    @Column(name = "NEXTOFKIN_REL_PHONE", nullable = false)
    private String nextOfKinRelPhone;

    @Column(name = "NEXTOFKIN_REL_BUSTEL", nullable = false)
    private String nextOfKinRelBustel;

    @Column(name = "NEXTOFKIN_REL_MOBILETEL", nullable = false)
    private String nextOfKinRelMoBitel;


    @Column(name = "NEXTOFKIN_REL_RELTNSHP", nullable = false)
    private String nextOfKinRelReltshp;

    @Column(name = "GUARANTOR_EMPLOYER", nullable = false)
    private String guarantorEmployer;


    @Column(name = "GUARANTOR_EMPLOYER_ADD", nullable = false)
    private String guarantorEmployerAdd;



    @Column(name = "GUARANTOR_EMPLOYER_HOMETEL", nullable = false)
    private String guarantorEmployerHomeTel;


    @Column(name = "ECNO", nullable = false)
    private String ecno;

    @Column(name = "EmploymentType", nullable = false)
    private String employmentType;

    @Column(name = "TimeCurrRes", nullable = false)
    private String timeCurrRes;

    @Column(name = "TimePrevRes", nullable = false)
    private String timePrevRes;

    @Column(name = "SpouseEmployed", nullable = false)
    private String spouseEmployed;


    @Column(name = "CIVILJUDGEMENTS", nullable = false)
    private String civilJudgements;

    @Column(name = "SectionCode", nullable = false)
    private String sectionCode;

    @Column(name = "Currency", nullable = false)
    private String currency;


    @Column(name = "GUARANTOR_IDNO", nullable = false)
    private String guarantorIdno;


    @Column(name = "GUARANTOR_PHONE", nullable = false)
    private String guarantorPhone;


    @Column(name = "GUARANTOR_ADD", nullable = false)
    private String guarantorAdd;



    @Column(name = "GUARANTOR_CITY", nullable = false)
    private String guarantorCity;


    @Column(name = "GUARANTOR_HOME_TYPE", nullable = false)
    private String guarantorHomeType;


    @Column(name = "GUARANTOR_RENT", nullable = false)
    private String guarantorRent;

    @Column(name = "GUARANTOR_HOME_LENGTH", nullable = false)
    private String guarantorHomeLength;


    @Column(name = "GUARANTOR_EMPLOYER_", nullable = false)
    private String guarantorEmployer_;


    @Column(name = "GUARANTOR_EMP_ADD", nullable = false)
    private String guarantorEmpAdd;

    @Column(name = "GUARANTOR_EMP_LENGTH", nullable = false)
    private String guarantorEmpLength;


    @Column(name = "GUARANTOR_EMP_PHONE", nullable = false)
    private String guarantorEmpPhone;


    @Column(name = "GUARANTOR_EMP_EMAIL", nullable = false)
    private String guarantorEmpEmail;

    @Column(name = "GUARANTOR_EMP_POSTN", nullable = false)
    private String guarantorEmpPostn;

    @Column(name = "GUARANTOR_EMP_SALARY", nullable = false)
    private String guarantorEmpSalary;

    @Column(name = "GUARANTOR_EMP_INCOME", nullable = false)
    private String guarantorEmpIncome;


    @Column(name = "FIN_AMT", nullable = false)
    private String loanAmount;



    @Column(name = "FIN_TENOR", nullable = false)
    private String loanTenure;

    @Column(name = "FIN_INT_RATE", nullable = false)
    private String loanInterestRate;


    @Column(name = "FIN_PURPOSE", nullable = false)
    private String loanPurpose;


    @Column(name = "FIN_REPAY_DATE", nullable = false)
    private String loanRepayDate;

    @Column(name = "APPL_DATE", nullable = false)
    private String loanApplicationDate;

    @Column(name = "RECOMMENDED_AMT", nullable = false)
    private String recomendedLoanAmount;

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy;

    @Column(name = "FinProductType", nullable = false)
    private String loanProductType;


    @Column(name = "Sector", nullable = false)
    private String sector;


    @Column(name = "CurrBorrowings", nullable = false)
    private String currBorrowings;


    @Column(name = "PrevBorrowings", nullable = false)
    private String prevBorrowings;

    @Column(name = "Citizenship", nullable = false)
    private String citizenship;

    @Column(name = "defaulthistory", nullable = false)
    private String defaulthistory;

    @Column(name = "mainincomesource", nullable = false)
    private String mainincomesource;

    @Column(name = "empolymentType", nullable = false)
    private String empolymentType;

    @Column(name = "netincome", nullable = false)
    private String netincome;

    @Column(name = "bank", nullable = false)
    private String bank;

    @Column(name = "branch", nullable = false)
    private String branch;


    @Column(name = "Bankaccountno", nullable = false)
    private String bankaccountno;



    @Column(name = "Accountsotherbanks", nullable = false)
    private String accountsotherbanks;



    @Column(name = "otherpropertyowenership", nullable = false)
    private String otherpropertyowenership;


    @Column(name = "nextofkinrelatioship", nullable = false)
    private String nextofkinrelatioship;



    @Column(name = "periodinmonths", nullable = false)
    private String periodinmonths;


    @Column(name = "RepaymentIntervalNum", nullable = false)
    private String repaymentIntervalNum;

    @Column(name = "RepaymentUnitInterval", nullable = false)
    private String repaymentUnitInterval;

    @Column(name = "AdminRate", nullable = false)
    private String adminRate;

    @Column(name = "EmailOwner", nullable = false)
    private String emailOwner;

    @Column(name = "Monthly_Payment", nullable = false)
    private String loanthlyInstallment;


//    @Column(name = "IsChiboque", nullable = false)
//    private Boolean isChiboque;
//
//    @Column(name = "ChiboqueLoanID", nullable = false)
//    private String chiboqueLoanID;

    @Column(name = "saltisUploadFile", nullable = false)
    private String savedFrom;

    @Column(name = "Agent", nullable = false)
    private String agent;

    @Column(name = "AgentReference", nullable = false)
    private String agentReference;

    @Column(name = "SSBRefrence")
    private String ssbRefrence;

    @Column(name = "EMPLOYER_CONTACT_PERSON", nullable = false)
    private String employerContactPerson;


    @Column(name = "NEXT_OF_KIN_EMPLOYER_NAME", nullable = false)
    private String nextOfKinEmployerName;

    @Column(name = "RefundBank", nullable = false)
    private String refundBank;

    @Column(name = "RefundBranch", nullable = false)
    private String refundBranch;

    @Column(name = "RefundBankAccNo", nullable = false)
    private String refundBankAccNo;

    @Column(name = "roleid", nullable = false)
    private String  roleid;

}


//             "branchCode":"String",
//             "branchName":"String",
//             "title":"String",
//             "gender":"String",
//             "forenames":"String",
//             "surname":"String",
//             "idNo":"String",
//             "dob":"String",
//             "nationality":"String",
//             "usaCitizenship":"String",
//             "usaResidentCard":"String",
//             "noOfDependants":"String",
//             "streetNumber":"String",
//             "streetName":"String",
//             "Town":"String",
//             "postalAddress":"String",
//             "homeType":"String",
//             "homeLength":"String",
//             "phoneNumber":"String",
//             "email":"String",
//             "initials":"String",
//             "insolvent":"String",
//             "maritalStatus":"String",
//             "insolventDetail":"String",
//             "microfinanceRelated":"String",
//             "microfinanceRelatedName":"String",
//             "currEmployer":"String",
//             "currEmpAdd":"String",
//             "currEmpLengthYear":"String",
//             "currEmpPhone":"String",
//             "currEmpEmail":"String",
//             "currEmpPosition":"String",
//             "currEmpSalary":"String",
//             "currEmpNet":"String",
//             "otherIncomeSources":"String",
//             "monthlySalaryDate":"String",
//             "spouseName":"String",
//             "spouseAddress":"String",
//             "spouseEmail":"String",
//             "spouseEmployer":"String",
//             "spouseEmpAdd":"String",
//             "spousePhone":"String",
//             "nextOfKinRelName":"String",
//             "nextOfKinRelAdd":"String",
//             "nextOfKinRelPhone":"String",
//             "nextOfKinRelBustel":"String",
//             "nextOfKinRelMoBitel":"String",
//             "nextOfKinRelReltshp":"String",
//             "guarantorEmployer":"String",
//             "guarantorEmployerAdd":"String",
//             "guarantorEmployerHomeTel":"String",
//             "ecno":"String",
//             "employmentType":"String",
//             "timeCurrRes":"String",
//             "timePrevRes":"String",
//             "spouseEmployed":"String",
//             "civilJudgements":"String",
//             "sectionCode":"String",
//             "currency":"String",
//             "guarantorIdno":"String",
//             "guarantorPhone":"String",
//             "guarantorAdd":"String",
//             "guarantorCity":"String",
//             "guarantorHomeType":"String",
//             "guarantorRent":"String",
//             "guarantorHomeLength":"String",
//             "guarantorEmployer_":"String",
//             "guarantorEmpAdd":"String",
//             "guarantorEmpLength":"String",
//             "guarantorEmpPhone":"String",
//             "guarantorEmpEmail":"String",
//             "guarantorEmpPostn":"String",
//             "guarantorEmpSalary":"String",
//             "guarantorEmpIncome":"String",
//             "loanAmount":"String",
//             "loanTenure":"String",
//             "loanPurpose":"String",
//             "loanRepayDate":"String",
//             "loanApplicationDate":"String",
//             "recomendedLoanAmount":"String",
//             "createdBy":"String",
//             "loanProductType":"String",
//             "sector":"String",
//             "currBorrowings":"String",
//             "prevBorrowings":"String",
//             "citizenship":"String",
//             "defaulthistory":"String",
//             "mainincomesource":"String",
//             "empolymentType":"String",
//             "netincome":"String",
//             "bank":"String",
//             "branch":"String",
//             "bankaccountno":"String",
//             "accountsotherbanks":"String",
//             "otherpropertyowenership;":"String",
//             "nextofkinrelatioship":"String",
//             "periodinmonths":"String",
//             "repaymentIntervalNum":"String",
//             "repaymentUnitInterval":"String",
//             "adminRate":"String",
//             "emailOwner":"String",
//             "loanthlyInstallment":"String",
//             " isChiboque":"String",
//             "chiboqueLoanID":"String",
//             "savedFrom":"String",
//             "agent":"String",
//             "agentReference":"String",
//             "ssbRefrence":"String",
//             "employerContactPerson":"String",
//             "nextOfKinEmployerName":"String",
//             "refundBank":"String",
//             "refundBranch":"String",
//             "refundBankAccNo":"String",
//             "roleid":"String"












