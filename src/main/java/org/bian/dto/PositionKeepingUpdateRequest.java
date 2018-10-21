package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingUpdateRequest
 */
public class PositionKeepingUpdateRequest   {
  private String transactionJournalReference = null;

  private String journalUpdatePurpose = null;

  private String journalUpdateEmployeeReference = null;

  private String journalUpdateDescription = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Transaction Journal Reference 
   * @return transactionJournalReference
  **/

  public String getTransactionJournalReference() {
    return transactionJournalReference;
  }

  public void setTransactionJournalReference(String transactionJournalReference) {
    this.transactionJournalReference = transactionJournalReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Journal Update Purpose 
   * @return journalUpdatePurpose
  **/

  public String getJournalUpdatePurpose() {
    return journalUpdatePurpose;
  }

  public void setJournalUpdatePurpose(String journalUpdatePurpose) {
    this.journalUpdatePurpose = journalUpdatePurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Journal Update Employee Reference for audit purposes 
   * @return journalUpdateEmployeeReference
  **/

  public String getJournalUpdateEmployeeReference() {
    return journalUpdateEmployeeReference;
  }

  public void setJournalUpdateEmployeeReference(String journalUpdateEmployeeReference) {
    this.journalUpdateEmployeeReference = journalUpdateEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Journal Update Description 
   * @return journalUpdateDescription
  **/

  public String getJournalUpdateDescription() {
    return journalUpdateDescription;
  }

  public void setJournalUpdateDescription(String journalUpdateDescription) {
    this.journalUpdateDescription = journalUpdateDescription;
  }


}

