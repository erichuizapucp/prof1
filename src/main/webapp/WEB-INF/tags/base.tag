<%@tag description="Plantilla Principal" pageEncoding="UTF-8"%>

<html>
    <head>
        <link rel="stylesheet" href="/css/bootstrap.css" type="text/css">
        <link rel="stylesheet" href="/css/bootstrap-grid.css" type="text/css">
        <link rel="stylesheet" href="/css/bootstrap-reboot.css" type="text/css">
        <script src="/js/bootstrap.bundle.js"></script>
        <script src="/js/bootstrap.js"></script>
    </head>
    <body>
        <jsp:include page="../jsp/encabezado.jsp" />
        <jsp:doBody />
        <jsp:include page="../jsp/piedepagina.jsp" />
    </body>
</html>