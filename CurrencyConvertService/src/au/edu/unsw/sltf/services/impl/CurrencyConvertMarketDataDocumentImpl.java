/*
 * An XML document type.
 * Localname: currencyConvertMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one currencyConvertMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class CurrencyConvertMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument
{
    
    public CurrencyConvertMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENCYCONVERTMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyConvertMarketData");
    
    
    /**
     * Gets the "currencyConvertMarketData" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData getCurrencyConvertMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData)get_store().find_element_user(CURRENCYCONVERTMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "currencyConvertMarketData" element
     */
    public void setCurrencyConvertMarketData(au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData currencyConvertMarketData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData)get_store().find_element_user(CURRENCYCONVERTMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData)get_store().add_element_user(CURRENCYCONVERTMARKETDATA$0);
            }
            target.set(currencyConvertMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "currencyConvertMarketData" element
     */
    public au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData addNewCurrencyConvertMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData target = null;
            target = (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData)get_store().add_element_user(CURRENCYCONVERTMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML currencyConvertMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class CurrencyConvertMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData
    {
        
        public CurrencyConvertMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        private static final javax.xml.namespace.QName TARGETCURRENCY$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "targetCurrency");
        
        
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
        
        /**
         * Gets the "targetCurrency" element
         */
        public java.lang.String getTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "targetCurrency" element
         */
        public org.apache.xmlbeans.XmlString xgetTargetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "targetCurrency" element
         */
        public void setTargetCurrency(java.lang.String targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.setStringValue(targetCurrency);
            }
        }
        
        /**
         * Sets (as xml) the "targetCurrency" element
         */
        public void xsetTargetCurrency(org.apache.xmlbeans.XmlString targetCurrency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETCURRENCY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETCURRENCY$2);
                }
                target.set(targetCurrency);
            }
        }
    }
}
