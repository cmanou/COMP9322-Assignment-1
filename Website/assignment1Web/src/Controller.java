

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

import com.sun.tools.ws.wsdl.document.Import;

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
    	        
    	        nextPage = "importDownload.jsp#responseField";
	        }
	        catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ImportDownloadFaultException e) {
                
                String faultMsg = e.getFaultMessage().getFaultMessage();
                String faultType = e.getFaultMessage().getFaultType().getValue();
                String totalResponse = faultType+"-"+faultMsg;
                
                request.setAttribute("importResponse", totalResponse);
                
                nextPage = "importDownload.jsp#responseField";
                
                // Dispatch Control.
                RequestDispatcher myRequestDispatcher = request.getRequestDispatcher("/"+nextPage);
                myRequestDispatcher.forward(request, response);
            }
	    }
	    
	    // Dispatch Control.
        RequestDispatcher myRequestDispatcher = request.getRequestDispatcher("/"+nextPage);
        myRequestDispatcher.forward(request, response);
	}

}
