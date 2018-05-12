<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="bankCardId"/>
        <div class="form-group">
    <label for="bankCardBankNameEdit" class="col-sm-2 control-label">银行：</label>
    <div class="col-sm-10">
        <input id="bankCardBankNameEdit" name="bankCardBankName" class="form-control" placeholder="请输入银行"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardCardNoEdit" class="col-sm-2 control-label">银行卡号：</label>
    <div class="col-sm-10">
        <input id="bankCardCardNoEdit" name="bankCardCardNo" class="form-control" placeholder="请输入银行卡号"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardRealNameEdit" class="col-sm-2 control-label">真实姓名：</label>
    <div class="col-sm-10">
        <input id="bankCardRealNameEdit" name="bankCardRealName" class="form-control" placeholder="请输入真实姓名"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardPhoneEdit" class="col-sm-2 control-label">手机号：</label>
    <div class="col-sm-10">
        <input id="bankCardPhoneEdit" name="bankCardPhone" class="form-control" placeholder="请输入手机号"/>
    </div>
</div>

<div class="form-group">
    <label for="bankCardUserIdEdit" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="bankCardUserIdEdit" name="bankCardUserId" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-bankcard/update', 'data-list', '/user-bankcard/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
