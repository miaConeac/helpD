<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:errors/>

<div class="wrapper">
<div class="body-container">
	<div class="login-form">
		<html:form styleClass="form-horizontal" action="/loginn"> 
		    <div class="form-group">
		    	<label class="col-sm-2 control-label" >
		    		<bean:message key="loginForm.email"/>
		    	</label>
			    <div class="col-sm-10" >
			    	<html:text styleClass="form-control" property="email" ></html:text>
			    </div>
		    </div>
		     <div class="form-group">
		    	<label class="col-sm-2 control-label" >
		    		<bean:message key="loginForm.password"/>
		    	</label>
			    <div class="col-sm-10" >
			    	<html:text styleClass="form-control" property="password" ></html:text>
			    </div>
		    </div>
		 	<div class="form-group">
		 		<div class="col-sm-offset-2 col-sm-10">
		    		<html:submit styleClass="btn btn-default" value="Submit"></html:submit>
				</div>
			</div>
		</html:form>
	</div>
</div>
</div>