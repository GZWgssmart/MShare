function basicSettingSearchTable() {
    destroyTable('basic-setting-data-list');
    $('#basic-setting-data-list').bootstrapTable({
        url: contextPath + '/basic-setting/pager-cond',
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
	title: '手续费比例',
	field: 'feePercent',
	align: 'center',
	sortable: true
},
{
	title: '金额转换比例',
	field: 'moneyPercent',
	align: 'center',
	sortable: true
},
{
	title: '积分转换比例',
	field: 'scorePercent',
	align: 'center',
	sortable: true
},
{
	title: '轮播图1',
	field: 'sliderImg1',
	align: 'center',
	sortable: true
},
{
	title: '轮播图2',
	field: 'sliderImg2',
	align: 'center',
	sortable: true
},
{
	title: '轮播图3',
	field: 'sliderImg3',
	align: 'center',
	sortable: true
},
{
	title: '轮播图4',
	field: 'sliderImg4',
	align: 'center',
	sortable: true
},
{
	title: '轮播图5',
	field: 'sliderImg5',
	align: 'center',
	sortable: true
},
{
	title: '注册资产奖励',
	field: 'regBonus',
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
    $.each($('#basic-setting-search-form').serializeArray(), function(index, field){
        query[field.name] = field.value;
    });
    return query;
}

function basicSettingSearchModal(modalId, url) {
    let modal = $('#' + modalId);
    modal.on('shown.bs.modal', function (e) {
        basicSettingSearchTable;
        initDatetime();
    });
    modal.modal({
        remote: url
    });
}
