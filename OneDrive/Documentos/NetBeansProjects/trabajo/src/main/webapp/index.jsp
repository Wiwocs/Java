<%-- 
    Document   : index
    Created on : 25-02-2026, 9:26:31 p. m.
    Author     : wiwoc
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Live Demo</title>
    </head>
    <body>
        <c:set var="usuario" value="Rafaela"/>
        <c:set var="contrasenha" value="12345"/>
        
        <c:if test="${contrasenha == '12345'}">
            <h2>Bienvenida ${usuario}! la clave es valida</h2>
        </c:if>
        <c:if test="${contrasenha != '12345'}">
            <<h2>La contraseña es incorrecta, menso</h2>
        </c:if>
            <img src="https://vmscrub.com/wp-content/uploads/2017/05/happy-dance-animated-gif-image-1-2.gif" alt="alt"/>
    </body>
</html>
