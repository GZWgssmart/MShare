<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>BasicSetting</title>
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
            <button class="btn btn-primary" onclick="showRemoteAddModal('add-modal', '/basic-setting/add-modal', 'add-form', validateFields())">
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
                    <a href="javascript:void(0);" onclick="batchActive('/basic-setting/batch-active', 0, 'data-list', '/basic-setting/pager-cond', 'id')">
                        <i class="fa fa-check-square-o text-success"></i><span class="text-success">&nbsp;批量激活</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);" onclick="batchActive('/basic-setting/batch-active', 1, 'data-list', '/basic-setting/pager-cond', 'id')">
                        <i class="fa fa-minus-square-o text-danger"></i><span class="text-danger">&nbsp;批量冻结</span>
                    </a>
                </li>
                <li>
                    <a href="javascript:void(0);" onclick="batchRemove('/basic-setting/batch-remove', 'data-list', '/basic-setting/pager-cond', 'id')">
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
<script src="<%=path%>/static/js/BasicSetting/BasicSetting.js"></script>
</html>
