$(function () {
    loadTable();
    initICheck('green');
    initDatetime();
});

function loadTable() {
    destroyTable('data-list');
    $('#data-list').bootstrapTable({
        url: contextPath + '/order/pager-cond',
        dataType: 'json',
        method: 'post',
        contentType: "application/x-www-form-urlencoded",
        idField: 'id',
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
	field: 'id',
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
	field: 'orderNo',
	align: 'center',
	sortable: true
},
{
	title: '订单总额',
	field: 'total',
	align: 'center',
	sortable: true
},
{
	title: '订单类型',
	field: 'type',
	align: 'center',
	sortable: true
},
{
	title: '卖出人编号',
	field: 'sellId',
	align: 'center',
	sortable: true
},
{
	title: '买入人编号',
	field: 'buyId',
	align: 'center',
	sortable: true
},
{
	title: '创建时间',
	field: 'createTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '更新时间',
	field: 'updateTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '订单状态',
	field: 'status',
	align: 'center',
	sortable: true
},
{
	title: '卖出确认时间',
	field: 'sellConfirmTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '买入确认时间',
	field: 'buyConfirmTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '成交时间',
	field: 'dealTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
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
    if (row.isActive === 0) {
        strArray.push('<li><a href="javascript:void(0)" class="to-inactive"><i class="fa fa-minus-square-o text-danger"></i><span class="text-danger">&nbsp;冻结</span></a></li>');
    } else {
        strArray.push('<li><a href="javascript:void(0)" class="to-active"><i class="fa fa-check-square-o text-success"></i><span class="text-success">&nbsp;激活</span></a></li>');
    }
    strArray.push('<li><a href="javascript:void(0)" class="to-remove"><i class="fa fa-remove text-danger"></i><span class="text-danger">&nbsp;删除</span></a></li>');
    strArray.push('</ul>');
    strArray.push('</div>');
    return strArray.join('');
}

let fieldTitles = {'id':'编号','orderNo':'订单编号','total':'订单总额','type':'订单类型','sellId':'卖出人编号','buyId':'买入人编号','createTime-date':'创建时间','updateTime-date':'更新时间','status':'订单状态','sellConfirmTime-date':'卖出确认时间','buyConfirmTime-date':'买入确认时间','dealTime-date':'成交时间'};

window.operateEvents = {
    'click .to-detail': function (e, value, row, index) {
        showRemoteDetailModal('detail-modal', '/order/detail-modal', row, fieldTitles);
    },
    'click .to-edit': function (e, value, row, index) {
        showRemoteEditModal('edit-modal', '/order/edit-modal', 'edit-form', row, validateFields());
    },
    'click .to-inactive': function (e, value, row, index) {
        active('/order/active', row.id, 1, 'data-list', '/order/pager-cond');
    },
    'click .to-active': function (e, value, row, index) {
        active('/order/active', row.id, 0, 'data-list', '/order/pager-cond');
    },
    'click .to-remove': function (e, value, row, index) {
        remove('/order/remove/' + row.id, 'data-list', '/order/pager-cond');
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
        
orderNo: {
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
total: {
	validators: {
		notEmpty: {
			message: '订单总额是必须项'
		}
	}
},
type: {
	validators: {
	}
},
sellId: {
	validators: {
	}
},
buyId: {
	validators: {
	}
}  ,
status: {
	validators: {
	}
},
sellConfirmTime: {
	validators: {
	}
},
buyConfirmTime: {
	validators: {
	}
},
dealTime: {
	validators: {
	}
}
    };
}
