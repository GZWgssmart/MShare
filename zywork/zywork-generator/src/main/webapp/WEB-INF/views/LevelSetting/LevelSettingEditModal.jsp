<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="id"/>
        <div class="form-group">
    <label for="name" class="col-sm-2 control-label">等级名称：</label>
    <div class="col-sm-10">
        <input id="name" name="name" class="form-control" placeholder="请输入等级名称"/>
    </div>
</div>

<div class="form-group">
    <label for="minMoney" class="col-sm-2 control-label">最小金额：</label>
    <div class="col-sm-10">
        <input id="minMoney" name="minMoney" class="form-control" placeholder="请输入最小金额"/>
    </div>
</div>

<div class="form-group">
    <label for="maxMoney" class="col-sm-2 control-label">最大金额：</label>
    <div class="col-sm-10">
        <input id="maxMoney" name="maxMoney" class="form-control" placeholder="请输入最大金额"/>
    </div>
</div>

<div class="form-group">
    <label for="transPercent" class="col-sm-2 control-label">转换比例：</label>
    <div class="col-sm-10">
        <input id="transPercent" name="transPercent" class="form-control" placeholder="请输入转换比例"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/level-setting/update', 'data-list', '/level-setting/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
