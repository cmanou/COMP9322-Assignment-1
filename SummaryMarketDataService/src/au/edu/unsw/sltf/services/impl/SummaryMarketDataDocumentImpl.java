/*
 * An XML document type.
 * Localname: summaryMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.SummaryMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one summaryMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class SummaryMarketDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.SummaryMarketDataDocument
{
    
    public SummaryMarketDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUMMARYMARKETDATA$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "summaryMarketData");
    
    
    /**
     * Gets the "summaryMarketData" element
     */
    public au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData getSummaryMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData)get_store().find_element_user(SUMMARYMARKETDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "summaryMarketData" element
     */
    public void setSummaryMarketData(au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData summaryMarketData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData)get_store().find_element_user(SUMMARYMARKETDATA$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData)get_store().add_element_user(SUMMARYMARKETDATA$0);
            }
            target.set(summaryMarketData);
        }
    }
    
    /**
     * Appends and returns a new empty "summaryMarketData" element
     */
    public au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData addNewSummaryMarketData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData)get_store().add_element_user(SUMMARYMARKETDATA$0);
            return target;
        }
    }
    /**
     * An XML summaryMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class SummaryMarketDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.SummaryMarketDataDocument.SummaryMarketData
    {
        
        public SummaryMarketDataImpl(org.apache.xmlbeans.SchemaType sType)
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
