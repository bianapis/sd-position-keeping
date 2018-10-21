package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingPostingComplete
 */
public class PositionKeepingPostingComplete   {
  private String postingReference = null;

  private String transactionJournalReference = null;

  private String postingPurpose = null;

  private String postingAmount = null;

  private String postingValueDate = null;

  private Object postingResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return postingReference
  **/

  public String getPostingReference() {
    return postingReference;
  }

  public void setPostingReference(String postingReference) {
    this.postingReference = postingReference;
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
   * @return postingPurpose
  **/

  public String getPostingPurpose() {
    return postingPurpose;
  }

  public void setPostingPurpose(String postingPurpose) {
    this.postingPurpose = postingPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount general-info: Credit/debit pair 
   * @return postingAmount
  **/

  public String getPostingAmount() {
    return postingAmount;
  }

  public void setPostingAmount(String postingAmount) {
    this.postingAmount = postingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return postingValueDate
  **/

  public String getPostingValueDate() {
    return postingValueDate;
  }

  public void setPostingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return postingResult
  **/

  public Object getPostingResult() {
    return postingResult;
  }

  public void setPostingResult(Object postingResult) {
    this.postingResult = postingResult;
  }


}

