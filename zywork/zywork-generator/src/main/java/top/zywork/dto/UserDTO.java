package top.zywork.dto;

import java.util.Date;

/**
 * UserDTO数据传输对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372034938464498L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 账户名
	 */
	private String accountName;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 支付密码
	 */
	private String payPassword;
	/**
	 * 加密盐值
	 */
	private String salt;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 头像地址
	 */
	private String headicon;
	/**
	 * 余额
	 */
	private Long total;
	/**
	 * 积分
	 */
	private Long score;
	private Double props;
	/**
	 * 信用等级
	 */
	private String level;
	/**
	 * 身份证号
	 */
	private String identity;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 性别
	 */
	private Byte gender;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 推荐人编号
	 */
	private Long fromId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 是否激活
	 */
	private Byte isActive;
	
    public UserDTO () {}

    public UserDTO (Long id, String email, String phone, String accountName, String password, String payPassword, String salt, String nickname, String headicon, Long total, Long score, Double props, String level, String identity, String realName, Byte gender, Date birthday, Integer age, Long fromId, Date createTime, Date updateTime, Byte isActive) {
        this.id = id;
		this.email = email;
		this.phone = phone;
		this.accountName = accountName;
		this.password = password;
		this.payPassword = payPassword;
		this.salt = salt;
		this.nickname = nickname;
		this.headicon = headicon;
		this.total = total;
		this.score = score;
		this.props = props;
		this.level = level;
		this.identity = identity;
		this.realName = realName;
		this.gender = gender;
		this.birthday = birthday;
		this.age = age;
		this.fromId = fromId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isActive = isActive;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadicon() {
		return headicon;
	}

	public void setHeadicon(String headicon) {
		this.headicon = headicon;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Double getProps() {
		return props;
	}

	public void setProps(Double props) {
		this.props = props;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public Long getFromId() {
		return fromId;
	}

	public void setFromId(Long fromId) {
		this.fromId = fromId;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Byte getIsActive() {
		return isActive;
	}

	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	
    @Override
    public String toString() {
        return "UserDO{" +
                "id = " + id + 
				", email = " + email + 
				", phone = " + phone + 
				", accountName = " + accountName + 
				", password = " + password + 
				", payPassword = " + payPassword + 
				", salt = " + salt + 
				", nickname = " + nickname + 
				", headicon = " + headicon + 
				", total = " + total + 
				", score = " + score + 
				", level = " + level + 
				", identity = " + identity + 
				", realName = " + realName + 
				", gender = " + gender + 
				", birthday = " + birthday + 
				", age = " + age + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				", isActive = " + isActive + 
				"}";
    }

}
