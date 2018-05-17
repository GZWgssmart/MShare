package top.zywork.query;

import java.util.Date;

/**
 * UserSuggestQuery查询对象类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserSuggestQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372036458318612L;

    //t_suggest表的字段对应的属性
	/**
	 * 编号
	 */
	private Long suggestId;
	/**
	 * 用户编号
	 */
	private Long suggestUserId;
	/**
	 * 投诉建议
	 */
	private String suggestSuggest;
	/**
	 * 创建时间
	 */
	private Date suggestCreateTime;
	/**
	 * 创建时间(开始)
	 */
	private Date suggestCreateTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date suggestCreateTimeEnd;
	/**
	 * 更新时间
	 */
	private Date suggestUpdateTime;
	/**
	 * 更新时间(开始)
	 */
	private Date suggestUpdateTimeStart;
	/**
	 * 更新时间(结束)
	 */
	private Date suggestUpdateTimeEnd;
	//t_user表的字段对应的属性
	/**
	 * 编号
	 */
	private Long userId;
	/**
	 * 手机号
	 */
	private String userPhone;
	/**
	 * 昵称
	 */
	private String userNickname;
	/**
	 * 头像地址
	 */
	private String userHeadicon;
	
    public UserSuggestQuery () {}

    public UserSuggestQuery (Long suggestId, Long suggestUserId, String suggestSuggest, Date suggestCreateTime, Date suggestCreateTimeStart, Date suggestCreateTimeEnd, Date suggestUpdateTime, Date suggestUpdateTimeStart, Date suggestUpdateTimeEnd, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.suggestId = suggestId;
		this.suggestUserId = suggestUserId;
		this.suggestSuggest = suggestSuggest;
		this.suggestCreateTime = suggestCreateTime;
		this.suggestCreateTimeStart = suggestCreateTimeStart;
		this.suggestCreateTimeEnd = suggestCreateTimeEnd;
		this.suggestUpdateTime = suggestUpdateTime;
		this.suggestUpdateTimeStart = suggestUpdateTimeStart;
		this.suggestUpdateTimeEnd = suggestUpdateTimeEnd;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		this.userHeadicon = userHeadicon;
		
    }

    public Long getSuggestId() {
		return suggestId;
	}

	public void setSuggestId(Long suggestId) {
		this.suggestId = suggestId;
	}

	public Long getSuggestUserId() {
		return suggestUserId;
	}

	public void setSuggestUserId(Long suggestUserId) {
		this.suggestUserId = suggestUserId;
	}

	public String getSuggestSuggest() {
		return suggestSuggest;
	}

	public void setSuggestSuggest(String suggestSuggest) {
		this.suggestSuggest = suggestSuggest;
	}

	public Date getSuggestCreateTime() {
		return suggestCreateTime;
	}

	public void setSuggestCreateTime(Date suggestCreateTime) {
		this.suggestCreateTime = suggestCreateTime;
	}

	public Date getSuggestCreateTimeStart() {
		return suggestCreateTimeStart;
	}

	public void setSuggestCreateTimeStart(Date suggestCreateTimeStart) {
		this.suggestCreateTimeStart = suggestCreateTimeStart;
	}

	public Date getSuggestCreateTimeEnd() {
		return suggestCreateTimeEnd;
	}

	public void setSuggestCreateTimeEnd(Date suggestCreateTimeEnd) {
		this.suggestCreateTimeEnd = suggestCreateTimeEnd;
	}

	public Date getSuggestUpdateTime() {
		return suggestUpdateTime;
	}

	public void setSuggestUpdateTime(Date suggestUpdateTime) {
		this.suggestUpdateTime = suggestUpdateTime;
	}

	public Date getSuggestUpdateTimeStart() {
		return suggestUpdateTimeStart;
	}

	public void setSuggestUpdateTimeStart(Date suggestUpdateTimeStart) {
		this.suggestUpdateTimeStart = suggestUpdateTimeStart;
	}

	public Date getSuggestUpdateTimeEnd() {
		return suggestUpdateTimeEnd;
	}

	public void setSuggestUpdateTimeEnd(Date suggestUpdateTimeEnd) {
		this.suggestUpdateTimeEnd = suggestUpdateTimeEnd;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserHeadicon() {
		return userHeadicon;
	}

	public void setUserHeadicon(String userHeadicon) {
		this.userHeadicon = userHeadicon;
	}

	
    @Override
    public String toString() {
        return "UserSuggestDO{" +
                "}";
    }

}
