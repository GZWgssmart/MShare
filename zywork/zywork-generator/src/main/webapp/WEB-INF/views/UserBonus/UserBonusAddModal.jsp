<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="bonusAccountsUid" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsUid" name="bonusAccountsUid" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsBonusName" class="col-sm-2 control-label">奖励名称：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsBonusName" name="bonusAccountsBonusName" class="form-control" placeholder="请输入奖励名称"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsTotal" class="col-sm-2 control-label">奖励额：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsTotal" name="bonusAccountsTotal" class="form-control" placeholder="请输入奖励额"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsUpdatedDate" class="col-sm-2 control-label">更新时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="bonusAccountsUpdatedDate" name="bonusAccountsUpdatedDate" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/user-bonus/save', 'data-list', '/user-bonus/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
