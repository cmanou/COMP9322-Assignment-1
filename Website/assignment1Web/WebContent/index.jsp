<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
          <li class="selected"><a href="index.jsp">Home</a></li>
          <li><a href="importDownload.jsp">Import/Download</a></li>
          <li><a href="summary.jsp">Summary MarketData</a></li>
          <li><a href="currencyConvert.jsp">Currency Convert</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      
      <div id="content">
        <!-- insert the page content here -->
        
        <div style="width:100%;text-align:center;">
	        <p>Explore and understand COMP9322 SOAP web services.</p>
	      	<img src="style/webservicediagram.png" style="border:2px dashed green"/>           
       	</div>
       
      </div>
      
    </div>
    <div id="footer">

    </div>
  </div>
</body>
</html>
