<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f1" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<f1:base>
    <jsp:body>
        <div class="container">
	        <div class="row">
	        	<div class="col-md-4 offset-md-4 border border-primary bg-primary text-white p-3" >
	        		<h3 style="text-align:center;">Crear Cuenta de Aficionado</h3>
	        	</div>
				<div class="col-md-4 offset-md-4 border border-primary" >
					<form class="p-2" method="POST" action="crear" modelAttribute="user">
					  	
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Nombre</label>
					    	<form:input name="nombre" path="nombre"  type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Ingrese su nombre"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Apellido Paterno</label>
					    	<form:input name="apellidoPaterno" path="apellidoPaterno"  type="text" class="form-control" id="apellidop" placeholder="Ingrese su Apellido Paterno"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Apellido Materno</label>
					    	<form:input  name="apellidoMaterno" path="apellidoMaterno"  type="text" class="form-control" id="apellidom" aria-describedby="emailHelp" placeholder="Ingrese su Apellido Materno"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Edad</label>
					    	<form:input name="edad" path="edad"  type="number" class="form-control" id="edad" placeholder="Ingrese su Edad"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Sexo</label>
					    	<form:input name="sexo" path="sexo"  type="text" class="form-control" id="exampleInputPassword1" placeholder="Ingrese su Sexo"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputEmail1">Correo 	Electrónico</label>
					    	<form:input  path="correoElectronico"  name="correoElectronico"  type="email" class="form-control" id="correoe" aria-describedby="emailHelp" placeholder="Ingrese su Correo Electrónico"/>
					  	</div>
					  	<div class="form-group">
					    	<label for="exampleInputPassword1">Contraseña</label>
					    	<form:input path="contrasena" name="contrasena"  type="password" class="form-control" id="contrasena" placeholder="Ingrese su Contraseña"/>
					  	</div>
						<button type="submit" class="btn btn-primary btn-block">Enviar</button>
					</form>
				
				</div>        
	        </div>
        </div>
    </jsp:body>
</f1:base>