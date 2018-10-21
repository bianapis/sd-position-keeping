/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PositionKeepingApiService {

	PositionKeepingRecordResponse recordPostings(String crReferenceId, String bqReferenceId, PositionKeepingRecordRequest request);
	
	PositionKeepingAmountRecordResponse recordAmountBlocks(String crReferenceId, String bqReferenceId, PositionKeepingAmountRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	PositionKeepingTransactionJournalComplete retrieve(String crReferenceId);
	
	PositionKeepingAmountBlockWithID retrieveAmountBlocks(String crReferenceId, String bqReferenceId);
	
	PositionKeepingPostingComplete retrievePostings(String crReferenceId, String bqReferenceId);
	
	PositionKeepingReportingWithID retrieveReportings(String crReferenceId, String bqReferenceId);
	
	PositionKeepingUpdateComplete retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	PositionKeepingUpdateResponse update(String crReferenceId, PositionKeepingUpdateRequest request);
	
}
