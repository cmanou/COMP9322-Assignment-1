
/**
 * SummaryMarketDataServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package au.edu.unsw.sltf.services;

import au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData;
import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument;
import au.edu.unsw.sltf.services.SummaryMarketDataDocument;
import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse;

import java.net.URL;
import java.util.Calendar;

import org.apache.axis2.databinding.types.URI;
import org.apache.axis2.databinding.types.URI.MalformedURIException;

/**
 *  SummaryMarketDataServiceSkeleton java skeleton for the axisService
 */
public class SummaryMarketDataServiceSkeleton implements SummaryMarketDataServiceSkeletonInterface{


	/**
	 * Auto generated method signature
	 * 
	 * @param summaryMarketData0 
	 * @return summaryMarketDataResponse1 
	 * @throws SummaryMarketDataFaultException 
	 */

	public SummaryMarketDataResponseDocument summaryMarketData (SummaryMarketDataDocument reqDoc) throws SummaryMarketDataFaultException{
		SummaryMarketData req = reqDoc.getSummaryMarketData();
        
		String eventSetId = req.getEventSetId();
		
		//TODO: Make a request to download service
		try {
			URI dataSourceURL = new URI();
			dataSourceURL.setScheme("http");
			dataSourceURL.setHost("www.cse.unsw.edu.au");
			dataSourceURL.setPath("/~hpaik/9322/assignments/common/files_csv_spec/MarketData02.csv");
			
			
		} catch (MalformedURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//TODO:  Validation
		
		//TODO: Get the file from DownloadService
		
		
		//TODO: Process file and get values
		String sec = "sec Code";
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();
		String market = "Both";
		String currency = "AUD";
		String size = "1MB";
		
		//Create Response Object
		SummaryMarketDataResponseDocument resDoc = SummaryMarketDataResponseDocument.Factory.newInstance();
		SummaryMarketDataResponse res = resDoc.addNewSummaryMarketDataResponse();
        
        res.setEventSetId(eventSetId);
        res.setSec(sec);
		res.setEndDate(endDate);
		res.setStartDate(startDate);
		res.setMarketType(market);
		res.setCurrencyCode(currency);
		res.setFileSize(size);

        return resDoc;		
		
	}

}
