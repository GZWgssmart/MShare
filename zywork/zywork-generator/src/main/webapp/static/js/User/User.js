$(function () {
    loadTable();
    initICheck('green');
    initDatetime();
});

function loadTable() {
    destroyTable('data-list');
    $('#data-list').bootstrapTable({
        url: contextPath + '/user/pager-cond',
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
	title: '邮箱',
	field: 'email',
	align: 'center',
	sortable: true
},
{
	title: '手机号',
	field: 'phone',
	align: 'center',
	sortable: true
},
{
	title: '账户名',
	field: 'accountName',
	align: 'center',
	sortable: true
},
{
	title: '登录密码',
	field: 'password',
	align: 'center',
	sortable: true
},
{
	title: '支付密码',
	field: 'payPassword',
	align: 'center',
	sortable: true
},
{
	title: '加密盐值',
	field: 'salt',
	align: 'center',
	sortable: true
},
{
	title: '昵称',
	field: 'nickname',
	align: 'center',
	sortable: true
},
{
	title: '头像地址',
	field: 'headicon',
	align: 'center',
	sortable: true
},
{
	title: '余额',
	field: 'total',
	align: 'center',
	sortable: true
},
{
	title: '积分',
	field: 'score',
	align: 'center',
	sortable: true
},
            {
                title: '资产',
                field: 'props',
                align: 'center',
                sortable: true
            },
{
	title: '信用等级',
	field: 'level',
	align: 'center',
	sortable: true
},
{
	title: '身份证号',
	field: 'identity',
	align: 'center',
	sortable: true
},
{
	title: '真实姓名',
	field: 'realName',
	align: 'center',
	sortable: true
},
{
	title: '性别',
	field: 'gender',
	align: 'center',
	sortable: true
},
{
	title: '生日',
	field: 'birthday',
	align: 'center',
	sortable: true,
	formatter: formatDate
},
{
	title: '年龄',
	field: 'age',
	align: 'center',
	sortable: true
},
            {
                title: '推荐人编号',
                field: 'fromId',
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
	title: '是否激活',
	field: 'isActive',
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

let fieldTitles = {'id':'编号','email':'邮箱','phone':'手机号','accountName':'账户名','password':'登录密码','payPassword':'支付密码','salt':'加密盐值','nickname':'昵称','headicon':'头像地址','total':'余额','score':'积分','props':'资产','level':'信用等级','identity':'身份证号','realName':'真实姓名','gender':'性别','birthday-date':'生日','age':'年龄','fromId':'推荐人编号','createTime-date':'创建时间','updateTime-date':'更新时间','isActive':'是否激活'};

window.operateEvents = {
    'click .to-detail': function (e, value, row, index) {
        showRemoteDetailModal('detail-modal', '/user/detail-modal', row, fieldTitles);
    },
    'click .to-edit': function (e, value, row, index) {
        showRemoteEditModal('edit-modal', '/user/edit-modal', 'edit-form', row, validateFields());
    },
    'click .to-inactive': function (e, value, row, index) {
        active('/user/active', row.id, 1, 'data-list', '/user/pager-cond');
    },
    'click .to-active': function (e, value, row, index) {
        active('/user/active', row.id, 0, 'data-list', '/user/pager-cond');
    },
    'click .to-remove': function (e, value, row, index) {
        remove('/user/remove/' + row.id, 'data-list', '/user/pager-cond');
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
        
email: {
	validators: {

		stringLength: {
			min: 0,
			max: 100,
			message: '必须小于100个字符'
		}
	}
},
phone: {
	validators: {

		stringLength: {
			min: 0,
			max: 11,
			message: '必须小于11个字符'
		}
	}
},
accountName: {
	validators: {

		stringLength: {
			min: 0,
			max: 20,
			message: '必须小于20个字符'
		}
	}
},
password: {
	validators: {
		notEmpty: {
			message: '登录密码是必须项'
		},
		stringLength: {
			min: 1,
			max: 50,
			message: '必须是1-50个字符'
		}
	}
},
payPassword: {
	validators: {

		stringLength: {
			min: 0,
			max: 50,
			message: '必须小于50个字符'
		}
	}
},
salt: {
	validators: {

		stringLength: {
			min: 0,
			max: 200,
			message: '必须小于200个字符'
		}
	}
},
nickname: {
	validators: {

		stringLength: {
			min: 0,
			max: 20,
			message: '必须小于20个字符'
		}
	}
},
headicon: {
	validators: {

		stringLength: {
			min: 0,
			max: 500,
			message: '必须小于500个字符'
		}
	}
},
total: {
	validators: {
	}
},
score: {
	validators: {
	}
},
        props: {
            validators: {
            }
        },
level: {
	validators: {

		stringLength: {
			min: 0,
			max: 1,
			message: '必须小于1个字符'
		}
	}
},
identity: {
	validators: {

		stringLength: {
			min: 0,
			max: 18,
			message: '必须小于18个字符'
		}
	}
},
realName: {
	validators: {

		stringLength: {
			min: 0,
			max: 10,
			message: '必须小于10个字符'
		}
	}
},
gender: {
	validators: {
	}
},
birthday: {
	validators: {
	}
},
age: {
	validators: {
	}
}   
    };
}
