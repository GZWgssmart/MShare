<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>瑞信宝用户注册</title>
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/animate.css" rel="stylesheet">
    <link href="<%=path%>/static/css/style.css" rel="stylesheet">
    <link href="<%=path%>/static/css/plugins/sweetalert/sweetalert2.min.css" rel="stylesheet"/>

    <style>

        .login {
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
            height: 40%;
        }

        .bg-img {
            width: 100%;
            height: 100%;
            left: 0px;
            top: 0px;
            position: absolute;
            opacity: 0.5;
        }
    </style>
</head>
<body class="gray-bg" style="padding-top: 150px;">
<div class="login text-center animated fadeInDown">
    <div>
        <h2>瑞信宝用户注册</h2>

        <form id="loginForm" class="m-t" role="form" style="width: 350px;">
            <div class="form-group">
                <input id="phone" name="phone" class="form-control" placeholder="请输入手机号" required>
            </div>
            <div class="form-group">
                <input id="password" type="password" name="password" class="form-control" placeholder="请输入密码" required>
            </div>
            <div class="form-group">
                <input id="confPassword" type="password" name="password" class="form-control" placeholder="请输入确认密码" required>
            </div>
            <div class="form-group">
                <input id="fromId" name="fromId" class="form-control" placeholder="请输入推荐码" value="${requestScope.fromId}" required>
            </div>
            <div class="form-group">
                <input id="code" name="code" class="form-control" placeholder="请输入手机验证码" required>
            </div>
            <button id="getCode" type="button" class="btn btn-primary block full-width m-b" onclick="getCodes()">获取手机验证码</button>
            <div id="time" style="display: none;"></div>

            <button type="button" class="btn btn-primary block full-width m-b" onclick="reg()">注册</button>

        </form>
        <a href="<%=path%>/download">我要下载APP</a>
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
<script>
    function getCodes() {
        var phoneExp = /^[1][3,4,5,7,8][0-9]{9}$/;
        if(!phoneExp.test($('#phone').val())) {
            swal('提示', '请输入正确的手机号', 'warning');
        } else {
            $.post('<%=path%>/sms/send', {
                phone: $('#phone').val()
            }, function(data) {
                if(data.status === 'ok') {
                    $('#getCode').attr('style', 'display: none;');
                    var timeDiv = $('#time');
                    timeDiv.attr('style', 'display: block;');
                    var count = 60 * 10;
                    var timer = setInterval(function() {
                        timeDiv.text((--count)+ '秒');
                        if (count == 0) {
                            clearInterval(timer);
                            timeDiv.attr('style', 'display: none;');
                            $('#getCode').attr('style', 'display: block;');
                        }
                    }, 1000);
                }
                swal('提示', data.message, 'warning');
            }, 'json');
        }
    }

    function reg() {
        var phoneExp = /^[1][3,4,5,7,8][0-9]{9}$/;
        if(!phoneExp.test($('#phone').val())) {
            swal('提示', '请输入正确的手机号', 'warning');
        } else if($('#password').val() == '' || $('#password').val().length < 6 || $('#password').val() != $('#confPassword').val()) {
            swal('提示', '请输入正确的密码和确认密码，必须大于等于6个字符', 'warning');
        } else if($('#fromId').val() == '') {
           swal('提示', '请填写推荐码', 'warning');
        } else {
            $.post('<%=path%>/user/one/' + $('#fromId').val(), {}, function (data) {
                if (data.id != null && data.id != '') {
                    $.post('<%=path%>/user/save',
                        {
                            phone: $('#phone').val(),
                            password: md5.base64($('#password').val()),
                            code: $('#code').val()
                        },
                        function (data) {
                            if (data.status === 'ok') {
                                swal('提示', '注册成功，请使用瑞信宝APP登录', 'success');
                            } else if(data.code == 654321 || data.code == 654322 || data.code == 654323) {
                                swal('提示', data.message, 'warning');
                            } else {
                                swal('提示', data.message, 'warning');
                            }
                        }, 'json'
                    );
                } else {
                    swal('提示', '请输入正确的推荐码', 'warning');
                }
            }, 'json');
        }
    }

</script>
</html>
