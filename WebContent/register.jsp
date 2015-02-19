<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:errors/>

<div class="wrapper">
<div class="body-container">
	<div class="register-form">
		<html:form styleClass="form-horizontal" action="/customer"> 
		    <div class="form-group">
		    	<label class="col-sm-2 control-label">
		    		<bean:message key="label.email"/>
		    	</label>
			    <div class="col-sm-10">
			    	<html:text styleClass="form-control" property="email" ></html:text>
			    </div>
		    </div>
		    <bean:message key="label.pwd1"/>
		    <html:text property="pwd1"></html:text>
		    <br>
		    <bean:message key="label.pwd2"/>
		    <html:text property="pwd2"></html:text>
		    <br>
		 
		    <html:submit value="Submit"></html:submit>
		</html:form>
	</div>
</div>
</div>