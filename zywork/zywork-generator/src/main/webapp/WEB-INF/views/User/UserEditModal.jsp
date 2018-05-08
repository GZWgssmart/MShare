<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="id"/>
        <div class="form-group">
    <label for="email" class="col-sm-2 control-label">邮箱：</label>
    <div class="col-sm-10">
        <input id="email" name="email" class="form-control" placeholder="请输入邮箱"/>
    </div>
</div>

<div class="form-group">
    <label for="phone" class="col-sm-2 control-label">手机号：</label>
    <div class="col-sm-10">
        <input id="phone" name="phone" class="form-control" placeholder="请输入手机号"/>
    </div>
</div>

<div class="form-group">
    <label for="accountName" class="col-sm-2 control-label">账户名：</label>
    <div class="col-sm-10">
        <input id="accountName" name="accountName" class="form-control" placeholder="请输入账户名"/>
    </div>
</div>

<div class="form-group">
    <label for="password" class="col-sm-2 control-label">登录密码：</label>
    <div class="col-sm-10">
        <input id="password" name="password" class="form-control" placeholder="请输入登录密码"/>
    </div>
</div>

<div class="form-group">
    <label for="payPassword" class="col-sm-2 control-label">支付密码：</label>
    <div class="col-sm-10">
        <input id="payPassword" name="payPassword" class="form-control" placeholder="请输入支付密码"/>
    </div>
</div>

<div class="form-group">
    <label for="salt" class="col-sm-2 control-label">加密盐值：</label>
    <div class="col-sm-10">
        <input id="salt" name="salt" class="form-control" placeholder="请输入加密盐值"/>
    </div>
</div>

<div class="form-group">
    <label for="nickname" class="col-sm-2 control-label">昵称：</label>
    <div class="col-sm-10">
        <input id="nickname" name="nickname" class="form-control" placeholder="请输入昵称"/>
    </div>
</div>

<div class="form-group">
    <label for="headicon" class="col-sm-2 control-label">头像地址：</label>
    <div class="col-sm-10">
        <input id="headicon" name="headicon" class="form-control" placeholder="请输入头像地址"/>
    </div>
</div>

<div class="form-group">
    <label for="total" class="col-sm-2 control-label">余额：</label>
    <div class="col-sm-10">
        <input id="total" name="total" class="form-control" placeholder="请输入余额"/>
    </div>
</div>

<div class="form-group">
    <label for="score" class="col-sm-2 control-label">积分：</label>
    <div class="col-sm-10">
        <input id="score" name="score" class="form-control" placeholder="请输入积分"/>
    </div>
</div>

<div class="form-group">
    <label for="level" class="col-sm-2 control-label">信用等级：</label>
    <div class="col-sm-10">
        <input id="level" name="level" class="form-control" placeholder="请输入信用等级"/>
    </div>
</div>

<div class="form-group">
    <label for="identity" class="col-sm-2 control-label">身份证号：</label>
    <div class="col-sm-10">
        <input id="identity" name="identity" class="form-control" placeholder="请输入身份证号"/>
    </div>
</div>

<div class="form-group">
    <label for="realName" class="col-sm-2 control-label">真实姓名：</label>
    <div class="col-sm-10">
        <input id="realName" name="realName" class="form-control" placeholder="请输入真实姓名"/>
    </div>
</div>

<div class="form-group">
    <label for="gender" class="col-sm-2 control-label">性别：</label>
    <div class="col-sm-10">
        <input id="gender" name="gender" class="form-control" placeholder="请输入性别"/>
    </div>
</div>

<div class="form-group">
    <label for="birthday" class="col-sm-2 control-label">生日：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="birthday" name="birthday" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择生日"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="form-group">
    <label for="age" class="col-sm-2 control-label">年龄：</label>
    <div class="col-sm-10">
        <input id="age" name="age" class="form-control" placeholder="请输入年龄"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user/update', 'data-list', '/user/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
