<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="orderOrderNo" class="col-sm-2 control-label">订单编号：</label>
    <div class="col-sm-10">
        <input id="orderOrderNo" name="orderOrderNo" class="form-control" placeholder="请输入订单编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderTotal" class="col-sm-2 control-label">订单总额：</label>
    <div class="col-sm-10">
        <input id="orderTotal" name="orderTotal" class="form-control" placeholder="请输入订单总额"/>
    </div>
</div>

<div class="form-group">
    <label for="orderType" class="col-sm-2 control-label">订单类型：</label>
    <div class="col-sm-10">
        <input id="orderType" name="orderType" class="form-control" placeholder="请输入订单类型"/>
    </div>
</div>

<div class="form-group">
    <label for="orderSellId" class="col-sm-2 control-label">卖出人编号：</label>
    <div class="col-sm-10">
        <input id="orderSellId" name="orderSellId" class="form-control" placeholder="请输入卖出人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderBuyId" class="col-sm-2 control-label">买入人编号：</label>
    <div class="col-sm-10">
        <input id="orderBuyId" name="orderBuyId" class="form-control" placeholder="请输入买入人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderStatus" class="col-sm-2 control-label">订单状态：</label>
    <div class="col-sm-10">
        <input id="orderStatus" name="orderStatus" class="form-control" placeholder="请输入订单状态"/>
    </div>
</div>

<div class="form-group">
    <label for="orderSellConfirmTime" class="col-sm-2 control-label">卖出确认时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderSellConfirmTime" name="orderSellConfirmTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="form-group">
    <label for="orderBuyConfirmTime" class="col-sm-2 control-label">买入确认时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderBuyConfirmTime" name="orderBuyConfirmTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="form-group">
    <label for="orderDealTime" class="col-sm-2 control-label">成交时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderDealTime" name="orderDealTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/user-sell/save', 'data-list', '/user-sell/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
