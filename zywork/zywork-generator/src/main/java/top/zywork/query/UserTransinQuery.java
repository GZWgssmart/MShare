package top.zywork.query;

import java.util.Date;

/**
 * UserTransinQuery查询对象类<br/>
 *
 * 创建于2018-05-09<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserTransinQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035156574290L;

    //t_trans表的字段对应的属性
	/**
	 * 编号
	 */
	private Long transId;
	/**
	 * 转出人编号
	 */
	private Long transTransFrom;
	/**
	 * 转入人编号
	 */
	private Long transTransTo;
	/**
	 * 金额
	 */
	private Long transTotal;
	/**
	 * 转入时间
	 */
	private Date transTransTime;
	/**
	 * 转入时间(开始)
	 */
	private Date transTransTimeStart;
	/**
	 * 转入时间(结束)
	 */
	private Date transTransTimeEnd;
	/**
	 * 创建时间
	 */
	private Date transCreateTime;
	/**
	 * 创建时间(开始)
	 */
	private Date transCreateTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date transCreateTimeEnd;
	/**
	 * 更新时间
	 */
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
	
    public UserTransinQuery () {}

    public UserTransinQuery (Long transId, Long transTransFrom, Long transTransTo, Long transTotal, Date transTransTime, Date transTransTimeStart, Date transTransTimeEnd, Date transCreateTime, Date transCreateTimeStart, Date transCreateTimeEnd, String transUpdateTime, Long userId, String userPhone, String userNickname, String userHeadicon) {
        this.transId = transId;
		this.transTransFrom = transTransFrom;
		this.transTransTo = transTransTo;
		this.transTotal = transTotal;
		this.transTransTime = transTransTime;
		this.transTransTimeStart = transTransTimeStart;
		this.transTransTimeEnd = transTransTimeEnd;
		this.transCreateTime = transCreateTime;
		this.transCreateTimeStart = transCreateTimeStart;
		this.transCreateTimeEnd = transCreateTimeEnd;
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

	public Date getTransTransTimeStart() {
		return transTransTimeStart;
	}

	public void setTransTransTimeStart(Date transTransTimeStart) {
		this.transTransTimeStart = transTransTimeStart;
	}

	public Date getTransTransTimeEnd() {
		return transTransTimeEnd;
	}

	public void setTransTransTimeEnd(Date transTransTimeEnd) {
		this.transTransTimeEnd = transTransTimeEnd;
	}

	public Date getTransCreateTime() {
		return transCreateTime;
	}

	public void setTransCreateTime(Date transCreateTime) {
		this.transCreateTime = transCreateTime;
	}

	public Date getTransCreateTimeStart() {
		return transCreateTimeStart;
	}

	public void setTransCreateTimeStart(Date transCreateTimeStart) {
		this.transCreateTimeStart = transCreateTimeStart;
	}

	public Date getTransCreateTimeEnd() {
		return transCreateTimeEnd;
	}

	public void setTransCreateTimeEnd(Date transCreateTimeEnd) {
		this.transCreateTimeEnd = transCreateTimeEnd;
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

	
    @Override
    public String toString() {
        return "UserTransinDO{" +
                "}";
    }

}
