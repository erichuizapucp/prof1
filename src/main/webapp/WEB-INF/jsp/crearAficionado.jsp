<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f1" tagdir="/WEB-INF/tags" %>

<f1:base>
    <jsp:body>
        <div class="container">
	        <div class="row">
	        	<div class="col-md-4 offset-md-4 border border-primary bg-primary text-white p-3" >
	        		<h3 style="text-align:center;">Crear Cuenta de Aficionado</h3>
	        	</div>
				<div class="col-md-4 offset-md-4 border border-primary" >
					<form class="p-2">
					  	
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Nombre</label>
					    	<input type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Ingrese su nombre">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Apellido Paterno</label>
					    	<input type="text" class="form-control" id="apellidop" placeholder="Ingrese su Apellido Paterno">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Apellido Materno</label>
					    	<input type="text" class="form-control" id="apellidom" aria-describedby="emailHelp" placeholder="Ingrese su Apellido Materno">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Edad</label>
					    	<input type="number" class="form-control" id="edad" placeholder="Ingrese su Edad">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Sexo</label>
					    	<input type="text" class="form-control" id="exampleInputPassword1" placeholder="Ingrese su Sexo">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Correo 	Electrónico</label>
					    	<input type="email" class="form-control" id="correoe" aria-describedby="emailHelp" placeholder="Ingrese su Correo Electrónico">
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Contraseña</label>
					    	<input type="password" class="form-control" id="contrasena" placeholder="Ingrese su Contraseña">
					  	</div>
						<button type="submit" class="btn btn-primary btn-block">Enviar</button>
					</form>
				
				</div>        
	        </div>
        </div>
    </jsp:body>
</f1:base>