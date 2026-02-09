<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='https://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css'>
<style>
	body{margin-top:20px;
background:#eee;
}	
#page-wrapper {
    padding: 15px 25px;
}                    
</style>
</head>
<body>
		<div id="page-wrapper" class="container">
  <div class="row">
	<div class="col-lg-12">
		<h1>Dashboard <small>${res }</small></h1>
		<ol class="breadcrumb">
			<li class="active"><i class="fa fa-dashboard"></i> Dashboard</li>
		</ol>
		<div class="alert alert-success alert-dismissable">
			<button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button>
			Use this boxes to fill your dashboard. You can load number of users, activities, logs, etc...
		</div>
	</div>
</div><!-- /.row -->

<div class="row">
	<div class="col-lg-3">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<i class="fa fa-users fa-5x"></i>
					</div>
					<div class="col-xs-6 text-right">
						<p class="announcement-heading">1</p>
						<p class="announcement-text">Employees</p>
					</div>
				</div>
			</div>
			<a href="/views/empdash.jsp">
				<div class="panel-footer announcement-bottom">
					<div class="row">
						<div class="col-xs-6">
							View
						</div>
						<div class="col-xs-6 text-right">
							<i class="fa fa-arrow-circle-right"></i>
						</div>
					</div>
				</div>
			</a>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="panel panel-warning">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<i class="fa fa-check fa-5x"></i>
					</div>
					<div class="col-xs-6 text-right">
						<p class="announcement-heading">12</p>
						<p class="announcement-text">Task</p>
					</div>
				</div>
			</div>
			<a href="#">
				<div class="panel-footer announcement-bottom">
					<div class="row">
						<div class="col-xs-6">
							View
						</div>
						<div class="col-xs-6 text-right">
							<i class="fa fa-arrow-circle-right"></i>
						</div>
					</div>
				</div>
			</a>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="panel panel-danger">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<i class="fa fa-tasks fa-5x"></i>
					</div>
					<div class="col-xs-6 text-right">
						<p class="announcement-heading">18</p>
						<p class="announcement-text">Client</p>
					</div>
				</div>
			</div>
			<a href="#">
				<div class="panel-footer announcement-bottom">
					<div class="row">
						<div class="col-xs-6">
							View
						</div>
						<div class="col-xs-6 text-right">
							<i class="fa fa-arrow-circle-right"></i>
						</div>
					</div>
				</div>
			</a>
		</div>
	</div>
	<div class="col-lg-3">
		<div class="panel panel-success">
			<div class="panel-heading">
				<div class="row">
					<div class="col-xs-6">
						<i class="fa fa-comments fa-5x"></i>
					</div>
					<div class="col-xs-6 text-right">
						<p class="announcement-heading">56</p>
						<p class="announcement-text">Progress</p>
					</div>
				</div>
			</div>
			<a href="#">
				<div class="panel-footer announcement-bottom">
					<div class="row">
						<div class="col-xs-6">
							View
						</div>
						<div class="col-xs-6 text-right">
							<i class="fa fa-arrow-circle-right"></i>
						</div>
					</div>
				</div>
			</a>
		</div>
	</div>
</div><!-- /.row -->
	</div>
				                                  
<script src='https://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js'></script>
</body>
</html>