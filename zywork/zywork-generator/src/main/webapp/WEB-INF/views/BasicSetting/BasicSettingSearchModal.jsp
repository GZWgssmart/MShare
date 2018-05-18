<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">选择</h4>
</div>
<div class="modal-body">
    <table id="basic-setting-data-list" data-classes="table table-hover text-nowrap" data-toolbar="#basic-setting-toolbar"></table>

    <div id="basic-setting-toolbar">
        <button class="btn btn-primary" onclick="">
            <i class="fa fa-key"></i>
            确认
        </button>
        <button class="btn btn-primary" onclick="showSearchForm('basic-setting-search-form')">
            <i class="fa fa-eye"></i>
            高级搜索
        </button>
        <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>

        <form id="basic-setting-search-form" class="row form-horizontal search-form" style="display: none;">
            <div class="col-sm-6 form-group">
    <label for="feePercentSearch" class="col-sm-4 control-label">手续费比例：</label>
    <div class="col-sm-8">
        <input id="feePercentSearch" name="feePercent" class="form-control" placeholder="请输入手续费比例">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="moneyPercentSearch" class="col-sm-4 control-label">金额转换比例：</label>
    <div class="col-sm-8">
        <input id="moneyPercentSearch" name="moneyPercent" class="form-control" placeholder="请输入金额转换比例">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="scorePercentSearch" class="col-sm-4 control-label">积分转换比例：</label>
    <div class="col-sm-8">
        <input id="scorePercentSearch" name="scorePercent" class="form-control" placeholder="请输入积分转换比例">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sliderImg1Search" class="col-sm-4 control-label">轮播图1：</label>
    <div class="col-sm-8">
        <input id="sliderImg1Search" name="sliderImg1" class="form-control" placeholder="请输入轮播图1">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sliderImg2Search" class="col-sm-4 control-label">轮播图2：</label>
    <div class="col-sm-8">
        <input id="sliderImg2Search" name="sliderImg2" class="form-control" placeholder="请输入轮播图2">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sliderImg3Search" class="col-sm-4 control-label">轮播图3：</label>
    <div class="col-sm-8">
        <input id="sliderImg3Search" name="sliderImg3" class="form-control" placeholder="请输入轮播图3">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sliderImg4Search" class="col-sm-4 control-label">轮播图4：</label>
    <div class="col-sm-8">
        <input id="sliderImg4Search" name="sliderImg4" class="form-control" placeholder="请输入轮播图4">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="sliderImg5Search" class="col-sm-4 control-label">轮播图5：</label>
    <div class="col-sm-8">
        <input id="sliderImg5Search" name="sliderImg5" class="form-control" placeholder="请输入轮播图5">
    </div>
</div>

<div class="col-sm-6 form-group">
    <label for="regBonusSearch" class="col-sm-4 control-label">注册资产奖励：</label>
    <div class="col-sm-8">
        <input id="regBonusSearch" name="regBonus" class="form-control" placeholder="请输入注册资产奖励">
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



            <div class="col-sm-6 form-group text-right" style="padding-right: 30px;">
                <button type="button" class="btn btn-primary" onclick="doSearch('basic-setting-data-list')">
                    <i class="fa fa-search"></i>
                    搜索
                </button>
                <button type="button" class="btn btn-primary" onclick="doSearchAll('basic-setting-data-list', 'basic-setting-search-form')">
                    <i class="fa fa-search"></i>
                    搜索所有
                </button>
                <button type="button" class="btn btn-primary" onclick="hideSearchForm('basic-setting-data-list', 'basic-setting-search-form')">
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
