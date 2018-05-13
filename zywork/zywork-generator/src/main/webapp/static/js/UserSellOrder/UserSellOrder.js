$(function () {
    loadTable();
    initICheck('green');
    initDatetime();
});

function loadTable() {
    destroyTable('data-list');
    $('#data-list').bootstrapTable({
        url: contextPath + '/user-sell/pager-cond',
        dataType: 'json',
        method: 'post',
        contentType: "application/x-www-form-urlencoded",
        idField: 'orderId',
        pagination: true,
        sidePagination: 'server',
        pageNumber: 1,
        pageSize: 10,
        pageList: [10, 20, 30],
        queryParams: queryParams,
        sortable: true,
        singleSelect: false,
        maintainSelected: true,
        striped: true,
        search: false,
        showColumns: true,
        showRefresh: true,
        showToggle: true,
        detailView: true,
        detailFormatter: formatDetail,
        icons: {
            refresh: 'glyphicon-refresh icon-refresh',
            toggle: 'glyphicon-list-alt icon-list-alt',
            columns: 'glyphicon-th icon-th',
            detailOpen: 'glyphicon-plus icon-plus',
            detailClose: 'glyphicon-minus icon-minus'
        },
        columns: [
                     {
	field: '_checkbox',
	checkbox: true
},
{
	field: 'orderId',
	align: 'center',
	visible: false
},
{
	title: '序号',
	field: '_number',
	align: 'center',
	formatter: formatTableIndex
},
{
	title: '订单编号',
	field: 'orderOrderNo',
	align: 'center',
	sortable: true
},
{
	title: '订单总额',
	field: 'orderTotal',
	align: 'center',
	sortable: true
},
{
	title: '订单类型',
	field: 'orderType',
	align: 'center',
	sortable: true
},
{
	title: '卖出人编号',
	field: 'orderSellId',
	align: 'center',
	sortable: true
},
{
	title: '买入人编号',
	field: 'orderBuyId',
	align: 'center',
	sortable: true
},
{
	title: '创建时间',
	field: 'orderCreateTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '更新时间',
	field: 'orderUpdateTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '订单状态',
	field: 'orderStatus',
	align: 'center',
	sortable: true
},
{
	title: '卖出确认时间',
	field: 'orderSellConfirmTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '买入确认时间',
	field: 'orderBuyConfirmTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '成交时间',
	field: 'orderDealTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '编号',
	field: 'userId',
	align: 'center',
	sortable: true
},
{
	title: '手机号',
	field: 'userPhone',
	align: 'center',
	sortable: true
},
{
	title: '昵称',
	field: 'userNickname',
	align: 'center',
	sortable: true
},
{
	title: '头像地址',
	field: 'userHeadicon',
	align: 'center',
	sortable: true
},
                     {
                         title: '操作',
                         field: '_operation',
                         align: 'center',
                         events: operateEvents,
                         formatter: formatOperators,
                         class: 'operation-column'
                     }
                 ]
    });
}

function formatOperators(value, row, index) {
    let strArray = [];
    strArray.push('<div class="btn-group">');
    strArray.push('<button type="button" class="to-detail btn btn-primary"><i class="fa fa-list"></i>&nbsp;详情</button>');
    strArray.push('<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">');
    strArray.push('<span class="caret"></span>');
    strArray.push('<span class="sr-only">Toggle Dropdown</span>');
    strArray.push('</button>');
    strArray.push('<ul class="dropdown-menu">');
    strArray.push('<li><a href="javascript:void(0)" class="to-edit"><i class="fa fa-edit "></i>&nbsp;修改</a></li>');
    if (row.orderIsActive === 0) {
        strArray.push('<li><a href="javascript:void(0)" class="to-inactive"><i class="fa fa-minus-square-o text-danger"></i><span class="text-danger">&nbsp;冻结</span></a></li>');
    } else {
        strArray.push('<li><a href="javascript:void(0)" class="to-active"><i class="fa fa-check-square-o text-success"></i><span class="text-success">&nbsp;激活</span></a></li>');
    }
    strArray.push('<li><a href="javascript:void(0)" class="to-remove"><i class="fa fa-remove text-danger"></i><span class="text-danger">&nbsp;删除</span></a></li>');
    strArray.push('</ul>');
    strArray.push('</div>');
    return strArray.join('');
}

let fieldTitles = {'orderId':'编号','orderOrderNo':'订单编号','orderTotal':'订单总额','orderType':'订单类型','orderSellId':'卖出人编号','orderBuyId':'买入人编号','orderCreateTime-date':'创建时间','orderUpdateTime-date':'更新时间','orderStatus':'订单状态','orderSellConfirmTime-date':'卖出确认时间','orderBuyConfirmTime-date':'买入确认时间','orderDealTime-date':'成交时间','userId':'编号','userPhone':'手机号','userNickname':'昵称','userHeadicon':'头像地址'};

window.operateEvents = {
    'click .to-detail': function (e, value, row, index) {
        showRemoteDetailModal('detail-modal', '/user-sell/detail-modal', row, fieldTitles);
    },
    'click .to-edit': function (e, value, row, index) {
        showRemoteEditModal('edit-modal', '/user-sell/edit-modal', 'edit-form', row, validateFields());
    },
    'click .to-inactive': function (e, value, row, index) {
        active('/user-sell/active', row.orderId, 1, 'data-list', '/user-sell/pager-cond');
    },
    'click .to-active': function (e, value, row, index) {
        active('/user-sell/active', row.orderId, 0, 'data-list', '/user-sell/pager-cond');
    },
    'click .to-remove': function (e, value, row, index) {
        remove('/user-sell/remove/' + row.orderId, 'data-list', '/user-sell/pager-cond');
    }
};

function formatDetail(index, row) {
    let detail = '';
    $.each(fieldTitles, function (field, title) {
        let fieldArray = field.split("-");
        let value = row[fieldArray[0]];
        if (value !== undefined) {
            detail += '<div class="col-xs-12 col-sm-4 col-md-2 col-lg-2">'
                + '<span class="row-detail-title">'
                + title
                + ':</span>'
                + '</div><div class="col-xs-12 col-sm-8 col-md-4 col-lg-4">'
                + (value === null ? '-' : fieldArray[1] !== undefined && fieldArray[1] === 'date' ? timestampToDatetime(value) : value)
                + '</div>';
        }
    });
    return detail;
}

function queryParams(params) {
    let query = {
        limit: params.limit,
        offset: params.offset,
        sort: params.sort,
        order: params.order
    };
    $.each($('#search-form').serializeArray(), function(index, field){
        query[field.name] = field.value;
    });
    return query;
}

function validateFields() {
    return {
        
userId: {
	validators: {
		notEmpty: {
			message: '编号是必须项'
		}
	}
},
userPhone: {
	validators: {

		stringLength: {
			min: 0,
			max: 11,
			message: '必须小于11个字符'
		}
	}
},
userNickname: {
	validators: {

		stringLength: {
			min: 0,
			max: 20,
			message: '必须小于20个字符'
		}
	}
},
userHeadicon: {
	validators: {

		stringLength: {
			min: 0,
			max: 500,
			message: '必须小于500个字符'
		}
	}
},
orderOrderNo: {
	validators: {
		notEmpty: {
			message: '订单编号是必须项'
		},
		stringLength: {
			min: 1,
			max: 100,
			message: '必须是1-100个字符'
		}
	}
},
orderTotal: {
	validators: {
		notEmpty: {
			message: '订单总额是必须项'
		}
	}
},
orderType: {
	validators: {
	}
},
orderSellId: {
	validators: {
	}
},
orderBuyId: {
	validators: {
	}
}  ,
orderStatus: {
	validators: {
	}
},
orderSellConfirmTime: {
	validators: {
	}
},
orderBuyConfirmTime: {
	validators: {
	}
},
orderDealTime: {
	validators: {
	}
}
    };
}
