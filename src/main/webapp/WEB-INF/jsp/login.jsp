<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f1" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<f1:base>
    <jsp:body>
        <div class="container">
	        <div class="row">
	        	<div class="col-md-4 offset-md-4 border border-primary bg-primary text-white p-3" >
	        		<h3 style="text-align:center;">Inicio de Sesión</h3>
	        	</div>
				<div class="col-md-4 offset-md-4 border border-primary" >
					<form class="p-2" method="POST" action="login" modelAttribute="user">
					  	
					  	<div class="form-group">
					    	<label for="correoElectronico">Correo 	Electrónico</label>
					    	<form:input type="email" path="correoElectronico" name="correoElectronico" class="form-control" id="correoElectronico" aria-describedby="emailHelp" placeholder="Ingrese su Correo Electrónico"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="contrasena">Contraseña</label>
					    	<form:input type="password" path="contrasena" name="contrasena" class="form-control" id="contrasena" placeholder="Ingrese su Contraseña"/>
					  	</div>

						<button type="submit" class="btn btn-primary btn-block">Enviar</button>
						<a href="/crear" class="btn btn-success btn-block">Crear Cuenta</a>
					</form>
				
				</div>        
	        </div>
        </div>
    </jsp:body>
</f1:base>