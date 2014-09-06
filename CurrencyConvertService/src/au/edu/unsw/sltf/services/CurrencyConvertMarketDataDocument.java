/*
 * An XML document type.
 * Localname: currencyConvertMarketData
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one currencyConvertMarketData(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface CurrencyConvertMarketDataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyConvertMarketDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s77579F885B138489402DF6293B92B66B").resolveHandle("currencyconvertmarketdatafe92doctype");
    
    /**
     * Gets the "currencyConvertMarketData" element
     */
    au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData getCurrencyConvertMarketData();
    
    /**
     * Sets the "currencyConvertMarketData" element
     */
    void setCurrencyConvertMarketData(au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData currencyConvertMarketData);
    
    /**
     * Appends and returns a new empty "currencyConvertMarketData" element
     */
    au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData addNewCurrencyConvertMarketData();
    
    /**
     * An XML currencyConvertMarketData(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface CurrencyConvertMarketData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyConvertMarketData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s77579F885B138489402DF6293B92B66B").resolveHandle("currencyconvertmarketdata7c9eelemtype");
        
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
         * Gets the "targetCurrency" element
         */
        java.lang.String getTargetCurrency();
        
        /**
         * Gets (as xml) the "targetCurrency" element
         */
        org.apache.xmlbeans.XmlString xgetTargetCurrency();
        
        /**
         * Sets the "targetCurrency" element
         */
        void setTargetCurrency(java.lang.String targetCurrency);
        
        /**
         * Sets (as xml) the "targetCurrency" element
         */
        void xsetTargetCurrency(org.apache.xmlbeans.XmlString targetCurrency);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData newInstance() {
              return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument newInstance() {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
