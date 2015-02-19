
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:getAsString name="title" ignore="true" /></title>
            <link rel="stylesheet" type="text/css" href="vendors/bootstrap-3.3.2-dist/css/bootstrap.min.css"/>
     <link rel="stylesheet" type="text/css" href="styles/styles.css"/>
     <script type="text/javascript" src="vendors/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
    
    </head>
    <body>
        <div>
        	<tiles:insert attribute="header" ignore="true" />
        </div>
        	<tiles:insert attribute="body" />
        
		<div>
			<tiles:insert attribute="footer" />
		</div>
    </body>
</html>
