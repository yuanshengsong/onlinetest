<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>在线考试系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Employment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<link rel="stylesheet" href="css/boot.css">
	<link rel="stylesheet" href="css/style1.css" type="text/css" media="all" />
</head>

<body>
	<!-- main banner -->
	<div class="main-top" id="home">
		<!-- header -->
		<header>
				<!-- nav -->
				<nav class="py-lg-4 py-3 px-xl-5 px-lg-3 px-2">
					<div id="logo">
						<h1><a class="">ExamOnline！</a></h1>
					</div>
					<label for="drop" class="toggle">菜单</label>
					<input type="checkbox" id="drop" />
					<ul class="menu mt-2">
						<li class="active mx-md-2 my-md-0 my-2"><a href="/OnlineTest/pages/client/chengjichaxun/chengjichaxun.html">成绩查询</a></li>
						<!--<li class="mx-lg-3 mx-md-2 my-md-0 my-2">
							<input type="checkbox" id="drop-2" />
						</li>-->
						<li><a href="index.html">注销登录</a></li>
					</ul>
				</nav>
		</header>
		<div class="main-w3pvt">
			<div class="container">
				<div class="style-banner text-center">
					<!--<h4 class="mb-2">Welcome to Our ExamOnline!</h4>-->
					<h1 class="font-weight-bold mb-3">欢迎进入在线考试！</h1>
					<p>Welcome to our ExamOnline System！</p>
					<!-- popup button -->
					<a href="<%=request.getContextPath()%>/pages/client/ExamOnline/examOnRead.jsp" style="max-width: 150px; margin: 0 auto;" class="btn button-style mt-sm-5 mt-4">进入考试</a>
					<!-- //popup button -->
				</div>
			</div>
		</div>
	</div>
	<div id="popup1" class="popup-effect">
		<div class="popup">
			<img src="images/blog3.jpg" alt="Popup Image" class="img-fluid" />
			<a class="close" href="#">&times;</a>
		</div>
	</div>
</body>

</html>