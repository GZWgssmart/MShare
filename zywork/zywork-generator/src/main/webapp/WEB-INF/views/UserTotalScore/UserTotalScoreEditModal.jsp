<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="totalScoreId"/>
        <div class="form-group">
    <label for="totalScoreUserIdEdit" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="totalScoreUserIdEdit" name="totalScoreUserId" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>

<div class="form-group">
    <label for="totalScoreTotalEdit" class="col-sm-2 control-label">兑换数额：</label>
    <div class="col-sm-10">
        <input id="totalScoreTotalEdit" name="totalScoreTotal" class="form-control" placeholder="请输入兑换数额"/>
    </div>
</div>

<div class="form-group">
    <label for="totalScoreScoreEdit" class="col-sm-2 control-label">兑换积分：</label>
    <div class="col-sm-10">
        <input id="totalScoreScoreEdit" name="totalScoreScore" class="form-control" placeholder="请输入兑换积分"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-total-score/update', 'data-list', '/user-total-score/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
