<%-- 
    Document   : generarReporteInquietudesFrecuentes
    Created on : 4/02/2018, 09:27:19 PM
    Author     : sergioandres
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>BeMonitor</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    </head>
    <body>
        <div class="container">
            <header class="col-xs-12"><h1 align="center">Generar Reporte Inquietudes Frecuentes</h1>           
            </header>
            <div class="panel panel-primary">                
                <div class="panel-body">         
                    <form:form method="get" commandName="reporteInquietudes">                            
                        <form:errors path="*" element="div" cssClass="alert alert-danger" />
                        <div class="col-xs-offset-2 col-xs-12 container">                                   
                            <p> 
                            <div class="col-xs-offset-0 col-xs-4">                                  
                                <br>
                                <br>
                                <br>                                       
                            </div> 
                            </p>                                    
                        </div> 
                        <h1 align="center">
                            <button class="btn btn-primary" type="submit" id="btnReporte" name="btnReporte"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Generar</button> 
                        </h1>
                        <div class="col-xs-offset-0 col-xs-12">
                            <hr>
                        </div> 
                        <table class="table table-bordered table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Tema</th>
                                    <th>Descripcion</th>
                                    <th>Fecha de publicación</th>
                                </tr>
                            </thead>                             
                            <tbody>
                                <c:forEach items="${inquietud}" var="inq">
                                    <tr>
                                        <td><c:out value="${inq.posicion}" /></td>
                                        <td><c:out value="${inq.tema}" /></td>
                                        <td><c:out value="${inq.descripcion}" /></td>
                                        <td><c:out value="${inq.fechaPublicacion}" /></td>                                    </tr>
                                    </c:forEach>
                            </tbody>
                        </table>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>