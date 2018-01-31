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
			<h1>Go Login</h1>
			<form method="post" action="/login">
			    <label for="email">Email</label>
			    <input class="form-control" type="email" id="email" name="email" value="" placeholder="Please enter email..">
			    <label for="password">Password</label>
			    <input class="form-control" type="password" id="password" name="password" value="" placeholder="Please enter password..">
			    <button class="btn btn-primary" type="submit">Login</button>
			    <a class="btn btn-success" href="/register">Register</a>
			</form>
		</div>
	</div>
</div>
</body>
</html>