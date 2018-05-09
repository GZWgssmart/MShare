<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">详情</h4>
</div>
<div class="modal-body">
    <div class="row">
        <div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">编号：</span>
    <span class="col-sm-8" id=transIdDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转出人编号：</span>
    <span class="col-sm-8" id=transTransFromDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转入人编号：</span>
    <span class="col-sm-8" id=transTransToDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">金额：</span>
    <span class="col-sm-8" id=transTotalDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转入时间：</span>
    <span class="col-sm-8" id=transTransTimeDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">创建时间：</span>
    <span class="col-sm-8" id=transCreateTimeDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">更新时间：</span>
    <span class="col-sm-8" id=transUpdateTimeDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">编号：</span>
    <span class="col-sm-8" id=userIdDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">手机号：</span>
    <span class="col-sm-8" id=userPhoneDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">昵称：</span>
    <span class="col-sm-8" id=userNicknameDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">头像地址：</span>
    <span class="col-sm-8" id=userHeadiconDetail></span>
</div>


    </div>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
</div>
