<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="transTransFrom" class="col-sm-2 control-label">转出人编号：</label>
    <div class="col-sm-10">
        <input id="transTransFrom" name="transTransFrom" class="form-control" placeholder="请输入转出人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="transTransTo" class="col-sm-2 control-label">转入人编号：</label>
    <div class="col-sm-10">
        <input id="transTransTo" name="transTransTo" class="form-control" placeholder="请输入转入人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="transTotal" class="col-sm-2 control-label">金额：</label>
    <div class="col-sm-10">
        <input id="transTotal" name="transTotal" class="form-control" placeholder="请输入金额"/>
    </div>
</div>

<div class="form-group">
    <label for="transTransTime" class="col-sm-2 control-label">转入时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="transTransTime" name="transTransTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择转入时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/user-transin/save', 'data-list', '/user-transin/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
