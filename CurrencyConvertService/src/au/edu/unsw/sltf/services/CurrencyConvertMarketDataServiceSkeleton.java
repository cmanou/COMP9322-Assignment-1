
/**
 * CurrencyConvertMarketDataServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package au.edu.unsw.sltf.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import au.edu.unsw.sltf.services.CurrencyConvertMarketDataDocument.CurrencyConvertMarketData;
import au.edu.unsw.sltf.services.CurrencyConvertMarketDataResponseDocument.CurrencyConvertMarketDataResponse;

/**
 *  CurrencyConvertMarketDataServiceSkeleton java skeleton for the axisService
 */
public class CurrencyConvertMarketDataServiceSkeleton implements CurrencyConvertMarketDataServiceSkeletonInterface{
	static Logger logger = Logger.getLogger(CurrencyConvertMarketDataServiceSkeleton.class.getName());

	static final Map<String, Double> conversions = new HashMap<String, Double>() {
		{
			put("USD",0.9307674541);
			put("EUR",0.7006667524);
			put("GBP",0.559563355);
			put("INR",56.3764094347);
			put("AUD",1.0);
			put("CAD",1.0186495032);
			put("AED",3.418755329);
			put("MYR",2.9504323013);
			put("CHF",0.8485060621);
			put("CNY",5.7169778027);
			put("THB",29.7530912155);
			put("SAR",3.4906575553);
			put("NZD",1.1074715799);
			put("JPY",96.2122312587);
			put("SGD",1.163357396);
			put("PHP",40.832965289);
			put("TRY",2.0247864441);
			put("HKD",7.2140630051);
			put("IDR",10904.8306722706);
			put("ZAR",9.9594464736);
			put("MXN",12.1762503367);
			put("SEK",6.4237039867);
			put("BRL",2.0978791032);
			put("HUF",220.3320163609);
			put("PKR",94.1936635125);
			put("QAR",3.3892500977);
			put("OMR",0.358368734);
			put("KWD",0.264151809);
			put("DKK",5.2242123886);
			put("NOK",5.7477165037);
			put("RUB",33.7327115669);
			put("EGP",6.6554991151);
			put("KRW",952.2142051678);
			put("PLN",2.9342110919);
			put("COP",1779.8042282476);
			put("CZK",19.5741059554);
			put("ILS",3.2925802265);
			put("IQD",1082.4825490957);
			put("NGN",151.0635606378);
			put("MAD",7.8216660698);
			put("ARS",7.7104779589);
			put("LKR",121.1625994479);
			put("TWD",27.9051526203);
			put("BDT",72.2927064542);
			put("BHD",0.350922607);
			put("VND",19713.6546774267);
			put("CLP",542.8381789978);
			put("KES",82.1867690358);
			put("TND",1.6023160976);
			put("XOF",459.6072608795);
			put("JOD",0.6584714654);
			put("GHS",3.4671086777);
			put("HRK",5.3385769273);
			put("BGN",1.3704211061);
			put("RON",3.0955357462);
			put("PEN",2.6322104241);
			put("DZD",74.606353005);
			put("NPR",90.970860948);
			put("XAF",459.6072608795);
			put("ISK",108.3134093246);
			put("UAH",12.3121915914);
			put("FJD",1.716974102);
			put("DOP",40.5814595777);
			put("XPF",83.6117842915);
			put("MUR",28.984097952);
			put("AZN",0.7299075409);
			put("BAM",1.3703850543);
			put("XAU",0.0007191858);
			put("IRR",24736.0758596455);
			put("RSD",82.3361582382);
			put("LTL",2.4192621626);
			put("BND",1.163357396);
			put("ETB",18.4682971127);
			put("CRC",504.289795259);
			put("VEF",5.8568542226);
			put("AFN",51.7506690266);
			put("TZS",1552.0547296794);
			put("UGX",2419.9953806095);
			put("JMD",112.9000801876);
			put("GEL",1.6054650334);
			put("ZWD",336.8447416318);
			put("BWP",8.2369165711);
			put("CUC",0.9307674541);
			put("ZMW",5.6032204996);
			put("MMK",906.5675002745);
			put("GTQ",7.2813937507);
			put("XCD",2.5130721285);
			put("LYD",1.1441924519);
			put("MKD",43.0759166387);
			put("TTD",5.9094425447);
			put("MZN",28.2487925864);
			put("ALL",97.6601306602);
			put("BOB",6.4316029657);
			put("KZT",169.2647255875);
			put("BBD",1.8615349082);
			put("AOA",90.952993021);
			put("KHR",3774.2620262968);
			put("XAG",0.0476860718);
			put("AMD",379.5100830077);
			put("UYU",22.2267277976);
			put("MOP",7.4304848952);
			put("NAD",9.9594464736);
			put("LBP",1405.9242393887);
			put("LAK",7482.9049470808);
			put("BYR",9663.6930919916);
			put("MGA",2373.4570079055);
			put("SYP",141.8024273101);
			put("VUV",87.8179078723);
			put("PGK",2.2897460393);
			put("MNT",1724.2467086843);
			put("SDG",5.2983938389);
			put("ANG",1.6505298635);
			put("MWK",368.258137526);
			put("GMD",37.3703147016);
			put("CUP",24.6653375331);
			put("RWF",640.3680084074);
			put("MVR",14.3058965503);
			put("BTN",56.3764094347);
			put("SCR",12.0301695215);
			put("HNL",19.6019620859);
			put("KPW",121.3259628065);
			put("PYG",3967.8616567455);
			put("DJF",168.6550598389);
			put("XBT",0.0018339876);
			put("YER",200.021920201);
			put("CDF",850.7214530297);
			put("WST",2.1436376739);
			put("GYD",191.4588624639);
			put("AWG",1.6660737428);
			put("MDL",12.8771677627);
			put("BZD",1.8590218628);
			put("HTG",41.6053059075);
			put("KGS",48.4777240548);
			put("NIO",24.3162946314);
			put("CVE",76.2298488082);
			put("KYD",0.7632294345);
			put("GNF",6582.3874352579);
			put("BSD",0.9307674541);
			put("BIF",1428.7280420137);
			put("SLL",4095.3767979546);
			put("MRO",270.6671642847);
			put("TOP",1.7188688857);
			put("BMD",0.9307674541);
			put("SBD",6.7154938967);
			put("UZS",2182.0828837899);
			put("SOS",1115.9745984372);
			put("PAB",0.9307674541);
			put("SRD",3.0482635009);
			put("XDR",0.6107230605);
			put("SZL",9.9594464736);
			put("ERN",9.7451325672);
			put("LRD",86.0959163209);
			put("TJS",4.6319513005);
			put("TMT",2.6526872441);
			put("GIP",0.559563355);
			put("LSL",9.9594464736);
			put("KMF",344.7054456596);
			put("SVC",8.1442152232);
			put("GGP",0.559563355);
			put("XPT",0.0006513563);
			put("STD",17177.3133650571);
			put("IMP",0.559563355);
			put("FKP",0.559563355);
			put("XPD",0.0010716932);
			put("JEP",0.559563355);
			put("SHP",0.559563355);
			put("SPL",0.155127909);
			put("TVD",1.0);

		}
	};

	private final String MY_CORE_PATH = System.getProperty("java.io.tmpdir")+"/cjze477_ass1";
	private final String PRIVATE_PATH = "/private";
	private final String WEB_ROOT = System.getenv("CATALINA_HOME")+"/webapps/ROOT";
	private final String PUBLIC_PATH = "/cjze477_ass1/public";
	private final String SUFFIX = ".csv";

	/**
	 * Auto generated method signature
	 * 
	 * @param currencyConvertMarketData0 
	 * @return currencyConvertMarketDataResponse1 
	 * @throws CurrencyConvertMarketDataFaultException 
	 */

	//TODO: Validation
	public CurrencyConvertMarketDataResponseDocument currencyConvertMarketData ( CurrencyConvertMarketDataDocument reqDoc) throws CurrencyConvertMarketDataFaultException {
		CurrencyConvertMarketData req = reqDoc.getCurrencyConvertMarketData();

		String eventSetId = req.getEventSetId();
		String currency = req.getTargetCurrency();
		//TODO: more validation;
		
		//TODO: Make a request to download service to get this url
		URL dataSourceURL = null;
		try {
			dataSourceURL = new URL("http://www.cse.unsw.edu.au/~hpaik/9322/assignments/common/files_csv_spec/MarketData02.csv");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		

		//Process file and get values
		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(dataSourceURL.openStream()));

			ArrayList<String> filteredEntries = new ArrayList<String>();
			String inputLine = in.readLine();
			filteredEntries.add(inputLine);
			while ((inputLine = in.readLine()) != null)
			{
				// Extract relevant line variables.
				String[] lineParts = inputLine.split(",");
				
				Pattern pattern = Pattern.compile("([a-zA-z]*)([0-9.]*)");
				String price = lineParts[5];
				if (!price.isEmpty()) {
					Matcher matcher = pattern.matcher(price);
					matcher.find();
					double priceV = Double.parseDouble(matcher.group(2));
					lineParts[5] = currency + String.format("%.2f", (priceV * conversions.get(currency)));
				}
				//TODO: Error check on group 0
				
				filteredEntries.add(join(lineParts, ",",0,lineParts.length));

			}
			in.close();


			// Create root folder if not created.
			String myPath = this.MY_CORE_PATH+this.PRIVATE_PATH;
			File privateFolder = new File(myPath);
			if(!privateFolder.exists())
			{
				if(!privateFolder.mkdirs()){
					//ERROR
				}
			}

			// Generate date for file name.
			Date current = new Date();
			Calendar currCalendar = Calendar.getInstance();
			currCalendar.setTime(current);

			// Create new file in path.
			String prefix = "9322-"+currCalendar.get(Calendar.YEAR)+
					currCalendar.get(Calendar.MONTH)+
					currCalendar.get(Calendar.DAY_OF_MONTH)+
					currCalendar.get(Calendar.HOUR_OF_DAY)+
					currCalendar.get(Calendar.MINUTE)+
					currCalendar.get(Calendar.SECOND)+
					currCalendar.get(Calendar.MILLISECOND);
			FileWriter myFileWriter = new FileWriter(myPath+"/"+prefix+this.SUFFIX);

			// Write data to file. 
			for(String item : filteredEntries)
			{
				myFileWriter.append(item);
				myFileWriter.append("\n");
			}
			myFileWriter.close();


			// Return file handle.
			//Create Response Object
			CurrencyConvertMarketDataResponseDocument resDoc = CurrencyConvertMarketDataResponseDocument.Factory.newInstance();
			CurrencyConvertMarketDataResponse res = resDoc.addNewCurrencyConvertMarketDataResponse();

			res.setEventSetId(prefix);


			return resDoc;		


		} catch (Exception e) {
			//TODO Error

			CurrencyConvertMarketDataResponseDocument resDoc = CurrencyConvertMarketDataResponseDocument.Factory.newInstance();
			CurrencyConvertMarketDataResponse res = resDoc.addNewCurrencyConvertMarketDataResponse();

			res.setEventSetId("FAILED");


			return resDoc;	
		}

	}

	private static String join(final Object[] array, String separator, final int startIndex, final int endIndex) {

		final int noOfItems = endIndex - startIndex;

		final StringBuilder buf = new StringBuilder(noOfItems * 16);

		for (int i = startIndex; i < endIndex; ++i) {
			if (i > startIndex) {
				buf.append(separator);
			}
			if (array[i] != null) {
				buf.append(array[i]);
			}
		}
		return buf.toString();
	}


}
