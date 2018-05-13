<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>UserBuyOrder</title>
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html"/>
    <![endif]-->
    <%@include file="../master/include-css.jsp"%>
</head>
<body class="gray-bg">
<div class="row wrapper wrapper-content animated fadeInRight">
    <div class="col-sm-12">
        <table id="data-list" data-classes="table table-hover text-nowrap" data-toolbar="#toolbar"></table>

        <div id="toolbar">
            <button class="btn btn-primary" onclick="showRemoteAddModal('add-modal', '/user-buy/add-modal', 'add-form', validateFields())">
                <i class="fa fa-plus"></i>
                添加
            </button>
            <div class="btn-group">
              <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <i class="fa fa-th-list"></i>
                批量操作&nbsp;<span class="caret"></span>
              </button>
              <ul class="dropdown-menu">
                <li>
                    <a href="javascript:void(0);" onclick="batchActive('/user-buy/batch-active', 0, 'data-list', '/user-buy/pager-cond', 'orderId')">
                        <i class="fa fa-check-square-o text-success"></i><span class="text-success">&nbsp;批量激活</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);" onclick="batchActive('/user-buy/batch-active', 1, 'data-list', '/user-buy/pager-cond', 'orderId')">
                        <i class="fa fa-minus-square-o text-danger"></i><span class="text-danger">&nbsp;批量冻结</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);" onclick="batchRemove('/user-buy/batch-remove', 'data-list', '/user-buy/pager-cond', 'orderId')">
                        <i class="fa fa-remove text-danger"></i><span class="text-danger">&nbsp;批量删除</span>
                    </a>
                </li>
              </ul>
            </div>
            <button class="btn btn-primary" onclick="showSearchForm('search-form')">
                <i class="fa fa-eye"></i>
                高级搜索
            </button>

            <form id="search-form" class="row form-horizontal search-form" style="display: none;">
                <div class="col-sm-6 form-group">
    <label for="orderOrderNoSearch" class="col-sm-4 control-label">订单编号：</label>
    <div class="col-sm-8">
        <input id="orderOrderNoSearch" name="orderOrderNo" class="form-control" placeholder="请输入订单编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderTotalSearch" class="col-sm-4 control-label">订单总额：</label>
    <div class="col-sm-8">
        <input id="orderTotalSearch" name="orderTotal" class="form-control" placeholder="请输入订单总额">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderTypeSearch" class="col-sm-4 control-label">订单类型：</label>
    <div class="col-sm-8">
        <input id="orderTypeSearch" name="orderType" class="form-control" placeholder="请输入订单类型">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderSellIdSearch" class="col-sm-4 control-label">卖出人编号：</label>
    <div class="col-sm-8">
        <input id="orderSellIdSearch" name="orderSellId" class="form-control" placeholder="请输入卖出人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderBuyIdSearch" class="col-sm-4 control-label">买入人编号：</label>
    <div class="col-sm-8">
        <input id="orderBuyIdSearch" name="orderBuyId" class="form-control" placeholder="请输入买入人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderCreateTimeStartSearch" class="col-sm-4 control-label">创建时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderCreateTimeStartSearch" name="orderCreateTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderCreateTimeEndSearch" class="col-sm-4 control-label">创建时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderCreateTimeEndSearch" name="orderCreateTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderUpdateTimeStartSearch" class="col-sm-4 control-label">更新时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderUpdateTimeStartSearch" name="orderUpdateTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderUpdateTimeEndSearch" class="col-sm-4 control-label">更新时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderUpdateTimeEndSearch" name="orderUpdateTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderStatusSearch" class="col-sm-4 control-label">订单状态：</label>
    <div class="col-sm-8">
        <input id="orderStatusSearch" name="orderStatus" class="form-control" placeholder="请输入订单状态">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderSellConfirmTimeStartSearch" class="col-sm-4 control-label">卖出确认时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderSellConfirmTimeStartSearch" name="orderSellConfirmTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderSellConfirmTimeEndSearch" class="col-sm-4 control-label">卖出确认时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderSellConfirmTimeEndSearch" name="orderSellConfirmTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderBuyConfirmTimeStartSearch" class="col-sm-4 control-label">买入确认时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderBuyConfirmTimeStartSearch" name="orderBuyConfirmTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderBuyConfirmTimeEndSearch" class="col-sm-4 control-label">买入确认时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderBuyConfirmTimeEndSearch" name="orderBuyConfirmTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderDealTimeStartSearch" class="col-sm-4 control-label">成交时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderDealTimeStartSearch" name="orderDealTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="orderDealTimeEndSearch" class="col-sm-4 control-label">成交时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="orderDealTimeEndSearch" name="orderDealTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>



                <div class="col-sm-6 form-group text-right" style="padding-right: 30px;">
                    <button type="button" class="btn btn-primary" onclick="doSearch('data-list')">
                    <i class="fa fa-search"></i>
                        搜索
                    </button>
                    <button type="button" class="btn btn-primary" onclick="doSearchAll('data-list', 'search-form')">
                        <i class="fa fa-search"></i>
                        搜索所有
                    </button>
                    <button type="button" class="btn btn-primary" onclick="hideSearchForm('data-list', 'search-form')">
                        <i class="fa fa-eye-slash"></i>
                        取消搜索
                    </button>
                </div>
            </form>
        </div>
    </div>

</div>

<div class="modal fade" id="add-modal" tabindex="-1" role="dialog"  aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
        </div>
    </div>
</div>

<div class="modal fade" id="edit-modal" tabindex="-1" role="dialog"  aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
        </div>
    </div>
</div>

<div class="modal fade" id="detail-modal" tabindex="-1" role="dialog"  aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
        </div>
    </div>
</div>

</body>
<%@include file="../master/include-js.jsp"%>
<script src="<%=path%>/static/js/UserBuyOrder/UserBuyOrder.js"></script>
</html>
