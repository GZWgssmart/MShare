<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
    <h4 class="modal-title">添加</h4>
</div>
<div class="modal-body">
    <form id="add-form" class="form-horizontal row" enctype="multipart/form-data">
        <div class="form-group">
    <label for="feePercent" class="col-sm-2 control-label">手续费比例：</label>
    <div class="col-sm-10">
        <input id="feePercent" name="feePercent" class="form-control" placeholder="请输入手续费比例"/>
    </div>
</div>

<div class="form-group">
    <label for="moneyPercent" class="col-sm-2 control-label">金额转换比例：</label>
    <div class="col-sm-10">
        <input id="moneyPercent" name="moneyPercent" class="form-control" placeholder="请输入金额转换比例"/>
    </div>
</div>

<div class="form-group">
    <label for="scorePercent" class="col-sm-2 control-label">积分转换比例：</label>
    <div class="col-sm-10">
        <input id="scorePercent" name="scorePercent" class="form-control" placeholder="请输入积分转换比例"/>
    </div>
</div>

<div class="form-group">
    <label for="sliderImg1" class="col-sm-2 control-label">轮播图1：</label>
    <div class="col-sm-10">
        <input id="sliderImg1" name="sliderImg1" class="form-control" placeholder="请输入轮播图1"/>
    </div>
</div>

<div class="form-group">
    <label for="sliderImg2" class="col-sm-2 control-label">轮播图2：</label>
    <div class="col-sm-10">
        <input id="sliderImg2" name="sliderImg2" class="form-control" placeholder="请输入轮播图2"/>
    </div>
</div>

<div class="form-group">
    <label for="sliderImg3" class="col-sm-2 control-label">轮播图3：</label>
    <div class="col-sm-10">
        <input id="sliderImg3" name="sliderImg3" class="form-control" placeholder="请输入轮播图3"/>
    </div>
</div>

<div class="form-group">
    <label for="sliderImg4" class="col-sm-2 control-label">轮播图4：</label>
    <div class="col-sm-10">
        <input id="sliderImg4" name="sliderImg4" class="form-control" placeholder="请输入轮播图4"/>
    </div>
</div>

<div class="form-group">
    <label for="sliderImg5" class="col-sm-2 control-label">轮播图5：</label>
    <div class="col-sm-10">
        <input id="sliderImg5" name="sliderImg5" class="form-control" placeholder="请输入轮播图5"/>
    </div>
</div>

<div class="form-group">
    <label for="regBonus" class="col-sm-2 control-label">注册资产奖励：</label>
    <div class="col-sm-10">
        <input id="regBonus" name="regBonus" class="form-control" placeholder="请输入注册资产奖励"/>
    </div>
</div>


    </form>
</div>
<div class="modal-footer">
    <button type="button" class="btn btn-white" data-dismiss="modal">取消</button>
    <button id="btn-save" type="button" class="btn btn-primary" onclick="saveOrEdit('btn-save', 'add-modal', 'add-form', '/basic-setting/save', 'data-list', '/basic-setting/pager-cond')">确认</button>
</div>

<script>
    initDatetime();
</script>
