<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/fornecedor" var="linkServletFornecedor"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionar empresas</title>
</head>

<body>
	<form action="${linkServletFornecedor }" method="post">
		Nome: <input type="text" name="nome"/>
		Data abertura: <input type="text" name="data"/>
		
		<input type="submit" />
	</form>
</body>
</html>