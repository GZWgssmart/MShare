<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="suggestId"/>
        <div class="form-group">
    <label for="suggestUserIdEdit" class="col-sm-2 control-label">用户编号：</label>
    <div class="col-sm-10">
        <input id="suggestUserIdEdit" name="suggestUserId" class="form-control" placeholder="请输入用户编号"/>
    </div>
</div>

<div class="form-group">
    <label for="suggestSuggestEdit" class="col-sm-2 control-label">投诉建议：</label>
    <div class="col-sm-10">
        <input id="suggestSuggestEdit" name="suggestSuggest" class="form-control" placeholder="请输入投诉建议"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-suggest/update', 'data-list', '/user-suggest/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
