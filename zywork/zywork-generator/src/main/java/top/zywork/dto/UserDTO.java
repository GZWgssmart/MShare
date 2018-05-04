package top.zywork.dto;

import java.util.Date;

/**
 * UserDTO数据传输对象类<br/>
 *
 * 创建于2018-05-03<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372035981096331L;

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
	 * 密码
	 */
	private String password;
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
	 * QQ号
	 */
	private String qq;
	/**
	 * 微信号
	 */
	private String wechat;
	/**
	 * 支付宝账号
	 */
	private String alipay;
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

    public UserDTO (Long id, String email, String phone, String accountName, String password, String salt, String nickname, String headicon, String identity, String realName, Byte gender, Date birthday, Integer age, String qq, String wechat, String alipay, Date createTime, Date updateTime, Byte isActive) {
        this.id = id;
		this.email = email;
		this.phone = phone;
		this.accountName = accountName;
		this.password = password;
		this.salt = salt;
		this.nickname = nickname;
		this.headicon = headicon;
		this.identity = identity;
		this.realName = realName;
		this.gender = gender;
		this.birthday = birthday;
		this.age = age;
		this.qq = qq;
		this.wechat = wechat;
		this.alipay = alipay;
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

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getAlipay() {
		return alipay;
	}

	public void setAlipay(String alipay) {
		this.alipay = alipay;
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
				", salt = " + salt + 
				", nickname = " + nickname + 
				", headicon = " + headicon + 
				", identity = " + identity + 
				", realName = " + realName + 
				", gender = " + gender + 
				", birthday = " + birthday + 
				", age = " + age + 
				", qq = " + qq + 
				", wechat = " + wechat + 
				", alipay = " + alipay + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				", isActive = " + isActive + 
				"}";
    }

}
