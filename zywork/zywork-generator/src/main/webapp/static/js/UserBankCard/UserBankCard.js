$(function () {
    loadTable();
    initICheck('green');
    initDatetime();
});

function loadTable() {
    destroyTable('data-list');
    $('#data-list').bootstrapTable({
        url: contextPath + '/user-bankcard/pager-cond',
        dataType: 'json',
        method: 'post',
        contentType: "application/x-www-form-urlencoded",
        idField: 'bankCardId',
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
	field: 'bankCardId',
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
	title: '银行',
	field: 'bankCardBankName',
	align: 'center',
	sortable: true
},
{
	title: '银行卡号',
	field: 'bankCardCardNo',
	align: 'center',
	sortable: true
},
{
	title: '真实姓名',
	field: 'bankCardRealName',
	align: 'center',
	sortable: true
},
{
	title: '手机号',
	field: 'bankCardPhone',
	align: 'center',
	sortable: true
},
{
	title: '用户编号',
	field: 'bankCardUserId',
	align: 'center',
	sortable: true
},
{
	title: '创建时间',
	field: 'bankCardCreateTime',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '更新时间',
	field: 'bankCardUpdateTime',
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
    if (row.bankCardIsActive === 0) {
        strArray.push('<li><a href="javascript:void(0)" class="to-inactive"><i class="fa fa-minus-square-o text-danger"></i><span class="text-danger">&nbsp;冻结</span></a></li>');
    } else {
        strArray.push('<li><a href="javascript:void(0)" class="to-active"><i class="fa fa-check-square-o text-success"></i><span class="text-success">&nbsp;激活</span></a></li>');
    }
    strArray.push('<li><a href="javascript:void(0)" class="to-remove"><i class="fa fa-remove text-danger"></i><span class="text-danger">&nbsp;删除</span></a></li>');
    strArray.push('</ul>');
    strArray.push('</div>');
    return strArray.join('');
}

let fieldTitles = {'bankCardId':'编号','bankCardBankName':'银行','bankCardCardNo':'银行卡号','bankCardRealName':'真实姓名','bankCardPhone':'手机号','bankCardUserId':'用户编号','bankCardCreateTime-date':'创建时间','bankCardUpdateTime-date':'更新时间','userId':'编号','userPhone':'手机号','userNickname':'昵称'};

window.operateEvents = {
    'click .to-detail': function (e, value, row, index) {
        showRemoteDetailModal('detail-modal', '/user-bankcard/detail-modal', row, fieldTitles);
    },
    'click .to-edit': function (e, value, row, index) {
        showRemoteEditModal('edit-modal', '/user-bankcard/edit-modal', 'edit-form', row, validateFields());
    },
    'click .to-inactive': function (e, value, row, index) {
        active('/user-bankcard/active', row.bankCardId, 1, 'data-list', '/user-bankcard/pager-cond');
    },
    'click .to-active': function (e, value, row, index) {
        active('/user-bankcard/active', row.bankCardId, 0, 'data-list', '/user-bankcard/pager-cond');
    },
    'click .to-remove': function (e, value, row, index) {
        remove('/user-bankcard/remove/' + row.bankCardId, 'data-list', '/user-bankcard/pager-cond');
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
        
bankCardBankName: {
	validators: {
		notEmpty: {
			message: '银行是必须项'
		},
		stringLength: {
			min: 1,
			max: 45,
			message: '必须是1-45个字符'
		}
	}
},
bankCardCardNo: {
	validators: {
		notEmpty: {
			message: '银行卡号是必须项'
		},
		stringLength: {
			min: 1,
			max: 45,
			message: '必须是1-45个字符'
		}
	}
},
bankCardRealName: {
	validators: {
		notEmpty: {
			message: '真实姓名是必须项'
		},
		stringLength: {
			min: 1,
			max: 45,
			message: '必须是1-45个字符'
		}
	}
},
bankCardPhone: {
	validators: {
		notEmpty: {
			message: '手机号是必须项'
		},
		stringLength: {
			min: 1,
			max: 11,
			message: '必须是1-11个字符'
		}
	}
},
bankCardUserId: {
	validators: {
	}
}  ,
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
}
    };
}
