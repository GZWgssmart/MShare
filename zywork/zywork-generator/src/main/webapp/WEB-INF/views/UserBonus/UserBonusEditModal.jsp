<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="bonusAccountsId"/>
        <div class="form-group">
    <label for="bonusAccountsUidEdit" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsUidEdit" name="bonusAccountsUid" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsBonusNameEdit" class="col-sm-2 control-label">奖励名称：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsBonusNameEdit" name="bonusAccountsBonusName" class="form-control" placeholder="请输入奖励名称"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsTotalEdit" class="col-sm-2 control-label">奖励额：</label>
    <div class="col-sm-10">
        <input id="bonusAccountsTotalEdit" name="bonusAccountsTotal" class="form-control" placeholder="请输入奖励额"/>
    </div>
</div>

<div class="form-group">
    <label for="bonusAccountsUpdatedDateEdit" class="col-sm-2 control-label">更新时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="bonusAccountsUpdatedDateEdit" name="bonusAccountsUpdatedDate" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-bonus/update', 'data-list', '/user-bonus/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
