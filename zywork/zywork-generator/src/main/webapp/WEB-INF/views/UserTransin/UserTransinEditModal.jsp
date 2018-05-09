<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="transId"/>
        <div class="form-group">
    <label for="transTransFromEdit" class="col-sm-2 control-label">转出人编号：</label>
    <div class="col-sm-10">
        <input id="transTransFromEdit" name="transTransFrom" class="form-control" placeholder="请输入转出人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="transTransToEdit" class="col-sm-2 control-label">转入人编号：</label>
    <div class="col-sm-10">
        <input id="transTransToEdit" name="transTransTo" class="form-control" placeholder="请输入转入人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="transTotalEdit" class="col-sm-2 control-label">金额：</label>
    <div class="col-sm-10">
        <input id="transTotalEdit" name="transTotal" class="form-control" placeholder="请输入金额"/>
    </div>
</div>

<div class="form-group">
    <label for="transTransTimeEdit" class="col-sm-2 control-label">转入时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="transTransTimeEdit" name="transTransTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择转入时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-transin/update', 'data-list', '/user-transin/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
