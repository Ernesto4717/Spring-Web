<div data-ng-controller="cartController">
	<ol class="breadcrumb">
		<li><a href="/jpaproject/home">Home</a></li>
		<li><a href="home">Cart</a></li>
		<li class="active">List</li>
	</ol>


	<div class="table-responsive">

		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th width="5%">Cart Id</th>
					<th width="15%">Lines Amount</th>
					<th width="15%">Shipping Amount</th>
					<th width="15%">Cart Amount</th>
					<th width="19%">Ship to</th>
					<th width="19%">Status</th>
				</tr>

			</thead>
			<tbody>

				<tr data-ng-repeat="cart in cartList">
					<td><a data-ng-href="edit?cartId={{cart.id}}">{{cart.id}}</a></td>
					<td data-ng-bind="cart.linesAmount | currency"></td>
					<td data-ng-bind="cart.shippingAmount | currency"></td>
					<td data-ng-bind="cart.cartAmount | currency"></td>
					<td data-ng-bind="cart.shipTo.name"></td>
					<td data-ng-bind="cart.status.description"></td>
				</tr>

			</tbody>
		</table>
	</div>
</div>