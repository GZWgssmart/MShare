package top.zywork.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * UserTransinVO值对象类<br/>
 *
 * 创建于2018-05-09<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserTransinVO extends BaseVO {

    private static final long serialVersionUID = -9223372036813020248L;

    //t_trans表的字段对应的属性
	/**
	 * 编号
	 */
	private Long transId;
	/**
	 * 转出人编号
	 */
	@NotNull(message = "此项是必须项")
	private Long transTransFrom;
	/**
	 * 转入人编号
	 */
	@NotNull(message = "此项是必须项")
	private Long transTransTo;
	/**
	 * 金额
	 */
	@NotNull(message = "此项是必须项")
	private Long transTotal;
	/**
	 * 转入时间
	 */
	private Date transTransTime;
	/**
	 * 创建时间
	 */
	private Date transCreateTime;
	/**
	 * 更新时间
	 */
	@Size(min = 0, max = 45, message = "必须小于45个字符")
	private String transUpdateTime;
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

	private String fromNickname;
	private String fromPhone;
	private String fromHeadicon;
	
    public UserTransinVO () {}

    public UserTransinVO (Long transId, Long transTransFrom, Long transTransTo, Long transTotal, Date transTransTime, Date transCreateTime, String transUpdateTime, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.transId = transId;
		this.transTransFrom = transTransFrom;
		this.transTransTo = transTransTo;
		this.transTotal = transTotal;
		this.transTransTime = transTransTime;
		this.transCreateTime = transCreateTime;
		this.transUpdateTime = transUpdateTime;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userNickname = userNickname;
		this.userHeadicon = userHeadicon;
		
    }

    public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public Long getTransTransFrom() {
		return transTransFrom;
	}

	public void setTransTransFrom(Long transTransFrom) {
		this.transTransFrom = transTransFrom;
	}

	public Long getTransTransTo() {
		return transTransTo;
	}

	public void setTransTransTo(Long transTransTo) {
		this.transTransTo = transTransTo;
	}

	public Long getTransTotal() {
		return transTotal;
	}

	public void setTransTotal(Long transTotal) {
		this.transTotal = transTotal;
	}

	public Date getTransTransTime() {
		return transTransTime;
	}

	public void setTransTransTime(Date transTransTime) {
		this.transTransTime = transTransTime;
	}

	public Date getTransCreateTime() {
		return transCreateTime;
	}

	public void setTransCreateTime(Date transCreateTime) {
		this.transCreateTime = transCreateTime;
	}

	public String getTransUpdateTime() {
		return transUpdateTime;
	}

	public void setTransUpdateTime(String transUpdateTime) {
		this.transUpdateTime = transUpdateTime;
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

	public String getFromNickname() {
		return fromNickname;
	}

	public void setFromNickname(String fromNickname) {
		this.fromNickname = fromNickname;
	}

	public void setFromPhone(String fromPhone) {
		this.fromPhone = fromPhone;
	}

	public String getFromPhone() {
		return fromPhone;
	}

	public String getFromHeadicon() {
		return fromHeadicon;
	}

	public void setFromHeadicon(String fromHeadicon) {
		this.fromHeadicon = fromHeadicon;
	}

	@Override
    public String toString() {
        return "UserTransinDO{" +
                "transId = " + transId + 
				", transTransFrom = " + transTransFrom + 
				", transTransTo = " + transTransTo + 
				", transTotal = " + transTotal + 
				", transTransTime = " + transTransTime + 
				", transCreateTime = " + transCreateTime + 
				", transUpdateTime = " + transUpdateTime + 
				", userId = " + userId + 
				", userPhone = " + userPhone + 
				", userNickname = " + userNickname + 
				", userHeadicon = " + userHeadicon + 
				"}";
    }

}
