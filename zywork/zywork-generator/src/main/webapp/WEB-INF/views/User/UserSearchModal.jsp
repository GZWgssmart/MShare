<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">选择</h4>
</div>
<div class="modal-body">
    <table id="user-data-list" data-classes="table table-hover text-nowrap" data-toolbar="#user-toolbar"></table>

    <div id="user-toolbar">
        <button class="btn btn-primary" onclick="">
            <i class="fa fa-key"></i>
            确认
        </button>
        <button class="btn btn-primary" onclick="showSearchForm('user-search-form')">
            <i class="fa fa-eye"></i>
            高级搜索
        </button>
        <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>

        <form id="user-search-form" class="row form-horizontal search-form" style="display: none;">
            <div class="col-sm-6 form-group">
    <label for="emailSearch" class="col-sm-4 control-label">邮箱：</label>
    <div class="col-sm-8">
        <input id="emailSearch" name="email" class="form-control" placeholder="请输入邮箱">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="phoneSearch" class="col-sm-4 control-label">手机号：</label>
    <div class="col-sm-8">
        <input id="phoneSearch" name="phone" class="form-control" placeholder="请输入手机号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="accountNameSearch" class="col-sm-4 control-label">账户名：</label>
    <div class="col-sm-8">
        <input id="accountNameSearch" name="accountName" class="form-control" placeholder="请输入账户名">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="passwordSearch" class="col-sm-4 control-label">登录密码：</label>
    <div class="col-sm-8">
        <input id="passwordSearch" name="password" class="form-control" placeholder="请输入登录密码">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="payPasswordSearch" class="col-sm-4 control-label">支付密码：</label>
    <div class="col-sm-8">
        <input id="payPasswordSearch" name="payPassword" class="form-control" placeholder="请输入支付密码">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="saltSearch" class="col-sm-4 control-label">加密盐值：</label>
    <div class="col-sm-8">
        <input id="saltSearch" name="salt" class="form-control" placeholder="请输入加密盐值">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="nicknameSearch" class="col-sm-4 control-label">昵称：</label>
    <div class="col-sm-8">
        <input id="nicknameSearch" name="nickname" class="form-control" placeholder="请输入昵称">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="headiconSearch" class="col-sm-4 control-label">头像地址：</label>
    <div class="col-sm-8">
        <input id="headiconSearch" name="headicon" class="form-control" placeholder="请输入头像地址">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="totalSearch" class="col-sm-4 control-label">余额：</label>
    <div class="col-sm-8">
        <input id="totalSearch" name="total" class="form-control" placeholder="请输入余额">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="scoreSearch" class="col-sm-4 control-label">积分：</label>
    <div class="col-sm-8">
        <input id="scoreSearch" name="score" class="form-control" placeholder="请输入积分">
    </div>
</div>

            <div class="col-sm-6 form-group">
                <label for="propsSearch" class="col-sm-4 control-label">资产：</label>
                <div class="col-sm-8">
                    <input id="propsSearch" name="props" class="form-control" placeholder="请输入资产">
                </div>
            </div>

<div class="col-sm-6 form-group">
    <label for="levelSearch" class="col-sm-4 control-label">信用等级：</label>
    <div class="col-sm-8">
        <input id="levelSearch" name="level" class="form-control" placeholder="请输入信用等级">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="identitySearch" class="col-sm-4 control-label">身份证号：</label>
    <div class="col-sm-8">
        <input id="identitySearch" name="identity" class="form-control" placeholder="请输入身份证号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="realNameSearch" class="col-sm-4 control-label">真实姓名：</label>
    <div class="col-sm-8">
        <input id="realNameSearch" name="realName" class="form-control" placeholder="请输入真实姓名">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="genderSearch" class="col-sm-4 control-label">性别：</label>
    <div class="col-sm-8">
        <input id="genderSearch" name="gender" class="form-control" placeholder="请输入性别">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="birthdayStartSearch" class="col-sm-4 control-label">生日(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="birthdayStartSearch" name="birthdayStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择生日(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="birthdayEndSearch" class="col-sm-4 control-label">生日(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="birthdayEndSearch" name="birthdayEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择生日(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="ageSearch" class="col-sm-4 control-label">年龄：</label>
    <div class="col-sm-8">
        <input id="ageSearch" name="age" class="form-control" placeholder="请输入年龄">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="createTimeStartSearch" class="col-sm-4 control-label">创建时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="createTimeStartSearch" name="createTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="createTimeEndSearch" class="col-sm-4 control-label">创建时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="createTimeEndSearch" name="createTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="updateTimeStartSearch" class="col-sm-4 control-label">更新时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="updateTimeStartSearch" name="updateTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="updateTimeEndSearch" class="col-sm-4 control-label">更新时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="updateTimeEndSearch" name="updateTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="isActiveSearch" class="col-sm-4 control-label">是否激活：</label>
    <div class="col-sm-8">
        <input id="isActiveSearch" name="isActive" class="form-control" placeholder="请输入是否激活">
    </div>
</div>



            <div class="col-sm-6 form-group text-right" style="padding-right: 30px;">
                <button type="button" class="btn btn-primary" onclick="doSearch('user-data-list')">
                    <i class="fa fa-search"></i>
                    搜索
                </button>
                <button type="button" class="btn btn-primary" onclick="doSearchAll('user-data-list', 'user-search-form')">
                    <i class="fa fa-search"></i>
                    搜索所有
                </button>
                <button type="button" class="btn btn-primary" onclick="hideSearchForm('user-data-list', 'user-search-form')">
                    <i class="fa fa-eye-slash"></i>
                    取消搜索
                </button>
            </div>
        </form>
    </div>
</div>

<script>
    initDatetime();
</script>
