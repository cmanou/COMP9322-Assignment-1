


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.databinding.types.URI;

import au.edu.unsw.sltf.client.CurrencyConvertMarketDataFaultException;
import au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub;
import au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub.CurrencyConvertMarketData;
import au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub.CurrencyConvertMarketDataResponse;
import au.edu.unsw.sltf.client.SummaryMarketDataFaultException;
import au.edu.unsw.sltf.client.SummaryMarketDataServiceStub;
import au.edu.unsw.sltf.client.SummaryMarketDataServiceStub.*;
import au.edu.unsw.sltf.services.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportDownloadFaultException;
import au.edu.unsw.sltf.services.ImportDownloadServicesStub;
import au.edu.unsw.sltf.services.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponse;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String action = request.getParameter("action");
	    String nextPage = "importDownload.jsp";  
	    
	    if(action.equals("requestImport"))
	    {  
	        String sec = request.getParameter("aSec");
	        String starDate = request.getParameter("aStartDate");
	        String endDate = request.getParameter("aEndDate");
	        String dataSourceURI = request.getParameter("aDataSourceURI");
	        
	        try {
                // Generate request.
                ImportDownloadServicesStub myStub = new ImportDownloadServicesStub();
                
                ImportMarketData myIMDO = new ImportMarketData();
                
                myIMDO.setSec(sec);
                
                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                Date d1 = myFormat.parse(starDate);
                Calendar c1 = Calendar.getInstance();
                c1.setTime(d1);
                myIMDO.setStartDate(c1);
                
                Date d2 = myFormat.parse(endDate);
                Calendar c2 = Calendar.getInstance();
                c2.setTime(d2);
                myIMDO.setEndDate(c2);
            
                URI myURI = new URI(dataSourceURI);
                myIMDO.setDataSourceURL(myURI);
    
                ImportMarketDataResponse resp = myStub.importMarketData(myIMDO);
                
                String eventHandle = resp.getEventSetId();
                
                request.setAttribute("importResponse", eventHandle);
                
                nextPage = "importDownload.jsp";
            
            
            } catch (ImportDownloadFaultException e) {
                
                String faultMsg = e.getFaultMessage().getFaultMessage();
                String faultType = e.getFaultMessage().getFaultType().getValue();
                String totalResponse = faultType+" - "+faultMsg;
                
                request.setAttribute("importResponse", totalResponse);
                
                nextPage = "importDownload.jsp";
                
            } catch (ParseException e) {
                
                String message = "ProgramError - Invalid date format!";
                
                request.setAttribute("importResponse", message);
                
                nextPage = "importDownload.jsp";
                
            }
	    } else if (action.equals("requestDownload")) {
	        
	        String eventSetId = request.getParameter("aEventSetId");
            request.setAttribute("aEventSetId", eventSetId);
            
            try {
    	        // Generate request.
                ImportDownloadServicesStub myStub = new ImportDownloadServicesStub();
    	        
                DownloadFile myDF = new DownloadFile();
                myDF.setEventSetId(eventSetId);
            
                DownloadFileResponse resp = myStub.downloadFile(myDF);
                
                String resultURL = resp.getDataURL().toString();
                
                request.setAttribute("downloadResponse", resultURL);
                
                nextPage = "importDownload.jsp";
                
            } catch (ImportDownloadFaultException e) {
                
                String faultMsg = e.getFaultMessage().getFaultMessage();
                String faultType = e.getFaultMessage().getFaultType().getValue();
                String totalResponse = faultType+" - "+faultMsg;
                
                request.setAttribute("downloadResponse", totalResponse);
                
                nextPage = "importDownload.jsp";
            }
	    } else if (action.equals("requestSummary")) {
	        
	        String eventSetId = request.getParameter("aEventSetId");
	       
			try {

    	        // Generate request.
                SummaryMarketDataServiceStub myStub = new SummaryMarketDataServiceStub();
                SummaryMarketData mySMD = new SummaryMarketData();

                mySMD.setEventSetId(eventSetId);
                
                SummaryMarketDataResponse resp = myStub.summaryMarketData(mySMD);
                
                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
                
                String eventSetID = resp.getEventSetId();
                String sec = resp.getSec();
                
                myFormat.setCalendar(resp.getStartDate()); 
                String startDate = myFormat.format(resp.getStartDate().getTime());

                myFormat.setCalendar(resp.getEndDate()); 
                String endDate = myFormat.format(resp.getEndDate().getTime());
                
                String market = resp.getMarketType();
                String currency = resp.getCurrencyCode();
                String filesize = resp.getFileSize();
                
                String result = "EventSetID: " + eventSetID + "<br><br>"
                		+"Sec: " +sec + "<br><br>"
			    		+"StartDate: " +startDate + "<br><br>"
			    		+"EndDate: " +endDate + "<br><br>"
			    		+"Market: " +market + "<br><br>"
			    		+"Currency: " +currency + "<br><br>"
			    		+"Filesize: " +filesize + "<br><br>";
                
                request.setAttribute("summaryResponse", result);
          	} catch (SummaryMarketDataFaultException e) {
                String faultMsg = e.getFaultMessage().getFaultMessage();
                String faultType = e.getFaultMessage().getFaultType().toString();
                String totalResponse = "<h4>Error:</h4>"+ faultType+" - "+faultMsg;
                
                request.setAttribute("summaryResponse", totalResponse);
			}
            nextPage = "summary.jsp";
	    } else if (action.equals("requestCurrency")) {
	        
	        String eventSetId = request.getParameter("aEventSetId");
	        String targetCurrency = request.getParameter("aTargetCurrency");
	        
            request.setAttribute("aEventSetId", eventSetId);
            request.setAttribute("aTargetCurrency", targetCurrency);

	       
			try {

    	        // Generate request.
                CurrencyConvertMarketDataServiceStub myStub = new CurrencyConvertMarketDataServiceStub();
                CurrencyConvertMarketData mySMD = new CurrencyConvertMarketData();

                mySMD.setEventSetId(eventSetId);
                mySMD.setTargetCurrency(targetCurrency);
                
                CurrencyConvertMarketDataResponse resp = myStub.currencyConvertMarketData(mySMD);
              
                String eventSetID = resp.getEventSetId();
               
                String result = "EventSetID: " + eventSetID;
                
                request.setAttribute("currencyResponse", result);
                
                nextPage = "currencyConvert.jsp";
			} catch (CurrencyConvertMarketDataFaultException e) {
                String faultMsg = e.getFaultMessage().getFaultMessage();
                String faultType = e.getFaultMessage().getFaultType().toString();
                String totalResponse = "<h4>Error:</h4>"+ faultType+" - "+faultMsg;
                
                request.setAttribute("currencyResponse", totalResponse);
			}
            nextPage = "currencyConvert.jsp";


	    }
	    
	    // Dispatch Control.
        RequestDispatcher myRequestDispatcher = request.getRequestDispatcher("/"+nextPage);
        myRequestDispatcher.forward(request, response);

	}

}
