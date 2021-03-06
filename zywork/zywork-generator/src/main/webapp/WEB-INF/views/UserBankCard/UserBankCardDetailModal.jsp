<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">详情</h4>
</div>
<div class="modal-body">
    <div class="row">
        <div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">编号：</span>
    <span class="col-sm-8" id="bankCardIdDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">银行：</span>
    <span class="col-sm-8" id="bankCardBankNameDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">银行卡号：</span>
    <span class="col-sm-8" id="bankCardCardNoDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">真实姓名：</span>
    <span class="col-sm-8" id="bankCardRealNameDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">手机号：</span>
    <span class="col-sm-8" id="bankCardPhoneDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">用户编号：</span>
    <span class="col-sm-8" id="bankCardUserIdDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">创建时间：</span>
    <span class="col-sm-8" id="bankCardCreateTimeDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">更新时间：</span>
    <span class="col-sm-8" id="bankCardUpdateTimeDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">编号：</span>
    <span class="col-sm-8" id="userIdDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">手机号：</span>
    <span class="col-sm-8" id="userPhoneDetail"></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">昵称：</span>
    <span class="col-sm-8" id="userNicknameDetail"></span>
</div>


    </div>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
</div>
