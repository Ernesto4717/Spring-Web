<div data-ng-controller="itemController">

	<ol class="breadcrumb">
		<li><a data-ng-href="/jpaproject/home">Home</a></li>
		<li><a data-ng-href="/jpaproject/Item/home">Item</a></li>
		<li class="active">Create</li>
	</ol>


	<div class="container-center ">
		<form method="post">

			<div class="form-group">
				<input type="number" placeholder="id" class="form-control"
					data-ng-model="item.id" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="description" class="form-control"
					data-ng-model="item.description" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="price" class="form-control"
					data-ng-model="item.price" required />
			</div>

			<div class="form-group">
				<input type="text" placeholder="stock" class="form-control"
					data-ng-model="item.stock" required />
			</div>

			<div class="form-group">
				<input type="submit" class="btn btn-info" data-ng-click="send()" />
			</div>

		</form>


	</div>


</div>

