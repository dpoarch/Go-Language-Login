<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>

<div class="container">
   <div class="row">
	   <div class="col-lg-4 offset-lg-4 margin-t40">
		<h1>Register Page</h1>
		{{.}}
			<form method="post" action="/register">
			    <label for="name">Username</label>
			    <input class="form-control" type="text" id="name" name="name" placeholder="Please enter username..">
			    <label for="password">Password</label>
			    <input class="form-control" type="password" id="password" name="password" placeholder="Please enter password..">
			    <label for="email">Email</label>
			    <input class="form-control" type="email" id="email" name="email" placeholder="Please enter email..">
			    <button type="submit" class="btn btn-success">Register</button>
			    <a class="btn btn-dark" href="/">Back to Login</a>
			    
			</form>
		</div>
</div>
</div>