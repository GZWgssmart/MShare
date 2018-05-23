function timestampToDatetime(value) {
    if (value === undefined || value === null || value === '') {
        return '-';
    } else {
        var currDate = new Date(value);
        var year = currDate.getFullYear();
        var month = currDate.getMonth() + 1;
        var day = currDate.getDate();
        var hour = currDate.getHours();
        var minute = currDate.getMinutes();
        var second = currDate.getSeconds();
        month = month < 10 ? '0' + month : month;
        day = day < 10 ? '0' + day : day;
        hour = hour < 10 ? '0' + hour : hour;
        minute = minute < 10 ? '0' + minute : minute;
        second = second < 10 ? '0' + second : second;
        return year + '-' + month + '-' + day + ' ' + hour + ':' + minute + ':' + second;
    }
}