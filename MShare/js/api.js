// const BASE_URL = 'http://192.168.2.115:8080';
const BASE_URL = 'http://123.1.189.98:8080/mshare';

const DOMAIN_BASE_URL = 'http://www.cstpayshare.com';

const USER_LOGIN = BASE_URL +'/user/login';

const USER_CHECK_LOGIN = BASE_URL +'/user/check_login';

const USER_LOGOUT = BASE_URL +'/user/logout';

const USER_REGISTER = BASE_URL + '/user/save';

const USER_INFO = BASE_URL + '/user/one';

const USER_HEADICON_UPDATE = BASE_URL + '/user/update-icon';

const USER_NICKNAME_UPDATE = BASE_URL + '/user/update-user';

const USER_LOGIN_PASSWORD_UPDATE = BASE_URL + '/user/update-pwd';

const USER_PAY_PASSWORD_UPDATE = BASE_URL + '/user/update-paypwd';

const USER_BIND_BANK_CARD = BASE_URL + '/user-bankcard/save';

const USER_BANK_CARD_LIST = BASE_URL + '/user-bankcard/pager-cond';

const USER_BANK_CARD_REMOVE = BASE_URL + '/user-bankcard/remove';

const USER_PAY_PASSWORD_CHECK = BASE_URL + '/user/paypwd';

const USER_REGISTER_PAGE = DOMAIN_BASE_URL + '/reg';

const USER_TRANS_OUT = BASE_URL + '/trans/save';

const USER_TRANS_IN_HISTORY = BASE_URL + '/user-transin/pager-cond';

const USER_TRANS_OUT_HISTORY = BASE_URL + '/user-transout/pager-cond';

const USER_ORDER_CREATE = BASE_URL + '/order/save';

const USER_ORDER_UPDATE = BASE_URL + '/order/update'

const USER_ORDER_SELL_LIST = BASE_URL + '/sell-order/pager-cond';

const USER_ORDER_SELL_LIST_OTHER = BASE_URL + '/sell-order/pager-cond-other';

const USER_ORDER_BUY_LIST = BASE_URL + '/buy-order/pager-cond';
/**
const ORDER_NOT_SELL = 0;

const ORDER_NOT_SELL_WAIT_BUY_CONFIRM = 1;

const ORDER_ALREADY_SELL = 2;

const ORDER_CANCEL_SELL = 3;

const ORDER_NOT_BUY = 4;

const ORDER_NOT_BUY_WAIT_SELL_CONFIRM = 5;

const ORDER_ALREADY_BUY = 6;

const ORDER_CANCEL_BUY = 7;
*/

const ORDER_NOT_SELL = 2;

const ORDER_ALREADY_SELL = 1;

const ORDER_CANCEL_SELL = 0;

const ORDER_WAIT_SELL_CONFIRM = 3;

const APP_DOWNLOAD_URL = DOMAIN_BASE_URL + '/download';

const USER_SUGGEST_ADD = BASE_URL + '/suggest/save';

const USER_BONUS_HISTORY = BASE_URL + '/user-bonus/pager-cond';

const USER_SMS_CODE = BASE_URL + '/sms/send';

const USER_SMS_PWD = BASE_URL + '/sms/pwd';

const USER_SMS_NEW_PWD = BASE_URL + '/sms/new-pwd';

const USER_TOTAL_TO_SCORE = BASE_URL + '/user/update-total-score';

const USER_TOTAL_TO_SCORE_HISTORY = BASE_URL + '/user-total-score/pager-cond';
