<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f1" tagdir="/WEB-INF/tags" %>

<f1:base>
    <jsp:body>
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
                <h1 class="display-4">Listado de Productos</h1>
                <p class="lead">
                    El Merchandising que estabas buscando lo puedes encontrar en PRO-F1
                </p>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-10 border-right">
                    <div class="row">
                        <c:forEach var="producto" items="${productos}">
                            <div class="col-md-4">
                                <h2>${producto.nombre}</h2>
                                <img src="${producto.imagen}" height="200" width="200" />
                                <p>
                                    ${producto.descripcion}
                                </p>
                                <p>
                                    S/ ${producto.precio}
                                </p>
                                <p>
                                    <a class="btn btn-secondary" href="/comprar" role="checkbox">Comprar</a>
                                </p>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-2">
                    <form action="/reporte" method="post" >
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="" id="ckCorreo">
                            <label class="form-check-label" for="ckCorreo">
                                Enviar por correo
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="" id="ckExcel">
                            <label class="form-check-label" for="ckExcel">
                                Adjuntar a Excel
                            </label>
                        </div>
                        <div>
                            <br />
                            <button type="submit" class="btn btn-secondary">Generar Reporte</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <hr />
    </jsp:body>
</f1:base>