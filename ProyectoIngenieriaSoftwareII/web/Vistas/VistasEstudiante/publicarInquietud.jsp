<%-- 
    Document   : publicarInquietud
    Created on : 7/10/2017, 09:25:35 PM
    Author     : sergioandres
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <title>BeMonitor</title>
    </head>
    <body class="body">
	<div class="container">
            <header class="col-xs-12"><h1 align="center">Publicar Inquietud</h1></header>
                <form:form method="post" class="form-horizontal col-xs-8" commandName="inquietud">                    
                    <div class="form-group">
                        <label class="control-label col-xs-3">Asignatura</label>
                            <div class="col-xs-9">
                                <input type="text" name="inputAsignatura" id="inputAsignatura" value="" placeholder="Asignatura.." autocomplete="off" />
                            </div>
                    </div>
                    <div class="form-group">
			<label class="control-label col-xs-3">Tema</label>
                            <div class="col-xs-9">
                                <textarea name="inputTema" rows="5" cols="70" maxlength="30" placeholder="Escribe aquí el tema..."></textarea>
                            </div>
                    </div>
                    <div class="form-group">
			<label class="control-label col-xs-3">Descripción</label>
                            <div class="col-xs-9">
                                <textarea name="inputDescripcion" rows="5" cols="70" maxlength="60" placeholder="Escribe aquí la descripción..."></textarea>
                            </div>
                    </div>
                    <div class="col-xs-offset-3 col-xs-9">
			<button type="reset" class="btn btn-danger" id="btnPublicarInquietud">Publicar<span class="glyphicon glyphicon-ok"></span></button>
                            <a href="##" class="btn btn-info">Cancelar <span class="glyphicon glyphicon-remove"></span></a>
                    </div>
		</form:form>
	</div>		
    </body>
</html>
