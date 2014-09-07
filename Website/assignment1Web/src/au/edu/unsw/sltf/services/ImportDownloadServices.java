

/**
 * ImportDownloadServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package au.edu.unsw.sltf.services;

    /*
     *  ImportDownloadServices java interface
     */

    public interface ImportDownloadServices {
          

        /**
          * Auto generated method signature
          * 
                    * @param importMarketData0
                
             * @throws au.edu.unsw.sltf.services.ImportDownloadFaultException : 
         */

         
                     public au.edu.unsw.sltf.services.ImportMarketDataResponse importMarketData(

                        au.edu.unsw.sltf.services.ImportMarketData importMarketData0)
                        throws java.rmi.RemoteException
             
          ,au.edu.unsw.sltf.services.ImportDownloadFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param importMarketData0
            
          */
        public void startimportMarketData(

            au.edu.unsw.sltf.services.ImportMarketData importMarketData0,

            final au.edu.unsw.sltf.services.ImportDownloadServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param downloadFile2
                
             * @throws au.edu.unsw.sltf.services.ImportDownloadFaultException : 
         */

         
                     public au.edu.unsw.sltf.services.DownloadFileResponse downloadFile(

                        au.edu.unsw.sltf.services.DownloadFile downloadFile2)
                        throws java.rmi.RemoteException
             
          ,au.edu.unsw.sltf.services.ImportDownloadFaultException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param downloadFile2
            
          */
        public void startdownloadFile(

            au.edu.unsw.sltf.services.DownloadFile downloadFile2,

            final au.edu.unsw.sltf.services.ImportDownloadServicesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    