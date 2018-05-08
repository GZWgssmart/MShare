<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="id"/>
        <div class="form-group">
    <label for="feePercent" class="col-sm-2 control-label">手续费比例：</label>
    <div class="col-sm-10">
        <input id="feePercent" name="feePercent" class="form-control" placeholder="请输入手续费比例"/>
    </div>
</div>

<div class="form-group">
    <label for="moneyPercent" class="col-sm-2 control-label">金额转换比例：</label>
    <div class="col-sm-10">
        <input id="moneyPercent" name="moneyPercent" class="form-control" placeholder="请输入金额转换比例"/>
    </div>
</div>

<div class="form-group">
    <label for="scorePercent" class="col-sm-2 control-label">积分转换比例：</label>
    <div class="col-sm-10">
        <input id="scorePercent" name="scorePercent" class="form-control" placeholder="请输入积分转换比例"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/basic-setting/update', 'data-list', '/basic-setting/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
