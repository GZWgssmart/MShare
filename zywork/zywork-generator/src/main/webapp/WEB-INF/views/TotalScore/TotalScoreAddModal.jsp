<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="userId" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="userId" name="userId" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>

<div class="form-group">
    <label for="total" class="col-sm-2 control-label">兑换数额：</label>
    <div class="col-sm-10">
        <input id="total" name="total" class="form-control" placeholder="请输入兑换数额"/>
    </div>
</div>

<div class="form-group">
    <label for="score" class="col-sm-2 control-label">兑换积分：</label>
    <div class="col-sm-10">
        <input id="score" name="score" class="form-control" placeholder="请输入兑换积分"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/total-score/save', 'data-list', '/total-score/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
