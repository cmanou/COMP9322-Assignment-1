/*
 * An XML document type.
 * Localname: summaryMarketDataResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one summaryMarketDataResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface SummaryMarketDataResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SummaryMarketDataResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC057E84D6648F3F0619A3B1FEE35EA1").resolveHandle("summarymarketdataresponse188ddoctype");
    
    /**
     * Gets the "summaryMarketDataResponse" element
     */
    au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse getSummaryMarketDataResponse();
    
    /**
     * Sets the "summaryMarketDataResponse" element
     */
    void setSummaryMarketDataResponse(au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse summaryMarketDataResponse);
    
    /**
     * Appends and returns a new empty "summaryMarketDataResponse" element
     */
    au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse addNewSummaryMarketDataResponse();
    
    /**
     * An XML summaryMarketDataResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface SummaryMarketDataResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SummaryMarketDataResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDC057E84D6648F3F0619A3B1FEE35EA1").resolveHandle("summarymarketdataresponse3a14elemtype");
        
        /**
         * Gets the "eventSetId" element
         */
        java.lang.String getEventSetId();
        
        /**
         * Gets (as xml) the "eventSetId" element
         */
        org.apache.xmlbeans.XmlString xgetEventSetId();
        
        /**
         * Sets the "eventSetId" element
         */
        void setEventSetId(java.lang.String eventSetId);
        
        /**
         * Sets (as xml) the "eventSetId" element
         */
        void xsetEventSetId(org.apache.xmlbeans.XmlString eventSetId);
        
        /**
         * Gets the "sec" element
         */
        java.lang.String getSec();
        
        /**
         * Gets (as xml) the "sec" element
         */
        org.apache.xmlbeans.XmlString xgetSec();
        
        /**
         * Sets the "sec" element
         */
        void setSec(java.lang.String sec);
        
        /**
         * Sets (as xml) the "sec" element
         */
        void xsetSec(org.apache.xmlbeans.XmlString sec);
        
        /**
         * Gets the "startDate" element
         */
        java.util.Calendar getStartDate();
        
        /**
         * Gets (as xml) the "startDate" element
         */
        org.apache.xmlbeans.XmlDateTime xgetStartDate();
        
        /**
         * Sets the "startDate" element
         */
        void setStartDate(java.util.Calendar startDate);
        
        /**
         * Sets (as xml) the "startDate" element
         */
        void xsetStartDate(org.apache.xmlbeans.XmlDateTime startDate);
        
        /**
         * Gets the "endDate" element
         */
        java.util.Calendar getEndDate();
        
        /**
         * Gets (as xml) the "endDate" element
         */
        org.apache.xmlbeans.XmlDateTime xgetEndDate();
        
        /**
         * Sets the "endDate" element
         */
        void setEndDate(java.util.Calendar endDate);
        
        /**
         * Sets (as xml) the "endDate" element
         */
        void xsetEndDate(org.apache.xmlbeans.XmlDateTime endDate);
        
        /**
         * Gets the "marketType" element
         */
        java.lang.String getMarketType();
        
        /**
         * Gets (as xml) the "marketType" element
         */
        org.apache.xmlbeans.XmlString xgetMarketType();
        
        /**
         * Sets the "marketType" element
         */
        void setMarketType(java.lang.String marketType);
        
        /**
         * Sets (as xml) the "marketType" element
         */
        void xsetMarketType(org.apache.xmlbeans.XmlString marketType);
        
        /**
         * Gets the "currencyCode" element
         */
        java.lang.String getCurrencyCode();
        
        /**
         * Gets (as xml) the "currencyCode" element
         */
        org.apache.xmlbeans.XmlString xgetCurrencyCode();
        
        /**
         * Sets the "currencyCode" element
         */
        void setCurrencyCode(java.lang.String currencyCode);
        
        /**
         * Sets (as xml) the "currencyCode" element
         */
        void xsetCurrencyCode(org.apache.xmlbeans.XmlString currencyCode);
        
        /**
         * Gets the "fileSize" element
         */
        java.lang.String getFileSize();
        
        /**
         * Gets (as xml) the "fileSize" element
         */
        org.apache.xmlbeans.XmlString xgetFileSize();
        
        /**
         * Sets the "fileSize" element
         */
        void setFileSize(java.lang.String fileSize);
        
        /**
         * Sets (as xml) the "fileSize" element
         */
        void xsetFileSize(org.apache.xmlbeans.XmlString fileSize);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse newInstance() {
              return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument newInstance() {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
