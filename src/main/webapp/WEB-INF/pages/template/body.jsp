<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div class="text-center">
	<div class="jumbotron ">
		<h1>Winter Academy</h1>
		<p class="lead"></p>
		<p>
			<a class="btn btn-lg btn-success" href="http://www.softtek.com/es/"
				role="button">Softtek &raquo;</a>
		</p>
	</div>

</div>|

<div class="container-center text-center">
	<div class="container marketing">
	
		<div class="row">
			<div class="col-lg-6">
			<a  href="<c:url value="User/home"/>">
				<img class="img-circle"
					src="<c:url value="/resources/images/user.png"/>" alt="User"
					width="140" height="140">
					</a>
				<h2>User</h2>
				<p></p>
			</div>
		
			<div class="col-lg-6">
			<a  href="<c:url value="Cart/home"/>">
				<img class="img-circle"
					src="<c:url value="/resources/images/cart.png"/>" alt="Cart"
					width="140" height="140">
					</a>
				<h2>Cart</h2>
				<p></p>
			</div>
		
		</div>
	</div>
</div>