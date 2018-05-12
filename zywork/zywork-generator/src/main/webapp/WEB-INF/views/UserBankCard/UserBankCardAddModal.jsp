<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="bankCardBankName" class="col-sm-2 control-label">银行：</label>
    <div class="col-sm-10">
        <input id="bankCardBankName" name="bankCardBankName" class="form-control" placeholder="请输入银行"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardCardNo" class="col-sm-2 control-label">银行卡号：</label>
    <div class="col-sm-10">
        <input id="bankCardCardNo" name="bankCardCardNo" class="form-control" placeholder="请输入银行卡号"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardRealName" class="col-sm-2 control-label">真实姓名：</label>
    <div class="col-sm-10">
        <input id="bankCardRealName" name="bankCardRealName" class="form-control" placeholder="请输入真实姓名"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardPhone" class="col-sm-2 control-label">手机号：</label>
    <div class="col-sm-10">
        <input id="bankCardPhone" name="bankCardPhone" class="form-control" placeholder="请输入手机号"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardUserId" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="bankCardUserId" name="bankCardUserId" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/user-bankcard/save', 'data-list', '/user-bankcard/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
