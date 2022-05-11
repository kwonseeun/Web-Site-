<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Simple Sidebar - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="../resources/assets/favicon.ico" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../resources/css/styles.css" rel="stylesheet" />
    </head>
    <body>
    	<script type="text/javascript">
    		var check=${check};
    			var message = "${rsltMsg}"
    			if(check == 2)
    				alert(message);
    	</script>
    
        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
            <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light">목록</div>
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="register">회원가입</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="user">회원조회</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="select">게시물 조회</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="write">게시물 등록</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="delete">게시물 삭제</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="withdraw">회원탈퇴</a>
                </div>
            </div>
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
                <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
                    <div class="container-fluid">
                        <button class="btn btn-primary" id="sidebarToggle">Toggle Menu</button>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                                <li class="nav-item active"><a class="nav-link" href="../">Home</a></li>
                                <li class="nav-item"><a class="nav-link" href="https://hihaoun.tistory.com/">Link</a></li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                                    <div class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#!">Action</a>
                                        <a class="dropdown-item" href="#!">Another action</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#!">Something else here</a>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- Page content-->
                <div class="container-fluid">
                    <h1 class="mt-4">회원가입</h1>
                    <form action="/register" method="post">
                    <table bolder="1">
                    	<tr><th width="70">ID:</th> <td><input type="text" name="userId" size="23"></td></tr> 
                  		<tr><th width="70">PW:</th> <td><input type="text" name="userPw" size="23"></td></tr>
                    	<tr><th width="70">Name:</th> <td><input type="text" name="userName" size="23"></td></tr>
                    	<tr><th width="70">Gender:</th> <td><input type="text" name="userGender" size="23"></td></tr>
                  	    <tr><th width="70">Email:</th> <td><input type="text" name="userEmail" size="23"></td></tr>
                    <tr align="center">
						<td colspan="2">
		                    <input type="submit" value="submit">
							<input type="reset" value="reset">
						</td>
					</tr>
                    </table>
                    </form>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="../resources/js/scripts.js"></script>
    </body>
</html>