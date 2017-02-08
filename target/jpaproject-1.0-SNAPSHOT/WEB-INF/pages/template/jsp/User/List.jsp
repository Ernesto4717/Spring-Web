<div data-ng-controller="springController">
	<ol class="breadcrumb">
		<li><a href="<c:url value="/User/home"/>">Home</a></li>
		<li class="active">User List</li>
	</ol>
	<table class="table">
		<thead class="thead-inverse">
			<tr>
				<th width="5%">Username</th>
				<th width="10%">Name</th>
				<th width="10%">Role</th>
				<th width="10%">Active</th>
				<th width="11%">Delete</th>
			</tr>
		</thead>

		<tr data-ng-repeat="user in userList">
			<td><a
				data-ng-href="/jpaproject/User/edit?username={{user.username}}">{{user.username}}</a></td>
			<td data-ng-bind="user.name"></td>
			<td data-ng-bind="user.role.description"></td>
			<td data-ng-bind="user.status"></td>
			<td data-ng-show="user.status=='S'">Delete</td>
		</tr>
		</tbody>
	</table>
</div>
