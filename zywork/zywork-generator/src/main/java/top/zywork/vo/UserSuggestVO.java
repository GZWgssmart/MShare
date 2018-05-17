package top.zywork.vo;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * UserSuggestVO值对象类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserSuggestVO extends BaseVO {

    private static final long serialVersionUID = -9223372035573640204L;

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
	@Size(min = 0, max = 500, message = "必须小于500个字符")
	private String suggestSuggest;
	/**
	 * 创建时间
	 */
	private Date suggestCreateTime;
	/**
	 * 更新时间
	 */
	private Date suggestUpdateTime;
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
	
    public UserSuggestVO () {}

    public UserSuggestVO (Long suggestId, Long suggestUserId, String suggestSuggest, Date suggestCreateTime, Date suggestUpdateTime, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.suggestId = suggestId;
		this.suggestUserId = suggestUserId;
		this.suggestSuggest = suggestSuggest;
		this.suggestCreateTime = suggestCreateTime;
		this.suggestUpdateTime = suggestUpdateTime;
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

	public Date getSuggestUpdateTime() {
		return suggestUpdateTime;
	}

	public void setSuggestUpdateTime(Date suggestUpdateTime) {
		this.suggestUpdateTime = suggestUpdateTime;
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
                "suggestId = " + suggestId + 
				", suggestUserId = " + suggestUserId + 
				", suggestSuggest = " + suggestSuggest + 
				", suggestCreateTime = " + suggestCreateTime + 
				", suggestUpdateTime = " + suggestUpdateTime + 
				", userId = " + userId + 
				", userPhone = " + userPhone + 
				", userNickname = " + userNickname + 
				", userHeadicon = " + userHeadicon + 
				"}";
    }

}
