/*
 * An XML document type.
 * Localname: currencyConvertMarketDataResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currencyConvertMarketDataResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrencyConvertMarketDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument
{
    
    public CurrencyConvertMarketDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCONVERTMARKETDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyConvertMarketDataResponse");
    
    
    /**
     * Gets the "currencyConvertMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse getCurrencyConvertMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse)get_store().find_element_user(CURRENCYCONVERTMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currencyConvertMarketDataResponse" element
     */
    public void setCurrencyConvertMarketDataResponse(au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse currencyConvertMarketDataResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse)get_store().find_element_user(CURRENCYCONVERTMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse)get_store().add_element_user(CURRENCYCONVERTMARKETDATARESPONSE$0);
            }
            target.set(currencyConvertMarketDataResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyConvertMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse addNewCurrencyConvertMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse)get_store().add_element_user(CURRENCYCONVERTMARKETDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML currencyConvertMarketDataResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrencyConvertMarketDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse
    {
        
        public CurrencyConvertMarketDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        
        
        /**
         * Gets the "eventSetId" element
         */
        public java.lang.String getEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
        public org.apache.xmlbeans.XmlString xgetEventSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "eventSetId" element
         */
        public void setEventSetId(java.lang.String eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTSETID$0);
                }
                target.setStringValue(eventSetId);
            }
        }
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
        public void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENTSETID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENTSETID$0);
                }
                target.set(eventSetId);
            }
        }
    }
}
