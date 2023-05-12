<%@page import="classeJava.Calculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Academia</title>
    </head>
    
    <body>
        <%
            // Inicializar variáveis.
            String nomeCliente = request.getParameter("nomeCliente");
            String pacote = request.getParameter("numPacote"), alert = "";  // 1, 2 ou 3.
            int numModalidades;  // 2, 3 ou 4.
            float valorMensalidade, valorDesconto, mensalidadeComDesconto;
            
            // Instanciar objCalculo / Enviar dados para o objCalculo.
            Calculo objCalculo = new Calculo();
            objCalculo.setNome(nomeCliente);
            
            // Verificar pacote.
            if ((Integer.valueOf(pacote) >= 4) || (Integer.valueOf(pacote) <= 0)){
                pacote = "INVÁLIDO";
                alert = "POR FAVOR ESCOLHA UM PACOTE VÁLIDO: ( 1 / 2 / 3 ).";
            } else            
                objCalculo.setNumPacote(Integer.valueOf(pacote));
            
            nomeCliente = objCalculo.getNome();
            numModalidades = objCalculo.IdentificarModalidade();
            String resposta = objCalculo.Resposta("resposta");
            valorMensalidade = objCalculo.TotalMensalidade();
            valorDesconto = objCalculo.CalculoDesconto();
            mensalidadeComDesconto = objCalculo.TotalComDesconto();
        %>
        <h1>Academia</h1>
        <h2>Prezado(a) <%=nomeCliente%>, seja bem vindo(a)!</h2>
        <h2><%=alert%></h2>
        <p>Númoro do pacote: (<%=pacote%>).</p>
        <p>Númoro de modadidades: (<%=numModalidades%>) <%=resposta%></p>
        <p><%="O valor da mensalidade sem desconto é R$" + valorMensalidade%></p>
        <p><%="O valor do desconto é R$" + valorDesconto%></p>
        <p><%="O valor da mensalidade com desconto é R$" + mensalidadeComDesconto%></p>
    </body>
</html>
