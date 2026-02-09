<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' href='https://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css'>
<title>Insert title here</title>
</head>
<style>
	body{
background:#ddd;
}
.form-control-borderless {
    border: none;
}

.form-control-borderless:hover, .form-control-borderless:active, .form-control-borderless:focus {
    border: none;
    outline: none;
    box-shadow: none;
}
</style>
<body>
		<div class="container">
    <br/>
	<div class="row justify-content-center">
                        <div class="col-12 col-md-10 col-lg-8">
                            <form class="card card-sm" action="/getEmp">
                                <div class="card-body row no-gutters align-items-center">
                                    <div class="col-auto">
                                        <i class="fas fa-search h4 text-body"></i>
                                    </div>
                                    <!--end of col-->
                                    <div class="col">
                                        <input class="form-control form-control-lg form-control-borderless" type="search"  name ="eid" placeholder="Search by Id">
                                    </div>
                                    <!--end of col-->
                                    <div class="col-auto">
                                        <button class="btn btn-lg btn-success" type="submit">Search</button>
                                    </div>
                                    <!--end of col-->
                                </div>
                            </form>
                        </div>
                        <!--end of col-->
                    </div>
</div>

<div class="panel-body">
              <div class="row">
                <div class="col-xs-4"><a href="searchupdate.jsp" class="btn btn-default center-block">Update</a></div>
                <div class="col-xs-4"><a href="craeteEmp.jsp" class="btn btn-primary center-block">Create</a></div>
                <div class="col-xs-4"><a href="deleteEmp.jsp" class="btn btn-danger center-block">Delete</a></div>
              </div>
      </div>   
<script src='https://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js'></script>
</body>
</html>