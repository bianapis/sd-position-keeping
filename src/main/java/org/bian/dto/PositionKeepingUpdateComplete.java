package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingUpdateComplete
 */
public class PositionKeepingUpdateComplete   {
  private String updateReference = null;

  private String transactionJournalReference = null;

  private String journalUpdatePurpose = null;

  private String journalUpdateEmployeeReference = null;

  private String journalUpdateDescription = null;

  private Object journalUpdateResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return updateReference
  **/

  public String getUpdateReference() {
    return updateReference;
  }

  public void setUpdateReference(String updateReference) {
    this.updateReference = updateReference;
  }


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
   * @return journalUpdatePurpose
  **/

  public String getJournalUpdatePurpose() {
    return journalUpdatePurpose;
  }

  public void setJournalUpdatePurpose(String journalUpdatePurpose) {
    this.journalUpdatePurpose = journalUpdatePurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: For audit purposes 
   * @return journalUpdateEmployeeReference
  **/

  public String getJournalUpdateEmployeeReference() {
    return journalUpdateEmployeeReference;
  }

  public void setJournalUpdateEmployeeReference(String journalUpdateEmployeeReference) {
    this.journalUpdateEmployeeReference = journalUpdateEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return journalUpdateDescription
  **/

  public String getJournalUpdateDescription() {
    return journalUpdateDescription;
  }

  public void setJournalUpdateDescription(String journalUpdateDescription) {
    this.journalUpdateDescription = journalUpdateDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return journalUpdateResult
  **/

  public Object getJournalUpdateResult() {
    return journalUpdateResult;
  }

  public void setJournalUpdateResult(Object journalUpdateResult) {
    this.journalUpdateResult = journalUpdateResult;
  }


}

