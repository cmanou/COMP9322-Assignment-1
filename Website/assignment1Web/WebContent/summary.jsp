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
          <li class="selected"><a href="summary.jsp">Summary MarketData</a></li>
          <li><a href="currencyConvert.jsp">Currency Convert</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      
      <c:if test= "${not empty summaryResponse}">
           <p style="color:orange;"><b>Scroll down to see the <span style="color:green;">'Summary'</span> service response!</b></p>
      </c:if>
      
      <div id="content">
        <!-- insert the page content here -->
        
        <h1>Summary Market Data Service</h1>

		<p><em>Consists of One operations</em></p>

		<h4>Summary Market Data operation</h4>
		
		<p>
			A Market Data file may contain a mixture of trades or quotes relating to a 
			financial instrument. 
		</p>
		<p>
			Reads a Market Data file that exists inside of our system given by Event Set ID, 
			It analyses the file to determine, the sec code of the Financial Instrument, 
			the timestamp of the first and last trades, the type of trades and the currency of them. 
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
           		<td>sec</td>
           		<td>String</td>
           		<td>The security code of the financial instrument (i.e., stock) in the file. <br />- Upper case, alphabetics only and 3-4 characters in length.</td>
				<td> </td>
				<td>KLW</td>
			</tr>
			<tr>
				<td>startDate</td>
				<td>String</td>
				<td>Earliest date/time of trades. 
					<br />- In Format "yyyy-MM-dd'T'HH:mm:ss.SSS+offset".
				</td>
				<td> </td>
				<td>2007-01-16T16:27:09.314+11:00</td>
			</tr>
			<tr>
				<td>endDate</td>
				<td>String</td>
				<td>Lastest date/time of trades. 
					<br />- In Format "yyyy-MM-dd'T'HH:mm:ss.SSS+offset".
				</td>
				<td> </td>
				<td>2007-01-16T16:27:09.314+11:00</td>
			</tr>
			<tr>
           		<td>marketType</td>
           		<td>String</td>
           		<td>Type of event. For the given data set, this should be either 'Quote' or 'Trade'. If both types exist in the file, marketType is 'Mixed'.</td>
				<td> </td>
				<td>Trade</td>
			</tr>
			<tr>
           		<td>currencyCode</td>
           		<td>String</td>
           		<td>The currency of the price information in the Market Data file.</td>
				<td>AUD</td>
				<td>HKD</td>
			</tr>
			<tr>
           		<td>fileSize</td>
           		<td>String</td>
           		<td>The size of the file in human readable format</td>
				<td></td>
				<td>5.3 MB</td>
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
           		<td>ProgramError</td>
           		<td>Invalid Line in Event File!</td>
           		<td>There was a bad line in the csv.</td>
           		<td>Please try again or re-import the file. If it continues contact support</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Invalid Date in Event File!</td>
           		<td>Service could not parse one of the dates to conduct summary of csv file.</td>
           		<td>Please try again or re-import the file. If it continues contact support</td>
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
        			<td><input type="text" name="aEventSetId" /></td>
        			<td rowspan="5">
        				${summaryResponse}
        			 </td>
        		</tr>
        		<tr>
        			<td></td>
        			<td>
        				<input type="hidden" name="action" value="requestSummary" />
        				<input type="submit" value="Go!"/>
        			</td>
        		</tr>
        	</table>
        </form>
        
       
       	<hr />
       	<br />
       	<h4>Download Service WSDL</h4>
        <p><a href="/axis2/services/SummaryMarketDataService?wsdl" >Download WSDL</a></p>
        
      </div> <!--  Content Div End -->
      
    </div>
    <div id="footer">

    </div>
  </div>
</body>
</html>
