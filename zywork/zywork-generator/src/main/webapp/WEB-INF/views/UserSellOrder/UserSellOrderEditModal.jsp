<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">编辑</h4>
</div>
<div class="modal-body">
    <form id="edit-form" class="form-horizontal row" enctype="multipart/form-data">
        <input type="hidden" name="orderId"/>
        <div class="form-group">
    <label for="orderOrderNoEdit" class="col-sm-2 control-label">订单编号：</label>
    <div class="col-sm-10">
        <input id="orderOrderNoEdit" name="orderOrderNo" class="form-control" placeholder="请输入订单编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderTotalEdit" class="col-sm-2 control-label">订单总额：</label>
    <div class="col-sm-10">
        <input id="orderTotalEdit" name="orderTotal" class="form-control" placeholder="请输入订单总额"/>
    </div>
</div>

<div class="form-group">
    <label for="orderTypeEdit" class="col-sm-2 control-label">订单类型：</label>
    <div class="col-sm-10">
        <input id="orderTypeEdit" name="orderType" class="form-control" placeholder="请输入订单类型"/>
    </div>
</div>

<div class="form-group">
    <label for="orderSellIdEdit" class="col-sm-2 control-label">卖出人编号：</label>
    <div class="col-sm-10">
        <input id="orderSellIdEdit" name="orderSellId" class="form-control" placeholder="请输入卖出人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderBuyIdEdit" class="col-sm-2 control-label">买入人编号：</label>
    <div class="col-sm-10">
        <input id="orderBuyIdEdit" name="orderBuyId" class="form-control" placeholder="请输入买入人编号"/>
    </div>
</div>

<div class="form-group">
    <label for="orderStatusEdit" class="col-sm-2 control-label">订单状态：</label>
    <div class="col-sm-10">
        <input id="orderStatusEdit" name="orderStatus" class="form-control" placeholder="请输入订单状态"/>
    </div>
</div>

<div class="form-group">
    <label for="orderSellConfirmTimeEdit" class="col-sm-2 control-label">卖出确认时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderSellConfirmTimeEdit" name="orderSellConfirmTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="form-group">
    <label for="orderBuyConfirmTimeEdit" class="col-sm-2 control-label">买入确认时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderBuyConfirmTimeEdit" name="orderBuyConfirmTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="form-group">
    <label for="orderDealTimeEdit" class="col-sm-2 control-label">成交时间：</label>
    <div class="input-group date form_datetime col-sm-10" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderDealTimeEdit" name="orderDealTime" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
	    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-edit" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-edit', 'edit-modal', 'edit-form', '/user-sell/update', 'data-list', '/user-sell/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
