<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Alien Quest</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style h6>
    a {
        color: black;
        text-decoration: none;
        font-weight: bold;
        font-size: 40px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
    }
</style>
<body>
<div class="container">
    <header class="d-flex flex-wrap align-items-center justify-content-center py-3 mb-4 border-bottom">
        <h6><a href="${pageContext.request.contextPath}/start">Alien quest</a></h6>

    </header>
</div>
</body>
</html>
