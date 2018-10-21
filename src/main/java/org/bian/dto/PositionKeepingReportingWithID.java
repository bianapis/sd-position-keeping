package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PositionKeepingReportingWithID
 */
public class PositionKeepingReportingWithID   {
  private String transactionJournalReference = null;

  private String reportingServiceReference = null;

  private String positionKeepingServiceReference = null;

  private String journalReportType = null;

  private String reportingPeriod = null;

  private String report = null;

  private Object reportingResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return reportingServiceReference
  **/

  public String getReportingServiceReference() {
    return reportingServiceReference;
  }

  public void setReportingServiceReference(String reportingServiceReference) {
    this.reportingServiceReference = reportingServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return positionKeepingServiceReference
  **/

  public String getPositionKeepingServiceReference() {
    return positionKeepingServiceReference;
  }

  public void setPositionKeepingServiceReference(String positionKeepingServiceReference) {
    this.positionKeepingServiceReference = positionKeepingServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return journalReportType
  **/

  public String getJournalReportType() {
    return journalReportType;
  }

  public void setJournalReportType(String journalReportType) {
    this.journalReportType = journalReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return reportingPeriod
  **/

  public String getReportingPeriod() {
    return reportingPeriod;
  }

  public void setReportingPeriod(String reportingPeriod) {
    this.reportingPeriod = reportingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: Journal statement 
   * @return report
  **/

  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: List of actions within the journal 
   * @return reportingResult
  **/

  public Object getReportingResult() {
    return reportingResult;
  }

  public void setReportingResult(Object reportingResult) {
    this.reportingResult = reportingResult;
  }


}

