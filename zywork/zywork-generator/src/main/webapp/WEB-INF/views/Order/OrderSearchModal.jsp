<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">选择</h4>
</div>
<div class="modal-body">
    <table id="order-data-list" data-classes="table table-hover text-nowrap" data-toolbar="#order-toolbar"></table>

    <div id="order-toolbar">
        <button class="btn btn-primary" onclick="">
            <i class="fa fa-key"></i>
            确认
        </button>
        <button class="btn btn-primary" onclick="showSearchForm('order-search-form')">
            <i class="fa fa-eye"></i>
            高级搜索
        </button>
        <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>

        <form id="order-search-form" class="row form-horizontal search-form" style="display: none;">
            <div class="col-sm-6 form-group">
    <label for="orderNoSearch" class="col-sm-4 control-label">订单编号：</label>
    <div class="col-sm-8">
        <input id="orderNoSearch" name="orderNo" class="form-control" placeholder="请输入订单编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="totalSearch" class="col-sm-4 control-label">订单总额：</label>
    <div class="col-sm-8">
        <input id="totalSearch" name="total" class="form-control" placeholder="请输入订单总额">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="typeSearch" class="col-sm-4 control-label">订单类型：</label>
    <div class="col-sm-8">
        <input id="typeSearch" name="type" class="form-control" placeholder="请输入订单类型">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sellIdSearch" class="col-sm-4 control-label">卖出人编号：</label>
    <div class="col-sm-8">
        <input id="sellIdSearch" name="sellId" class="form-control" placeholder="请输入卖出人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="buyIdSearch" class="col-sm-4 control-label">买入人编号：</label>
    <div class="col-sm-8">
        <input id="buyIdSearch" name="buyId" class="form-control" placeholder="请输入买入人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="createTimeStartSearch" class="col-sm-4 control-label">创建时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="createTimeStartSearch" name="createTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="createTimeEndSearch" class="col-sm-4 control-label">创建时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="createTimeEndSearch" name="createTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择创建时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="updateTimeStartSearch" class="col-sm-4 control-label">更新时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="updateTimeStartSearch" name="updateTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="updateTimeEndSearch" class="col-sm-4 control-label">更新时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="updateTimeEndSearch" name="updateTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择更新时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="statusSearch" class="col-sm-4 control-label">订单状态：</label>
    <div class="col-sm-8">
        <input id="statusSearch" name="status" class="form-control" placeholder="请输入订单状态">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sellConfirmTimeStartSearch" class="col-sm-4 control-label">卖出确认时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="sellConfirmTimeStartSearch" name="sellConfirmTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sellConfirmTimeEndSearch" class="col-sm-4 control-label">卖出确认时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="sellConfirmTimeEndSearch" name="sellConfirmTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择卖出确认时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="buyConfirmTimeStartSearch" class="col-sm-4 control-label">买入确认时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="buyConfirmTimeStartSearch" name="buyConfirmTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="buyConfirmTimeEndSearch" class="col-sm-4 control-label">买入确认时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="buyConfirmTimeEndSearch" name="buyConfirmTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择买入确认时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="dealTimeStartSearch" class="col-sm-4 control-label">成交时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="dealTimeStartSearch" name="dealTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="dealTimeEndSearch" class="col-sm-4 control-label">成交时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="dealTimeEndSearch" name="dealTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择成交时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>



            <div class="col-sm-6 form-group text-right" style="padding-right: 30px;">
                <button type="button" class="btn btn-primary" onclick="doSearch('order-data-list')">
                    <i class="fa fa-search"></i>
                    搜索
                </button>
                <button type="button" class="btn btn-primary" onclick="doSearchAll('order-data-list', 'order-search-form')">
                    <i class="fa fa-search"></i>
                    搜索所有
                </button>
                <button type="button" class="btn btn-primary" onclick="hideSearchForm('order-data-list', 'order-search-form')">
                    <i class="fa fa-eye-slash"></i>
                    取消搜索
                </button>
            </div>
        </form>
    </div>
</div>

<script>
    initDatetime();
</script>
