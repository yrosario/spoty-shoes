<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Product</title>
</head>
<body>
	
	<div id="wrapper">
		
		<div id="content">
		
		<!-- add new button: Add Product -->
		<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'"
		/>
		
			<table>
				<tr>
					<th>Product name</th>
					<th>gender</th>
					<th>color</th>
					<th>style</th>
					<th>brand</th>
					<th>size</th>
					<th>price</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempProduct" items="${products}">
				
					<!-- construct an "update" link with product id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempProduct.id}" />
					</c:url>
					
					
					<tr>
						<td> ${tempProduct.name} </td>
						<td> ${tempProduct.gender} </td>
						<td> ${tempProduct.style} </td>
						<td> ${tempProduct.brand} </td>
						<td> ${tempProduct.size} </td>
						<td> ${tempProduct.price} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
					</tr>
					
				</c:forEach>
			</table>
		
		</div>
	
	</div>
</body>
</html>