<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="b" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Gear Technical Forum</h1>
	<h2>Answer the query</h2>
	<a href="index.jsp">Home</a>
	<b:form action="update" method="post" modelAttribute="my">
		<c:if test="${q.query_id != null}">
				
Query Id<b:input path="query_id" value="${q.query_id}"
				readonly="true" />
			<br>
Select Technology<b:input path="technology"
				value="${q.technology }" readonly="true" />
			<br>
Question<b:input path="query" value="${q.query}"
				readonly="true" />
			<br>
Question Raised By<b:input path="query_raised_by"
				value="${q.query_raised_by}" />
			<br>
Solution<b:input path="solutions" />
			<br>

			<td><label for="solution_given_by">Please Select</label></td>
			<td><div>
					<b:select path="solution_given_by">
						<b:option value="">Please Select</b:option>
						<b:options items="${soln}" />
					</b:select>
				</div></td>
			<input type="submit" value="Update Query">
		</c:if>

	</b:form>
</body>
</html>
