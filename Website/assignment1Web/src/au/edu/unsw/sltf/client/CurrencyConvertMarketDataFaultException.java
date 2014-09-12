
/**
 * CurrencyConvertMarketDataFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package au.edu.unsw.sltf.client;

public class CurrencyConvertMarketDataFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1410518761233L;
    
    private au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub.CurrencyConvertMarketDataFault faultMessage;

    
        public CurrencyConvertMarketDataFaultException() {
            super("CurrencyConvertMarketDataFaultException");
        }

        public CurrencyConvertMarketDataFaultException(java.lang.String s) {
           super(s);
        }

        public CurrencyConvertMarketDataFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CurrencyConvertMarketDataFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub.CurrencyConvertMarketDataFault msg){
       faultMessage = msg;
    }
    
    public au.edu.unsw.sltf.client.CurrencyConvertMarketDataServiceStub.CurrencyConvertMarketDataFault getFaultMessage(){
       return faultMessage;
    }
}
    