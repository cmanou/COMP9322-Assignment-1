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
          <li class="selected"><a href="importDownload.jsp">Import/Download</a></li>
          <li><a href="page.html">Summary MarketData</a></li>
          <li><a href="another_page.html">Currency Convert</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      
      <c:if test= "${not empty importResponse}">
           <p style="color:orange;"><b>Scroll down to see the <span style="color:green;">'Import'</span> service response!</b></p>
      </c:if>
      <c:if test= "${not empty downloadResponse}">
           <p style="color:orange;"><b>Scroll down to see the <span style="color:green;">'Download'</span> service response!</b></p>
      </c:if>
      
      <div id="content">
        <!-- insert the page content here -->
        
        <h1>Import/Download Service</h1>

		<p><em>Consists of two operations:</em></p>

		<h4>Import Market Data operation</h4>
		
		<p>
			A Market Data file may contain a mixture of trades or quotes relating to several 
			financial instruments. An example of financial instrument is BHP shares traded 
			on the Australian Stock Exchange. The Import Market Data operation is designed 
			to filter a Market Data file, so a new Market Data file is created with only 
			those events from instruments that a user is interested in. For example, a user
			 can use the Import Market Data operation to extract the last 3 months of BHP trades
			  given an input Market Data file having trades and quotes relating to the top 200 
			  companies on the Australian Stock Exchange for the last 3 years.
		</p>
		<p>
			Reads a Market Data file that exists outside of the system, filters the content according 
			to the given parameters, and produces another Market Data file to store it inside the system. 
				The filter conditions are specified by the input parameters.
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
           		<td>sec*</td>
           		<td>String</td>
           		<td>The security code of the financial instrument (i.e., stock) to be matched. <br />- Should be in upper case, alphabetics only and 3-4 characters in length.</td>
				<td> </td>
				<td>KLW</td>
			</tr>
			<tr>
				<td>startDate*</td>
				<td>String</td>
				<td>Starting date/time to match (inclusive). 
					<br />- In Format "yyyy-MM-dd'T'HH:mm:ss.SSS".
					<br />- xsd:dateTime. 
				</td>
				<td> </td>
				<td>2007-01-25T08:00:00.000</td>
			</tr>
			<tr>
				<td>endDate*</td>
				<td>String</td>
				<td>Ending date/time to match (inclusive). 
					<br />- In Format "yyyy-MM-dd'T'HH:mm:ss.SSS".
					<br />- xsd:dateTime. 
				</td>
				<td> </td>
				<td>2007-01-25T08:30:00.200</td>
			</tr>
			<tr>
				<td>dataSourceURL*</td>
				<td>String</td>
				<td>This is a URL that points to the input Market Data file.<br />- Normal URL format.</td>
        		<td> </td>
        		<td>http://www.cse.unsw.edu.au/~hpaik/9322/assignments/common/files_csv_spec/MarketData02.csv</td>
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
           		<td>A handle that refers to a (output) filtered Market Data file. <br />- Should be in the pattern "^9322-[0-9]+$"</td>
				<td> </td>
				<td>9322-20148610616930</td>
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
           		<td>InvalidSECCode</td>
           		<td>Invalid Sec code format!</td>
           		<td>Entered sec code does not match the "^[A-Z]{3,4}$" pattern.</td>
           		<td>Check your sec code and try again.</td>
			</tr>
			<tr>
           		<td>InvalidSECCode</td>
           		<td>No Code or Time Matches for criteria in the Market Data file!</td>
           		<td>Entered Sec code match for given time was not found in .csv file</td>
           		<td>Re-create request and try again.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Start date/time is not before end date/time!</td>
           		<td>Entered start date/time is after end date/time. Logiclly incorrect.</td>
           		<td>Check that start date/time is before end date/time and try again.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Private folder structure not created!</td>
           		<td>Service could not create interal file structure for request.</td>
           		<td>Nothing you can do. Admin would have been notified, please try again later.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Error in reading input file OR creating/writing result file!</td>
           		<td>Service could not create or write to interal file.</td>
           		<td>Check correctness of dataSourceURL, If Correct, Nothing you can do. Admin would have been notified, please try again later.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Bad Date format for parsing!</td>
           		<td>Service could not construct valid date/time from passed in .csv file entry date/time format.</td>
           		<td>Check that date and time fields in .csv are of proper format and retry.</td>
			</tr>
			<tr>
           		<td>InvalidURL</td>
           		<td>Invalid URI: must be a .csv file!</td>
           		<td>Entered URL does not point to a .csv file i.e. does not end with .csv</td>
           		<td>Check URL and try again.</td>
			</tr>
			<tr>
           		<td>InvalidURL</td>
           		<td>URL is not of proper strucutre!</td>
           		<td>Url cannot be parsed into service due to structure</td>
           		<td>Check URL and try again.</td>
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
        			<td>sec</td>
        			<td><input type="text" name="aSec" /></td>
        			<td rowspan="5">
        				${importResponse}
        			 </td>
        		</tr>
        		<tr>
        			<td>startDate</td>
        			<td><input type="text" name="aStartDate" /></td>
        		</tr>
        		<tr>
        			<td>endDate</td>
        			<td><input type="text" name="aEndDate" /></td>
        		</tr>
        		<tr>
        			<td>dataSourceURL</td>
        			<td><input type="text" name="aDataSourceURI" /></td>
        		</tr>
        		<tr>
        			<td></td>
        			<td>
        				<input type="hidden" name="action" value="requestImport" />
        				<input type="submit" value="Go!"/>
        			</td>
        		</tr>
        	</table>
        </form>
                
		<hr />
		<br />
		<br />
		
		<!-- ////////////////////////////////////////////////////////////////////////////////////////////// -->
		
		<h4>Download File operation</h4>
		
		<p>
			The downloadFile operation makes Market Data files that are outputs of 'importMarketData' operation
			 accessible to users over the internet via URL download.
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
           		<td>An opaque "handle" or reference that is the output of the 'importMarketData' operation.<br />
           			- Of the pattern "^9322-[0-9]+$".
           		</td>
				<td> </td>
				<td>9322-201481195811595</td>
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
           		<td>dataURL</td>
           		<td>String</td>
           		<td>This is a http:// URL that points to the Market Data file referenced by the 'eventSetId' input parameter. A user can download the Market Data file contents using this URL (e.g. by navigating to this URL using a Web browser).</td>
				<td> </td>
				<td>http://localhost:50000/cjze477_ass1/public/9322-2014811104337431.csv</td>
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
           		<td>ProgramError</td>
           		<td>Invalid Event Id Format!</td>
           		<td>Event handle does not match the pattern '^9322-[0-9]+$'</td>
           		<td>Check handle format and try again.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Event File does not exist!</td>
           		<td>Service could not find the file that belongs to this handle.</td>
           		<td>Make sure you use the 'Import' operation before 'download'.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Private folder structure not created!</td>
           		<td>Service could not create interal file structure for request.</td>
           		<td>Nothing you can do. Admin would have been notified, please try again later.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Copy file error!</td>
           		<td>Service could not fully create a public version of the file.</td>
           		<td>Nothing you can do. Admin would have been notified, please try again later.</td>
			</tr>
			<tr>
           		<td>ProgramError</td>
           		<td>Bad output URI!</td>
           		<td>Service could not construct a valid URI to give to the client.</td>
           		<td>Nothing you can do. Admin would have been notified, please try again later.</td>
			</tr>
        </table>
        
        <h5>Try-it!</h5>
        
        <form method="post" action="Controller">
        	<table>
        		<tr>
        			<th colspan="2" >Parameters</th>
        			<th id="responseFieldDownload" >Response</th>
        		</tr>
        		<tr>
        			<td>eventSetId</td>
        			<td><input type="text" name="aEventSetId" /></td>
        			<td rowspan="5">
        				${downloadResponse}
        			 </td>
        		</tr>
        		<tr>
        			<td></td>
        			<td>
        				<input type="hidden" name="action" value="requestDownload" />
        				<input type="submit" value="Go!"/>
        			</td>
        		</tr>
        	</table>
        </form>
       	
       	<hr />
       	<br />
       	<h4>Download Service WSDL</h4>
        <p><a href="ImportDownloadServices.wsdl" >Download WSDL</a></p>
        
      </div> <!--  Content Div End -->
      
    </div>
    <div id="footer">

    </div>
  </div>
</body>
</html>
