<html>
    <body>
      <%-- coment�rio em JSP aqui: nossa primeira p�gina JSP --%>

      <%
        String mensagem = "Bem vindo ao sistema do dem�nio do Senac Erechim!";
      %>
      <% out.println(mensagem); %>

      <br/>

      <%
        String desenvolvido = "Desenvolvido por Deus!";
      %>
      <%= desenvolvido %>

      <br/>

      <%
        System.out.println("Tudo foi executado!");
      %>
    </body>
  </html>