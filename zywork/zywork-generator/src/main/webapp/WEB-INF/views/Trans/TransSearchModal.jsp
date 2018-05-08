<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">选择</h4>
</div>
<div class="modal-body">
    <table id="trans-data-list" data-classes="table table-hover text-nowrap" data-toolbar="#trans-toolbar"></table>

    <div id="trans-toolbar">
        <button class="btn btn-primary" onclick="">
            <i class="fa fa-key"></i>
            确认
        </button>
        <button class="btn btn-primary" onclick="showSearchForm('trans-search-form')">
            <i class="fa fa-eye"></i>
            高级搜索
        </button>
        <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>

        <form id="trans-search-form" class="row form-horizontal search-form" style="display: none;">
            <div class="col-sm-6 form-group">
    <label for="transFromSearch" class="col-sm-4 control-label">转出人编号：</label>
    <div class="col-sm-8">
        <input id="transFromSearch" name="transFrom" class="form-control" placeholder="请输入转出人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="transToSearch" class="col-sm-4 control-label">转入人编号：</label>
    <div class="col-sm-8">
        <input id="transToSearch" name="transTo" class="form-control" placeholder="请输入转入人编号">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="totalSearch" class="col-sm-4 control-label">金额：</label>
    <div class="col-sm-8">
        <input id="totalSearch" name="total" class="form-control" placeholder="请输入金额">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="transTimeStartSearch" class="col-sm-4 control-label">转入时间(开始)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="transTimeStartSearch" name="transTimeStart" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择转入时间(开始)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="transTimeEndSearch" class="col-sm-4 control-label">转入时间(结束)：</label>
    <div class="input-group date form_datetime col-sm-8" style="padding-left: 15px; padding-right: 15px;">
        <input id="transTimeEndSearch" name="transTimeEnd" class="form-control input-datetime" type="text" value="" readonly placeholder="请选择转入时间(结束)"/>
        <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
        <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
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
    <label for="updateTimeSearch" class="col-sm-4 control-label">更新时间：</label>
    <div class="col-sm-8">
        <input id="updateTimeSearch" name="updateTime" class="form-control" placeholder="请输入更新时间">
    </div>
</div>



            <div class="col-sm-6 form-group text-right" style="padding-right: 30px;">
                <button type="button" class="btn btn-primary" onclick="doSearch('trans-data-list')">
                    <i class="fa fa-search"></i>
                    搜索
                </button>
                <button type="button" class="btn btn-primary" onclick="doSearchAll('trans-data-list', 'trans-search-form')">
                    <i class="fa fa-search"></i>
                    搜索所有
                </button>
                <button type="button" class="btn btn-primary" onclick="hideSearchForm('trans-data-list', 'trans-search-form')">
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
