# API_CRUD_Servlet_JSP
Aplicação web Java 11 com JSP com Tomcat.

Servlet:
Servlet é um objeto que pode ser acionado por meio de uma requisição do protocolo HTTP. Essa interação é possibilitada pelo Tomcat, e precisa seguir algumas regras, como estender, sobrescrever os métodos doGet(), doPost() e service(), e fazer o mapeamento para indicar a URL.
Como o Servlet é um objeto, devemos criar uma instância da classe OiMundoServlet.java. Repare que em nenhum local do projeto temos o método main(). Quem participou dos cursos básicos do Java sabe que sempre criamos esse método e, a partir dele, criamos a nossa aplicação, instanciando objetos, chamando métodos etc. 
Servlet: requisição e resposta, isto é, HTTP Server Request e HTTP Server Response.
![image](https://github.com/CauaneTemporin/API_CRUD_Servlet_JSP/assets/74147833/54c6f7ef-12c0-456e-98b6-1e260fd53b09)

Tomcat:
Tomcat realiza o papel intermediário entre o navegador e objeto, e por isso também é conhecido como middleware. Trabalha com o protocolo HTTP e nos envia os dados de forma que não precisemos nos preocupar com o parsing dos cabeçalhos e assim por diante.
O Tomcat só irá instanciar as servlets de acordo com a necessidade! Além disso, ele instanciou apenas uma servlet de cada (singleton).
Para testar, acessaremos o endereço http://localhost:8080/gerenciador/ola


URLs no Servlet

@WebServlet
@WebServlet(urlPatterns= {"/listaEmpresas", "/empresas"})
public class ListaEmpresasServlet extends HttpServlet {

web.xml
  <servlet>
      <servlet-name>LES</servlet-name>
      <servlet-class>br.com.alura.gerenciador.servlet.ListaEmpresasServlet</servlet-class>
  </servlet>

  <servlet-mapping>
      <servlet-name>LES</servlet-name>
      <url-pattern>/listaEmpresas</url-pattern>
  </servlet-mapping>

  <servlet-mapping>
      <servlet-name>LES</servlet-name>
      <url-pattern>/empresas</url-pattern>
  </servlet-mapping>

Inversão de controle significa que não é meu método main que instancia objetos, quem se preocupa com a criação das instâncias é o Tomcat.

Adicionar biblioteca taglib:
![image](https://github.com/CauaneTemporin/API_CRUD_Servlet_JSP/assets/74147833/b4645be0-991b-416b-a6c0-f8fc00491a25)

Biblioteca no JSP através de um cabeçalho na página.

Para o core usamos o cabeçalho:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

Para fmt usamos:

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

Salvar:
![image](https://github.com/CauaneTemporin/API_CRUD_Servlet_JSP/assets/74147833/8c8046e9-7f7e-499a-9b47-b67a245505d6)

Delete:
![image](https://github.com/CauaneTemporin/API_CRUD_Servlet_JSP/assets/74147833/26b38076-698a-4947-bd4f-6430913330c0)

Atualizar:
![image](https://github.com/CauaneTemporin/API_CRUD_Servlet_JSP/assets/74147833/6344b03b-a5e1-40b8-840f-966f9818ac10)
