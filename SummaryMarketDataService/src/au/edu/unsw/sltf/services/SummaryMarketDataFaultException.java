
/**
 * SummaryMarketDataFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package au.edu.unsw.sltf.services;

public class SummaryMarketDataFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1409963613067L;
    
    private au.edu.unsw.sltf.services.SummaryMarketDataFaultDocument faultMessage;

    
        public SummaryMarketDataFaultException() {
            super("SummaryMarketDataFaultException");
        }

        public SummaryMarketDataFaultException(java.lang.String s) {
           super(s);
        }

        public SummaryMarketDataFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SummaryMarketDataFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(au.edu.unsw.sltf.services.SummaryMarketDataFaultDocument msg){
       faultMessage = msg;
    }
    
    public au.edu.unsw.sltf.services.SummaryMarketDataFaultDocument getFaultMessage(){
       return faultMessage;
    }
}
    