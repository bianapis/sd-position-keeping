package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingRecordRequest
 */
public class PositionKeepingRecordRequest   {
  private String postingPurpose = null;

  private String postingAmount = null;

  private String postingValueDate = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
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


}

