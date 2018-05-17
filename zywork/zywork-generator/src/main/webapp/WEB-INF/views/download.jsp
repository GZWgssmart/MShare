<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>瑞信宝APP下载</title>
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/animate.css" rel="stylesheet">
    <link href="<%=path%>/static/css/style.css" rel="stylesheet">
    <link href="<%=path%>/static/css/plugins/sweetalert/sweetalert2.min.css" rel="stylesheet"/>
</head>
<body class="gray-bg">
<div class="login text-center animated fadeInDown">
    <div style="text-align: center;">
        <h3>瑞信宝APP下载</h3>
        <small>请在浏览器中打开，并点击下载APP按钮</small>
        <div>
            <a class="btn btn-primary" href="<%=path%>/static/app/CSTPayShare.apk">下载安卓版APP</a>
        </div>
        <img src="<%=path%>/static/img/mshare.png" style="width: 240px; height: 381px; margin-top: 10px;"/>

    </div>
</div>
</body>
<!-- 全局js -->
<script src="<%=path%>/static/js/jquery.min.js"></script>
<script src="<%=path%>/static/js/bootstrap.min.js"></script>
<script src="<%=path%>/static/js/plugins/metisMenu/metisMenu.min.js"></script>
<script src="<%=path%>/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="<%=path%>/static/js/plugins/sweetalert/sweetalert2.min.js"></script>
<script src="<%=path%>/static/js/plugins/md5/md5.min.js"></script>
</html>
