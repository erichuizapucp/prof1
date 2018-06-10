<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f1" tagdir="/WEB-INF/tags" %>

<f1:base>
    <jsp:body>
        <div class="container">
            <c:forEach var="producto" items="${productos}">
                <div class="row">
                    <div class="col">
                        <h3>${producto.nombre}</h3>
                        <p>
                            ${producto.descripcion}
                        </p>
                        <span>
                            ${producto.precio}
                        </span>
                    </div>
                </div>
            </c:forEach>
        </div>
    </jsp:body>
</f1:base>