
/**
 * SummaryMarketDataServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package au.edu.unsw.sltf.services;

import au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData;
import au.edu.unsw.sltf.services.SummaryMarketDataFaultDocument.SummaryMarketDataFault;
import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument;
import au.edu.unsw.sltf.services.SummaryMarketDataDocument;
import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *  SummaryMarketDataServiceSkeleton java skeleton for the axisService
 */
public class SummaryMarketDataServiceSkeleton implements SummaryMarketDataServiceSkeletonInterface{

    private final SimpleDateFormat myFormat = new SimpleDateFormat("dd-MMM-yyyy'T'HH:mm:ss.SSS");
    private final String MY_CORE_PATH = System.getProperty("java.io.tmpdir")+"/cjze477_ass1";
    private final String PRIVATE_PATH = "/private";
    private final String SUFFIX = ".csv";
    
	/**
	 * Auto generated method signature
	 * 
	 * @param summaryMarketData0 
	 * @return summaryMarketDataResponse1 
	 * @throws SummaryMarketDataFaultException 
	 */

	public SummaryMarketDataResponseDocument summaryMarketData (SummaryMarketDataDocument reqDoc) throws SummaryMarketDataFaultException{
		SummaryMarketData req = reqDoc.getSummaryMarketData();
        
		//Get The file from private directory
		String eventSetId = req.getEventSetId();
		 // Check that the id is of a valid format.
        if(!eventSetId.matches("^9322-[0-9]+$"))
        {    		
            // Invalid Event Id.
        	SummaryMarketDataFaultDocument myFaultDoc = SummaryMarketDataFaultDocument.Factory.newInstance();
    		SummaryMarketDataFault myFault = myFaultDoc.addNewSummaryMarketDataFault();
    		
            myFault.setFaultType(SummaryMarketDataFaultType.INVALID_EVENT_SET_ID);
            myFault.setFaultMessage("Invalid Event Id Format!");
            
            SummaryMarketDataFaultException myException = new SummaryMarketDataFaultException();
            myException.setFaultMessage(myFaultDoc);
            throw myException;
        }
        
        // Check that event id can be found.
        File myFile = new File(this.MY_CORE_PATH+this.PRIVATE_PATH+"/"+eventSetId+this.SUFFIX);
        if(!myFile.exists())
        {
            // File not found.
        	SummaryMarketDataFaultDocument myFaultDoc = SummaryMarketDataFaultDocument.Factory.newInstance();
    		SummaryMarketDataFault myFault = myFaultDoc.addNewSummaryMarketDataFault();
    		
            myFault.setFaultType(SummaryMarketDataFaultType.INVALID_EVENT_SET_ID);
            myFault.setFaultMessage("Event File does not exist!");
            
            SummaryMarketDataFaultException myException = new SummaryMarketDataFaultException();
            myException.setFaultMessage(myFaultDoc);
            throw myException;
        }
		
		
		//Process file and get values
		String sec = "";
        Calendar startDate = Calendar.getInstance();
        Calendar endDate = Calendar.getInstance();
		String market = "";
		String currency = "";
		String size = humanReadableByteCount(getFileSize(myFile), true);
		
		try {

			BufferedReader in = new BufferedReader(new FileReader(myFile));
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
	        	
	        	if(!lineParts[5].isEmpty() && currency.isEmpty()) {
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
		} catch (FileNotFoundException e) {
            // File not found.
        	SummaryMarketDataFaultDocument myFaultDoc = SummaryMarketDataFaultDocument.Factory.newInstance();
    		SummaryMarketDataFault myFault = myFaultDoc.addNewSummaryMarketDataFault();
    		
            myFault.setFaultType(SummaryMarketDataFaultType.INVALID_EVENT_SET_ID);
            myFault.setFaultMessage("Event File does not exist!");
            
            SummaryMarketDataFaultException myException = new SummaryMarketDataFaultException();
            myException.setFaultMessage(myFaultDoc);
            throw myException;
        } catch (IOException e) {
            // Failed to read in file
        	SummaryMarketDataFaultDocument myFaultDoc = SummaryMarketDataFaultDocument.Factory.newInstance();
    		SummaryMarketDataFault myFault = myFaultDoc.addNewSummaryMarketDataFault();
    		
            myFault.setFaultType(SummaryMarketDataFaultType.PROGRAM_ERROR);
            myFault.setFaultMessage("Invalid Line in Event File!");
            
            SummaryMarketDataFaultException myException = new SummaryMarketDataFaultException();
            myException.setFaultMessage(myFaultDoc);
            throw myException;
		} catch (ParseException e) {
            // Bad Date in File
        	SummaryMarketDataFaultDocument myFaultDoc = SummaryMarketDataFaultDocument.Factory.newInstance();
    		SummaryMarketDataFault myFault = myFaultDoc.addNewSummaryMarketDataFault();
    		
            myFault.setFaultType(SummaryMarketDataFaultType.PROGRAM_ERROR);
            myFault.setFaultMessage("Invalid Date in Event File!");
            
            SummaryMarketDataFaultException myException = new SummaryMarketDataFaultException();
            myException.setFaultMessage(myFaultDoc);
            throw myException;
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
		if (!matcher.group(1).isEmpty()) {
			code = matcher.group(1);
		}
		
		return code;
	}
	
	private long getFileSize(File file) {
		return file.length();
	}
	
	//Taken from stackoverflow
	private static String humanReadableByteCount(long bytes, boolean si) {
	    int unit = si ? 1000 : 1024;
	    if (bytes < unit) return bytes + " B";
	    int exp = (int) (Math.log(bytes) / Math.log(unit));
	    String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
	    return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
	}

}
