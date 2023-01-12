<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="cabecalho.jsp"/>
<html>
<head><title>Cálculo de Juros</title></head>
<body>
    <form action="calculo" method="post">
        <div id="div2">
            <div align="center">
                Capital:<input type="text" name="valorPrincipal" value="" size="20">
            </div>
            <div align="center">
                Taxa % a.m:<input type="text" name="taxa" value="" size="15">
            </div>
            <div align="center">
                N. de Meses:<input type="text" name="meses" value="" size="14">
            </div>
            <div align="center">Tipo de Juros:</div>
            <div align="center">
                <input type="radio" name="tipoJuros" value="1" checked="true">Juros Simples
                <input type="radio" name="tipoJuros" value="2">Juros Compostos
            </div>    
            <br>
            <div align="center">
                <input type="reset" value="Limpar">
                <input type="submit" value="Calcular">
            </div>
        </div>
    </form>
</body>
</html>
<jsp:include page="rodape.jsp"/>