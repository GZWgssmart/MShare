function timestampToDatetime(value) {
    if (value === undefined || value === null || value === '') {
        return '-';
    } else {
        let currDate = new Date(value);
        let year = currDate.getFullYear();
        let month = currDate.getMonth() + 1;
        let day = currDate.getDate();
        let hour = currDate.getHours();
        let minute = currDate.getMinutes();
        let second = currDate.getSeconds();
        month = month < 10 ? '0' + month : month;
        day = day < 10 ? '0' + day : day;
        hour = hour < 10 ? '0' + hour : hour;
        minute = minute < 10 ? '0' + minute : minute;
        second = second < 10 ? '0' + second : second;
        return year + '-' + month + '-' + day + ' ' + hour + ':' + minute + ':' + second;
    }
}