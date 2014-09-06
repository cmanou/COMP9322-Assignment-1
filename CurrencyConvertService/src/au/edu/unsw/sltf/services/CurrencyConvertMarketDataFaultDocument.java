/*
 * An XML document type.
 * Localname: currencyConvertMarketDataFault
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one currencyConvertMarketDataFault(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface CurrencyConvertMarketDataFaultDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyConvertMarketDataFaultDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s77579F885B138489402DF6293B92B66B").resolveHandle("currencyconvertmarketdatafault9b0edoctype");
    
    /**
     * Gets the "currencyConvertMarketDataFault" element
     */
    au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault getCurrencyConvertMarketDataFault();
    
    /**
     * Sets the "currencyConvertMarketDataFault" element
     */
    void setCurrencyConvertMarketDataFault(au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault currencyConvertMarketDataFault);
    
    /**
     * Appends and returns a new empty "currencyConvertMarketDataFault" element
     */
    au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault addNewCurrencyConvertMarketDataFault();
    
    /**
     * An XML currencyConvertMarketDataFault(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface CurrencyConvertMarketDataFault extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CurrencyConvertMarketDataFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s77579F885B138489402DF6293B92B66B").resolveHandle("currencyconvertmarketdatafaultd724elemtype");
        
        /**
         * Gets the "faultType" element
         */
        au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultType.Enum getFaultType();
        
        /**
         * Gets (as xml) the "faultType" element
         */
        au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultType xgetFaultType();
        
        /**
         * Sets the "faultType" element
         */
        void setFaultType(au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultType.Enum faultType);
        
        /**
         * Sets (as xml) the "faultType" element
         */
        void xsetFaultType(au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultType faultType);
        
        /**
         * Gets the "faultMessage" element
         */
        java.lang.String getFaultMessage();
        
        /**
         * Gets (as xml) the "faultMessage" element
         */
        org.apache.xmlbeans.XmlString xgetFaultMessage();
        
        /**
         * Sets the "faultMessage" element
         */
        void setFaultMessage(java.lang.String faultMessage);
        
        /**
         * Sets (as xml) the "faultMessage" element
         */
        void xsetFaultMessage(org.apache.xmlbeans.XmlString faultMessage);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault newInstance() {
              return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument.CurrencyConvertMarketDataFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument newInstance() {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.CurrencyConvertMarketDataFaultDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
