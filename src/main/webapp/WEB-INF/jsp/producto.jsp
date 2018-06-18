<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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