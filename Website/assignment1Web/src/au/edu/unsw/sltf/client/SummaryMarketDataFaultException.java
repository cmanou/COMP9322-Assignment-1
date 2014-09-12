
/**
 * SummaryMarketDataFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package au.edu.unsw.sltf.client;

public class SummaryMarketDataFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1410517409268L;
    
    private au.edu.unsw.sltf.client.SummaryMarketDataServiceStub.SummaryMarketDataFault faultMessage;

    
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
    

    public void setFaultMessage(au.edu.unsw.sltf.client.SummaryMarketDataServiceStub.SummaryMarketDataFault msg){
       faultMessage = msg;
    }
    
    public au.edu.unsw.sltf.client.SummaryMarketDataServiceStub.SummaryMarketDataFault getFaultMessage(){
       return faultMessage;
    }
}
    