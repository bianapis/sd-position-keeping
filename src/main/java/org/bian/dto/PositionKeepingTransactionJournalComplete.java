package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingTransactionJournalComplete
 */
public class PositionKeepingTransactionJournalComplete   {
  private String transactionJournalReference = null;

  private String transactionJournalType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String counterpartyReference = null;

  private String accountingJurisdictionOrCompliance = null;

  private String baseCurrency = null;

  private String interestAllocationRules = null;

  private String positionLimitsAndRules = null;

  private String initiationDate = null;

  private String authorization = null;

  private String status = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return transactionJournalReference
  **/

  public String getTransactionJournalReference() {
    return transactionJournalReference;
  }

  public void setTransactionJournalReference(String transactionJournalReference) {
    this.transactionJournalReference = transactionJournalReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionJournalType
  **/

  public String getTransactionJournalType() {
    return transactionJournalType;
  }

  public void setTransactionJournalType(String transactionJournalType) {
    this.transactionJournalType = transactionJournalType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: linked product/service reference number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: product/service account holder 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Merchant refernce, card network reference 
   * @return counterpartyReference
  **/

  public String getCounterpartyReference() {
    return counterpartyReference;
  }

  public void setCounterpartyReference(String counterpartyReference) {
    this.counterpartyReference = counterpartyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return accountingJurisdictionOrCompliance
  **/

  public String getAccountingJurisdictionOrCompliance() {
    return accountingJurisdictionOrCompliance;
  }

  public void setAccountingJurisdictionOrCompliance(String accountingJurisdictionOrCompliance) {
    this.accountingJurisdictionOrCompliance = accountingJurisdictionOrCompliance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return baseCurrency
  **/

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return interestAllocationRules
  **/

  public String getInterestAllocationRules() {
    return interestAllocationRules;
  }

  public void setInterestAllocationRules(String interestAllocationRules) {
    this.interestAllocationRules = interestAllocationRules;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return positionLimitsAndRules
  **/

  public String getPositionLimitsAndRules() {
    return positionLimitsAndRules;
  }

  public void setPositionLimitsAndRules(String positionLimitsAndRules) {
    this.positionLimitsAndRules = positionLimitsAndRules;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return initiationDate
  **/

  public String getInitiationDate() {
    return initiationDate;
  }

  public void setInitiationDate(String initiationDate) {
    this.initiationDate = initiationDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Reference, date, etc. 
   * @return authorization
  **/

  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Active, in-suspense, unbilled/billed, etc. 
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}

