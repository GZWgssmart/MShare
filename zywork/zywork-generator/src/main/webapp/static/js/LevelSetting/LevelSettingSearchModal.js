function levelSettingSearchTable() {
    destroyTable('level-setting-data-list');
    $('#level-setting-data-list').bootstrapTable({
        url: contextPath + '/level-setting/pager-cond',
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
	title: '等级名称',
	field: 'name',
	align: 'center',
	sortable: true
},
{
	title: '最小金额',
	field: 'minMoney',
	align: 'center',
	sortable: true
},
{
	title: '最大金额',
	field: 'maxMoney',
	align: 'center',
	sortable: true
},
{
	title: '转换比例',
	field: 'transPercent',
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
    $.each($('#level-setting-search-form').serializeArray(), function(index, field){
        query[field.name] = field.value;
    });
    return query;
}

function levelSettingSearchModal(modalId, url) {
    let modal = $('#' + modalId);
    modal.on('shown.bs.modal', function (e) {
        levelSettingSearchTable;
        initDatetime();
    });
    modal.modal({
        remote: url
    });
}
