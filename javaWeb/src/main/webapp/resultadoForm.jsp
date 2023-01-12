<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="cabecalho.jsp"/>
<html>
<head><title>Cálculo de Juros</title></head>
<body>
    <div id="div2">
        <table cellspacing="0" cellpadding="2" align="center">
            <tr bgcolor="#5f9ea0">
                <td>Capital:</td>
                <td>${valorPrincipal}</td>
            </tr>
            <tr bgcolor="#f0f8ff">
                <td>Taxa % a.m:</td>
                <td>${taxa}</td>
            </tr>
            <tr bgcolor="#5f9ea0">
                <td>N. de Meses:</td>
                <td>${meses}</td>
            </tr>
            <tr bgcolor="#f0f8ff">
                <td>Tipo de Juros:</td>
                <td>${tipo}</td>
            </tr>
            <tr bgcolor="#5f9ea0">
                <td>Total de Juros:</td>
                <td>${juros}</td>
            </tr>
            <tr bgcolor="#f0f8ff">
                <td>Montante:</td>
                <td>${montante}</td>
            </tr>
            <tr>
                <td></td>
                <td align="right"><a href="/AppWeb/calculoForm.jsp">Novo Calculo</a></td>
            </tr>
        </table>

    </div>
</body>
</html>
<jsp:include page="rodape.jsp"/>