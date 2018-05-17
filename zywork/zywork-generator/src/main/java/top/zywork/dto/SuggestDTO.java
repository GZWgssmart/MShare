package top.zywork.dto;

import java.util.Date;

/**
 * SuggestDTO数据传输对象类<br/>
 *
 * 创建于2018-05-17<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class SuggestDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372036635634954L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 用户编号
	 */
	private Long userId;
	/**
	 * 投诉建议
	 */
	private String suggest;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
    public SuggestDTO () {}

    public SuggestDTO (Long id, Long userId, String suggest, Date createTime, Date updateTime) {
        this.id = id;
		this.userId = userId;
		this.suggest = suggest;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSuggest() {
		return suggest;
	}

	public void setSuggest(String suggest) {
		this.suggest = suggest;
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

	
    @Override
    public String toString() {
        return "SuggestDO{" +
                "id = " + id + 
				", userId = " + userId + 
				", suggest = " + suggest + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}