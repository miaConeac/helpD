
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

	
		<tiles:insert definition="baseLayout" flush="true" >
			<tiles:put name="title" value="Index"></tiles:put>
			<tiles:put name="body" value="/body.jsp"/>
		</tiles:insert>
	
