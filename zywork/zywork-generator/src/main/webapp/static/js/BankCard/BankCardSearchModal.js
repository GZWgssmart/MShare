function bankCardSearchTable() {
    destroyTable('bank-card-data-list');
    $('#bank-card-data-list').bootstrapTable({
        url: contextPath + '/bank-card/pager-cond',
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
        singleSelect: false,
        maintainSelected: true,
        striped: true,
        search: false,
        showColumns: true,
        showRefresh: true,
        showToggle: true,
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
	title: '银行',
	field: 'bankName',
	align: 'center',
	sortable: true
},
{
	title: '银行卡号',
	field: 'cardNo',
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
	title: '手机号',
	field: 'phone',
	align: 'center',
	sortable: true
},
{
	title: '用户编号',
	field: 'userId',
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
}
                 ]
    });
}

function queryParams(params) {
    let query = {
        limit:params.limit,
        offset:params.offset,
        sortOrder: params.order
    };
    $.each($('#bank-card-search-form').serializeArray(), function(index, field){
        query[field.name] = field.value;
    });
    return query;
}

function bankCardSearchModal(modalId, url) {
    let modal = $('#' + modalId);
    modal.on('shown.bs.modal', function (e) {
        bankCardSearchTable;
        initDatetime();
    });
    modal.modal({
        remote: url
    });
}
