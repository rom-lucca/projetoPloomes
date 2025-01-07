<%-- 
    Document   : registro
    Created on : 3 de out. de 2024, 23:05:46
    Author     : Lucca e Arthur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Usuario"%>
<%@page import="model.dao.UsuarioDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USUÁRIO REGISTRADO</title>
    </head>
    <body>
        <%
            //Entrada                  
            String nome = request.getParameter("nome");
            String empresa = request.getParameter("empresa");
            String telefone = request.getParameter("telefone");            
            String segmento = request.getParameter("segmento");
            String email = request.getParameter("email");            
            String senha = request.getParameter("senha");
            
            // Instância do objeto
            Usuario usu = new Usuario();
            
            // Atribuindo os dados corretamente
            usu.setNome(nome);
            usu.setEmpresa(empresa);
            usu.setTelefone(telefone);
            usu.setSegmento(segmento);
            usu.setEmail(email);
            usu.setSenha(senha);
            
            // Instância do objeto
            UsuarioDAO usuDAO = new UsuarioDAO();
            
            if (usuDAO.insUsu(usu)){    // Insere e retorna o resultado (true / false).
                //Acesso Permitido
                out.println("<h1>Usuário "+ nome +" inserido com sucesso!!!</h1>");
                out.println("<a href=" + "../index.html" + ">Novo registro</a>");
            }else{
                //Acesso Negado
                out.println("Erro!!!");
                out.println("<a href=" + "../index.html" + ">Tentar novamente</a>");
            }            
        %>
    </body>
</html>
