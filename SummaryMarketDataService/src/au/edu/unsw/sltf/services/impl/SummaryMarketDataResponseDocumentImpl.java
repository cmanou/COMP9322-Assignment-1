/*
 * An XML document type.
 * Localname: summaryMarketDataResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services.impl;
/**
 * A document containing one summaryMarketDataResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public class SummaryMarketDataResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument
{
    
    public SummaryMarketDataResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUMMARYMARKETDATARESPONSE$0 = 
        new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "summaryMarketDataResponse");
    
    
    /**
     * Gets the "summaryMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse getSummaryMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse)get_store().find_element_user(SUMMARYMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "summaryMarketDataResponse" element
     */
    public void setSummaryMarketDataResponse(au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse summaryMarketDataResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse)get_store().find_element_user(SUMMARYMARKETDATARESPONSE$0, 0);
            if (target == null)
            {
                target = (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse)get_store().add_element_user(SUMMARYMARKETDATARESPONSE$0);
            }
            target.set(summaryMarketDataResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "summaryMarketDataResponse" element
     */
    public au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse addNewSummaryMarketDataResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse target = null;
            target = (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse)get_store().add_element_user(SUMMARYMARKETDATARESPONSE$0);
            return target;
        }
    }
    /**
     * An XML summaryMarketDataResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public static class SummaryMarketDataResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse
    {
        
        public SummaryMarketDataResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTSETID$0 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "eventSetId");
        private static final javax.xml.namespace.QName SEC$2 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "sec");
        private static final javax.xml.namespace.QName STARTDATE$4 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$6 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "endDate");
        private static final javax.xml.namespace.QName MARKETTYPE$8 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "marketType");
        private static final javax.xml.namespace.QName CURRENCYCODE$10 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "currencyCode");
        private static final javax.xml.namespace.QName FILESIZE$12 = 
            new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services", "fileSize");
        
        
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
         * Gets the "sec" element
         */
        public java.lang.String getSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sec" element
         */
        public org.apache.xmlbeans.XmlString xgetSec()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sec" element
         */
        public void setSec(java.lang.String sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEC$2);
                }
                target.setStringValue(sec);
            }
        }
        
        /**
         * Sets (as xml) the "sec" element
         */
        public void xsetSec(org.apache.xmlbeans.XmlString sec)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEC$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEC$2);
                }
                target.set(sec);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.util.Calendar getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.util.Calendar startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$4);
                }
                target.setCalendarValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTDATE$4);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.util.Calendar getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.util.Calendar endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$6);
                }
                target.setCalendarValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDDATE$6);
                }
                target.set(endDate);
            }
        }
        
        /**
         * Gets the "marketType" element
         */
        public java.lang.String getMarketType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKETTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "marketType" element
         */
        public org.apache.xmlbeans.XmlString xgetMarketType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKETTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "marketType" element
         */
        public void setMarketType(java.lang.String marketType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MARKETTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MARKETTYPE$8);
                }
                target.setStringValue(marketType);
            }
        }
        
        /**
         * Sets (as xml) the "marketType" element
         */
        public void xsetMarketType(org.apache.xmlbeans.XmlString marketType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MARKETTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MARKETTYPE$8);
                }
                target.set(marketType);
            }
        }
        
        /**
         * Gets the "currencyCode" element
         */
        public java.lang.String getCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "currencyCode" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrencyCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYCODE$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "currencyCode" element
         */
        public void setCurrencyCode(java.lang.String currencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYCODE$10);
                }
                target.setStringValue(currencyCode);
            }
        }
        
        /**
         * Sets (as xml) the "currencyCode" element
         */
        public void xsetCurrencyCode(org.apache.xmlbeans.XmlString currencyCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCYCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCYCODE$10);
                }
                target.set(currencyCode);
            }
        }
        
        /**
         * Gets the "fileSize" element
         */
        public java.lang.String getFileSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fileSize" element
         */
        public org.apache.xmlbeans.XmlString xgetFileSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILESIZE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "fileSize" element
         */
        public void setFileSize(java.lang.String fileSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILESIZE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILESIZE$12);
                }
                target.setStringValue(fileSize);
            }
        }
        
        /**
         * Sets (as xml) the "fileSize" element
         */
        public void xsetFileSize(org.apache.xmlbeans.XmlString fileSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILESIZE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILESIZE$12);
                }
                target.set(fileSize);
            }
        }
    }
}
