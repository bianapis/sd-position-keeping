/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class PositionKeepingApiController {

	@Autowired
	PositionKeepingApiService service;
	
	@BQ("postings")
	@Track.Record
	public BianResponse<PositionKeepingRecordResponse> recordPostings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<PositionKeepingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordPostings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("amount-blocks")
	@Track.Record
	public BianResponse<PositionKeepingAmountRecordResponse> recordAmountBlocks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<PositionKeepingAmountRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordAmountBlocks(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Track.Retrieve
	public BianResponse<PositionKeepingTransactionJournalComplete> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("amount-blocks")
	@Track.Retrieve
	public BianResponse<PositionKeepingAmountBlockWithID> retrieveAmountBlocks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAmountBlocks(crReferenceId, bqReferenceId));
	}
	
	@BQ("postings")
	@Track.Retrieve
	public BianResponse<PositionKeepingPostingComplete> retrievePostings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePostings(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Track.Retrieve
	public BianResponse<PositionKeepingReportingWithID> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Track.Retrieve
	public BianResponse<PositionKeepingUpdateComplete> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Track.Update
	public BianResponse<PositionKeepingUpdateResponse> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PositionKeepingUpdateRequest> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
