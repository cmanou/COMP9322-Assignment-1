<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>COMP9322 Web Services</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=windows-1252" />
  <link rel="stylesheet" type="text/css" href="style/style.css" title="style" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">COMP9322 <span class="logo_colour">Web Services</span></a></h1>
          <h2>Assignment 1</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="index.jsp">Home</a></li>
          <li><a href="importDownload.jsp">Import/Download</a></li>
          <li><a href="summary.jsp">Summary MarketData</a></li>
          <li class="selected"><a href="currencyConvert.jsp">Currency Convert</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      
      <c:if test= "${not empty currencyResponse}">
           <p style="color:orange;"><b>Scroll down to see the <span style="color:green;">'Currency Convert'</span> service response!</b></p>
      </c:if>
      
      <div id="content">
        <!-- insert the page content here -->
        
        <h1>Currency Convert Data Service</h1>

		<p><em>Consists of One operations</em></p>

		<h4>Currency Convert Market Data operation</h4>
		
		<p>
			A Market Data file may contain a mixture of trades or quotes relating to a 
			financial instrument. 
		</p>
		<p>
			Reads a Market Data file that exists inside of our system given by Event Set ID, 
			It converts the unprocessed price to the target currency requested if it existed.
			 This only applies if it is a valid target currency and there was a valid 
			 conversion rate as of 20th August 2014
		</p>
		<h5>Parameters</h5>
		<p>All parameters marked with a '*' must be specified.</p>
        <table>
        	<tr>
           		<th>Name</th>
           		<th>Type</th>
           		<th>Description</th>
           		<th>Default</th>
           		<th width="110px" >Example/Sample</th>
           	</tr>
           	<tr>
           		<td>eventSetId*</td>
           		<td>String</td>
           		<td>An opaque "handle" or reference that is the output of one of the other operations.<br />
           			- Of the pattern "^9322-[0-9]+$"</td>
				<td> </td>
				<td>9322-20148610616930</td>
			</tr>
			<tr>
           		<td>targetCurrency*</td>
           		<td>String</td>
           		<td>The shortened currency code for the currency you want to convert to.</td>
				<td> </td>
				<td>HKD</td>
			</tr>
        </table>
		
		<h5>Return Value/s</h5>

        <table>
        	<tr>
           		<th>Name</th>
           		<th>Type</th>
           		<th>Description</th>
           		<th>Default</th>
           		<th>Example/s</th>
           	</tr>
           	<tr>
           		<td>eventSetId</td>
           		<td>String</td>
           		<td>An opaque "handle" or reference that is the output of the 'currencyConvert' operation.<br />
           			- Of the pattern "^9322-[0-9]+$".
           		</td>
				<td> </td>
				<td>9322-201481195811595</td>
			</tr>
			
        </table>
        
		<h5>Fault Responses</h5>

        <table>
        	<tr>
           		<th>Fault Type</th>
           		<th>Fault Message</th>
           		<th>Cause</th>
           		<th>Resolution</th>
           	</tr>
           	<tr>
           		<td>InvalidEventSetId</td>
           		<td>Invalid Event Id Format!</td>
           		<td>Event handle does not match the pattern '^9322-[0-9]+$'</td>
           		<td>Check your event set id and try again.</td>
			</tr>
			<tr>
           		<td>InvalidEventSetId</td>
           		<td>Event File does not exist!</td>
           		<td>Service could not find the file that belongs to this handle.</td>
           		<td>Make sure you use the 'Import' operation before 'download'.</td>
			</tr>
			<tr>
           		<td>InvalidTargetCurrency</td>
           		<td>Invalid Currency/Not In Conversion</td>
           		<td>The target currency You entered is not valid.</td>
           		<td>Please check spelling or try another currency</td>
			</tr>
			<tr>
           		<td>InvalidMarketData</td>
           		<td>Market File has already been converted</td>
           		<td>Service can not reconvert a currency which has already been converted.</td>
           		<td>Please use the original file</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Can Not Create New File!</td>
           		<td>Internal error the output file could not be saved.</td>
           		<td>Please Contact Support.</td>
			</tr>  
			<tr>
           		<td>ProgramError</td>
           		<td>Error Parsing Market Data</td>
           		<td>Internal error the input file can not be processed.</td>
           		<td>Please try again or re import the original csv.</td>
			</tr>      
		</table>
        
        <h5>Try-it!</h5>
        
        <form method="post" action="Controller">
        	<table>
        		<tr>
        			<th colspan="2" >Parameters</th>
        			<th id="responseFieldImport" >Response</th>
        		</tr>
        		<tr>
        			<td>eventSetId</td>
        			<td><input type="text" name="aEventSetId" value="${aEventSetId}"/></td>
        			<td rowspan="5">
        				${currencyResponse}
        			 </td>
        		</tr>
        		<tr>
        			<td>targetCurrency</td>
        			<td><input type="text" name="aTargetCurrency" value="${aTargetCurrency}"/></td>
        		</tr>
        		<tr>
        			<td></td>
        			<td>
        				<input type="hidden" name="action" value="requestCurrency" />
        				<input type="submit" value="Go!"/>
        			</td>
        		</tr>
        	</table>
        </form>
        
       
       	<hr />
       	<br />
       	<h4>Download Service WSDL</h4>
        <p><a href="/axis2/services/CurrencyConvertMarketDataService?wsdl" >Download WSDL</a></p>
        
      </div> <!--  Content Div End -->
      
    </div>
    <div id="footer">

    </div>
  </div>
</body>
</html>
