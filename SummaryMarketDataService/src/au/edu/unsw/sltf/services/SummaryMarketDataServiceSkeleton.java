
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *  SummaryMarketDataServiceSkeleton java skeleton for the axisService
 */
public class SummaryMarketDataServiceSkeleton implements SummaryMarketDataServiceSkeletonInterface{

    private final SimpleDateFormat myFormat = new SimpleDateFormat("dd-MMM-yyyy'T'HH:mm:ss.SSS");

	/**
	 * Auto generated method signature
	 * 
	 * @param summaryMarketData0 
	 * @return summaryMarketDataResponse1 
	 * @throws SummaryMarketDataFaultException 
	 */

	//TODO:  Validation
	public SummaryMarketDataResponseDocument summaryMarketData (SummaryMarketDataDocument reqDoc) throws SummaryMarketDataFaultException{
		SummaryMarketData req = reqDoc.getSummaryMarketData();
        
		String eventSetId = req.getEventSetId();
		
		//TODO: Make a request to download service to get this url
		URL dataSourceURL = null;
		try {
			dataSourceURL = new URL("http://www.cse.unsw.edu.au/~hpaik/9322/assignments/common/files_csv_spec/MarketData02.csv");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		
		
		//Process file and get values
		String sec = "";
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();
		String market = "";
		String currency = "Not Found";
		String size = humanReadableByteCount(getFileSize(dataSourceURL), true);
		
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(dataSourceURL.openStream()));
			// Skip first 'heading' line, then filter other lines.
	        String inputLine = in.readLine();
	        boolean first = true;
	        while ((inputLine = in.readLine()) != null)
	        {
	            String[] lineParts = inputLine.split(",");
	            Calendar tempCalendar = Calendar.getInstance();
	            tempCalendar.setTime(this.myFormat.parse(lineParts[1]+"T"+lineParts[2]));

	        	if (first) {
		            sec = lineParts[0];
		            market = lineParts[4];
		            startDate  = tempCalendar; 
		            endDate = tempCalendar;
	        		first = false;
	        	}
	        	
	        	if(!lineParts[5].isEmpty() && currency.equals("Not Found")) {
		            currency = getCurrency(lineParts[5]);
	        	}
	        	
	        	if(market != lineParts[4]) {
	        		market = "Mixed";
	        	}
	        	
	        	if (tempCalendar.getTimeInMillis() < startDate.getTimeInMillis()) {
	        		startDate = tempCalendar;
	        	}
	        	
	        	if (tempCalendar.getTimeInMillis() > endDate.getTimeInMillis()) {
	        		endDate = tempCalendar;
	        	}
	           
	        }
	        
	        
	        in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
       
        
		
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
	
	private String getCurrency(String price) {
		String code = "AUD";
		
		Pattern pattern = Pattern.compile("([a-zA-z]*)([0-9.]*)");
		Matcher matcher = pattern.matcher(price);
		matcher.find();
		if (matcher.find() && matcher.group(1) != "") {
			code = matcher.group(1);
		}
		
		return code;
	}
	
	private int getFileSize(URL url) {
		URLConnection conn;
		try {
			conn = url.openConnection();
		    return conn.getContentLength();
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	private static String humanReadableByteCount(long bytes, boolean si) {
	    int unit = si ? 1000 : 1024;
	    if (bytes < unit) return bytes + " B";
	    int exp = (int) (Math.log(bytes) / Math.log(unit));
	    String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
	    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
	}

}
