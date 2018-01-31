<!DOCTYPE html>
<html>
<head>
    <title></title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-lg-4 offset-lg-4 margin-t40">
			<h1>Profile</h1>
			<form method="post" action="/logout">
			    <button class="btn btn-danger" type="submit">Logout</button>
			</form>
		</div>
	</div>
	<div class="row margin-t40">
		<div class="col-lg-4 offset-lg-4">
			<p><strong>User :</strong> {{index . 0}}</p>
		  	<p><strong>Full Name :</strong> {{index . 1}}</p>
		  	<p><strong>Phone :</strong> {{index . 2}}</p>
		  	<p><strong>Address :</strong> {{index . 3}}</p>	
		    <p><strong>Created :</strong> {{index . 4}}</p>	
		  	<a class="btn btn-warning" href="/edit">Edit</a>
		</div>
	</div>
</div>
</body>
</html>