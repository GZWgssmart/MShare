function orderSearchTable() {
    destroyTable('order-data-list');
    $('#order-data-list').bootstrapTable({
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
    $.each($('#order-search-form').serializeArray(), function(index, field){
        query[field.name] = field.value;
    });
    return query;
}

function orderSearchModal(modalId, url) {
    let modal = $('#' + modalId);
    modal.on('shown.bs.modal', function (e) {
        orderSearchTable;
        initDatetime();
    });
    modal.modal({
        remote: url
    });
}
