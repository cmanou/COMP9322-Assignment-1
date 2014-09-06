
/**
 * ImportDownloadServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.apache.axis2.databinding.types.URI;
import org.apache.axis2.databinding.types.URI.MalformedURIException;
import org.apache.commons.io.FileSystemUtils;

    /**
     *  ImportDownloadServicesSkeleton java skeleton for the axisService
     */
    public class ImportDownloadServicesSkeleton implements ImportDownloadServicesSkeletonInterface{
        
        private final SimpleDateFormat myFormat = new SimpleDateFormat("dd-MMM-yyyy'T'HH:mm:ss.SSS");
        private final String MY_CORE_PATH = System.getProperty("java.io.tmpdir")+"/cjze477_ass1";
        private final String PRIVATE_PATH = "/private";
        private final String WEB_ROOT = System.getenv("CATALINA_HOME")+"/webapps/ROOT";
        private final String PUBLIC_PATH = "/cjze477_ass1/public";
        private final String SUFFIX = ".csv";
        /**
         * Auto generated method signature
         * 
         * @param aImportMarketData 
         * @return importMarketDataResponse1 
         * @throws ImportDownloadFaultException 
         */
        public ImportMarketDataResponse importMarketData(ImportMarketData aImportMarketData) 
                throws ImportDownloadFaultException
        {
            // Extract variables of passed in object.
            String sec = aImportMarketData.getSec();
            Calendar startDate = aImportMarketData.getStartDate();
            Calendar endDate = aImportMarketData.getEndDate();
            URI dataSourceURL = aImportMarketData.getDataSourceURL();
            
            // Validate Input //
            
            // Check security code.
            if(!sec.matches("^[A-Z]{3,4}$"))
            {
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.InvalidSECCode);
                myFault.setFaultMessage("Invalid Sec code format!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
            // Check date/times.
            if(startDate.after(endDate))
            {
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Start date/time is not before end date/time!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
            // Check URL.
            if(!dataSourceURL.toString().matches(".+\\.csv$"))
            {
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.InvalidURL);
                myFault.setFaultMessage("Invalid URI: must be a .csv file!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
            try {
                
                // Create URL object that can read in data 
                URL url = new URL(dataSourceURL.toString());
                
                // Efficient reading from input stream of URL.  
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                
                // Skip first 'heading' line, then filter other lines.
                // Store results in temporary object.
                ArrayList<String> filteredEntries = new ArrayList<String>();
                String inputLine = in.readLine();
                filteredEntries.add(inputLine);
                while ((inputLine = in.readLine()) != null)
                {
                    // Extract relevant line variables.
                    String[] lineParts = inputLine.split(",");
                    String tempSec = lineParts[0];
                    Calendar tempCalendar = Calendar.getInstance();
                    tempCalendar.setTime(this.myFormat.parse(lineParts[1]+"T"+lineParts[2]));
                    
                    // Match conditions for sec code and date range.
                    if(tempSec.equals(sec))
                    {
                        if(tempCalendar.compareTo(startDate) >= 0)
                        {
                            if(tempCalendar.compareTo(endDate) <= 0)
                            {
                                filteredEntries.add(inputLine);
                            }
                        }
                    }
                }
                in.close();
                
                // Check that sec code matches something in data file.
                if(filteredEntries.size() <= 1)
                {
                    ImportDownloadFault myFault = new ImportDownloadFault();
                    myFault.setFaultType(ImportDownloadFaultType.InvalidSECCode);
                    myFault.setFaultMessage("No Code or Time Matches for criteria in the Market Data file!");
                    
                    ImportDownloadFaultException myException = new ImportDownloadFaultException();
                    myException.setFaultMessage(myFault);
                    throw myException;
                }
                
                // Create root folder if not created.
                String myPath = this.MY_CORE_PATH+this.PRIVATE_PATH;
                File privateFolder = new File(myPath);
                if(!privateFolder.exists())
                {
                    if(!privateFolder.mkdirs()){
                        ImportDownloadFault myFault = new ImportDownloadFault();
                        myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                        myFault.setFaultMessage("Private folder structure not created!");
                        
                        ImportDownloadFaultException myException = new ImportDownloadFaultException();
                        myException.setFaultMessage(myFault);
                        throw myException;
                    }
                }
                
                // Generate date for file name.
                Date current = new Date();
                Calendar currCalendar = Calendar.getInstance();
                currCalendar.setTime(current);
                
                // Create new file in path.
                String prefix = "9322-"+currCalendar.get(Calendar.YEAR)+
                                        currCalendar.get(Calendar.MONTH)+
                                        currCalendar.get(Calendar.DAY_OF_MONTH)+
                                        currCalendar.get(Calendar.HOUR_OF_DAY)+
                                        currCalendar.get(Calendar.MINUTE)+
                                        currCalendar.get(Calendar.SECOND)+
                                        currCalendar.get(Calendar.MILLISECOND);
                FileWriter myFileWriter = new FileWriter(myPath+"/"+prefix+this.SUFFIX);
                
                // Write data to file. 
                for(String item : filteredEntries)
                {
                    myFileWriter.append(item);
                    myFileWriter.append("\n");
                }
                myFileWriter.close();
                         
                // Return file handle.
                ImportMarketDataResponse response = new ImportMarketDataResponse();
                response.setEventSetId(prefix);
                
                return response;
                
            } catch (MalformedURLException e) {
                // Bad URL
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.InvalidURL);
                myFault.setFaultMessage("URL is not of proper strucutre!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            } catch (IOException e) {
                // Error in creating or writing to file.
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Error in creating or writing to file!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            } catch (ParseException e) {
                // Bad Date input for parsing.
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Bad Date format for parsing!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
        }
     
         
        /**
         * Auto generated method signature
         * 
         * @param aDownloadFile 
         * @return downloadFileResponse3 
         * @throws ImportDownloadFaultException 
         */
        public DownloadFileResponse downloadFile(DownloadFile aDownloadFile)
                throws ImportDownloadFaultException
        {
            // Extract passed in values to local variables.
            String eventSetId = aDownloadFile.getEventSetId();
            
            // Check that the id is of a valid format.
            if(!eventSetId.matches("^9322-[0-9]+$"))
            {
                // Invalid Event Id.
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Invalid Event Id Format!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
            // Check that event id can be found.
            File myFile = new File(this.MY_CORE_PATH+this.PRIVATE_PATH+"/"+eventSetId+this.SUFFIX);
            if(!myFile.exists())
            {
                // File not found.
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Event File does not exist!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
            
            // Create public folder if not created.
            File publicFolder = new File(this.WEB_ROOT+this.PUBLIC_PATH);
            if(!publicFolder.exists())
            {
                if(!publicFolder.mkdirs()){
                    ImportDownloadFault myFault = new ImportDownloadFault();
                    myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                    myFault.setFaultMessage("Public folder structure not created!");
                    
                    ImportDownloadFaultException myException = new ImportDownloadFaultException();
                    myException.setFaultMessage(myFault);
                    throw myException;
                }
            }
            
            try {
                // Copy file from private source to public destination.
                FileWriter myFileWriter = new FileWriter(this.WEB_ROOT+this.PUBLIC_PATH+"/"+eventSetId+this.SUFFIX);
                FileReader myFileReader = new FileReader(this.MY_CORE_PATH+this.PRIVATE_PATH+"/"+eventSetId+this.SUFFIX);
                
                // Copy data to new file.
                int readChar = myFileReader.read();
                while(readChar != -1)
                {
                    myFileWriter.append( (char) readChar);
                    
                    readChar = myFileReader.read();
                }
                myFileWriter.close();
                
            } catch (IOException e) {
                ImportDownloadFault myFault = new ImportDownloadFault();
                myFault.setFaultType(ImportDownloadFaultType.ProgramError);
                myFault.setFaultMessage("Copy file error!");
                
                ImportDownloadFaultException myException = new ImportDownloadFaultException();
                myException.setFaultMessage(myFault);
                throw myException;
            }
           
           try {
               DownloadFileResponse response = new DownloadFileResponse();
               URI newURI = new URI();
              
               newURI.setScheme("http");
               newURI.setHost("localhost");
               newURI.setPort(50000);
               newURI.setPath(this.PUBLIC_PATH+"/"+eventSetId+this.SUFFIX);
               System.out.println(newURI.toString());
               response.setDataURL(newURI);
               
               return response;
               
           } catch (MalformedURIException e) {
               ImportDownloadFault myFault = new ImportDownloadFault();
               myFault.setFaultType(ImportDownloadFaultType.ProgramError);
               myFault.setFaultMessage("Bad output URI!");
               
               ImportDownloadFaultException myException = new ImportDownloadFaultException();
               myException.setFaultMessage(myFault);
               throw myException;
           }
           
        }
    }
    