<%--
  Created by IntelliJ IDEA.
  User: marek
  Date: 8/8/2023
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>City</title>

    <div>

        <div>
            <label for="airport">Choose your origin:
            </label>
            <select id="airport" name="airport">
                <c:forEach items="${airport}" var="example">
                    <option value="${example.id}">${example.name}</option>
                </c:forEach>
            </select>
        </div>
        <br>

        <div>
            <label for="country">Choose your country destination:
            </label>
            <select id="country" name="country">
                <c:forEach items="${country}" var="example">
                    <option value="${example.id}">${example.name}</option>
                </c:forEach>
            </select>
        </div>
        <br>

        <div>
            <label for="city">Choose your city destination:
            </label>
            <select id="city" name="city">
                <c:forEach items="${city}" var="example">
                    <option value="${example.id}">${example.name}</option>
                </c:forEach>
            </select>
        </div>
        <br>

            <div>
                <label for="hotel">Choose your hotel:
                </label>
                <select id="hotel" name="hotel">
                    <c:forEach items="${hotel}" var="example">
                        <option value="${example.id}">${example.name}</option>
                    </c:forEach>
                </select>
            </div>

        <br>

        <form method="post" action='<c:url value=""/>'>
            <button type="submit">
                Search
            </button>
            <br>
            <br>
        </form>

    </div>


</head>
<body>

</body>
</html>
