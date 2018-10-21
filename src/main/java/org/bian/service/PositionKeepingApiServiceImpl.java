/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PositionKeepingApiServiceImpl implements PositionKeepingApiService {

	public PositionKeepingRecordResponse recordPostings(String crReferenceId, String bqReferenceId, PositionKeepingRecordRequest request){
		return JsonReader.read("record-PositionKeepingRecordResponse.json",new TypeReference<PositionKeepingRecordResponse>(){});
	}
	
	public PositionKeepingAmountRecordResponse recordAmountBlocks(String crReferenceId, String bqReferenceId, PositionKeepingAmountRecordRequest request){
		return JsonReader.read("record-PositionKeepingAmountRecordResponse.json",new TypeReference<PositionKeepingAmountRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PositionKeepingTransactionJournalComplete retrieve(String crReferenceId){
		return JsonReader.read("retrieve-PositionKeepingTransactionJournalComplete.json",new TypeReference<PositionKeepingTransactionJournalComplete>(){});
	}
	
	public PositionKeepingAmountBlockWithID retrieveAmountBlocks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PositionKeepingAmountBlockWithID.json",new TypeReference<PositionKeepingAmountBlockWithID>(){});
	}
	
	public PositionKeepingPostingComplete retrievePostings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PositionKeepingPostingComplete.json",new TypeReference<PositionKeepingPostingComplete>(){});
	}
	
	public PositionKeepingReportingWithID retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PositionKeepingReportingWithID.json",new TypeReference<PositionKeepingReportingWithID>(){});
	}
	
	public PositionKeepingUpdateComplete retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PositionKeepingUpdateComplete.json",new TypeReference<PositionKeepingUpdateComplete>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PositionKeepingUpdateResponse update(String crReferenceId, PositionKeepingUpdateRequest request){
		return JsonReader.read("update-PositionKeepingUpdateResponse.json",new TypeReference<PositionKeepingUpdateResponse>(){});
	}
	
}
