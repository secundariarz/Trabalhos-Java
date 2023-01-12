<html>
    <body>
      <%-- comentário em JSP aqui: nossa primeira página JSP --%>

      <%
        String mensagem = "Bem vindo ao sistema do demônio do Senac Erechim!";
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