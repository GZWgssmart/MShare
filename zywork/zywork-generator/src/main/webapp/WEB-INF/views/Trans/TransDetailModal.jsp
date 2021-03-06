<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">详情</h4>
</div>
<div class="modal-body">
    <div class="row">
        <div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">编号：</span>
    <span class="col-sm-8" id=idDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转出人编号：</span>
    <span class="col-sm-8" id=transFromDetail></span>
</div>

        <div class="col-sm-6 detail-content">
            <span class="col-sm-4 row-detail-title">转出人昵称：</span>
            <span class="col-sm-8" id=fromNicknameDetail></span>
        </div>

        <div class="col-sm-6 detail-content">
            <span class="col-sm-4 row-detail-title">转出人手机号：</span>
            <span class="col-sm-8" id=fromPhoneDetail></span>
        </div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转入人编号：</span>
    <span class="col-sm-8" id=transToDetail></span>
</div>

        <div class="col-sm-6 detail-content">
            <span class="col-sm-4 row-detail-title">转入人昵称：</span>
            <span class="col-sm-8" id=toNicknameDetail></span>
        </div>

        <div class="col-sm-6 detail-content">
            <span class="col-sm-4 row-detail-title">转入人手机号：</span>
            <span class="col-sm-8" id=toPhoneDetail></span>
        </div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">金额：</span>
    <span class="col-sm-8" id=totalDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">转入时间：</span>
    <span class="col-sm-8" id=transTimeDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">创建时间：</span>
    <span class="col-sm-8" id=createTimeDetail></span>
</div>

<div class="col-sm-6 detail-content">
    <span class="col-sm-4 row-detail-title">更新时间：</span>
    <span class="col-sm-8" id=updateTimeDetail></span>
</div>


    </div>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
</div>
