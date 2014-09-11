import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.axis2.databinding.types.URI;
import org.apache.axis2.databinding.types.URI.MalformedURIException;

import au.edu.unsw.sltf.services.*;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            ImportMarketData testMarketData = new ImportMarketData();
            testMarketData.setSec("KLW");
            
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            Date d1 = myFormat.parse("2007-01-25T08:00:00.000");
            Calendar c1 = Calendar.getInstance();
            c1.setTime(d1);
            testMarketData.setStartDate(c1);
            
            Date d2 = myFormat.parse("2007-01-25T08:05:00.000");
            Calendar c2 = Calendar.getInstance();
            c2.setTime(d2);
            testMarketData.setEndDate(c2);
            
            
            URI myURI = new URI();
            myURI.setScheme("http");
            myURI.setHost("www.cse.unsw.edu.au");
            myURI.setPath("/~hpaik/9322/assignments/common/files_csv_spec/MarketData02.csv");
            testMarketData.setDataSourceURL(myURI);
            
            ImportDownloadServicesSkeleton obj1 = new ImportDownloadServicesSkeleton();
            
            ImportMarketDataResponse resp = obj1.importMarketData(testMarketData);
            
            DownloadFile mdf = new DownloadFile();
            mdf.setEventSetId(resp.getEventSetId());
            
            DownloadFileResponse resp2 = obj1.downloadFile(mdf);
            
            System.out.println("Function End!!!: "+resp.getEventSetId());
            System.out.println("Function End!!!: "+resp2.getDataURL().toString());
            
        } catch (MalformedURIException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ImportDownloadFaultException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
