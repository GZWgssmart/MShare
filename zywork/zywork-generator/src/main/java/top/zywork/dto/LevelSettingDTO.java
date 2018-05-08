package top.zywork.dto;

import java.util.Date;

/**
 * LevelSettingDTO数据传输对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class LevelSettingDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372035034419945L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 等级名称
	 */
	private String name;
	/**
	 * 最小金额
	 */
	private Long minMoney;
	/**
	 * 最大金额
	 */
	private Long maxMoney;
	/**
	 * 转换比例
	 */
	private Double transPercent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
    public LevelSettingDTO () {}

    public LevelSettingDTO (Long id, String name, Long minMoney, Long maxMoney, Double transPercent, Date createTime, Date updateTime) {
        this.id = id;
		this.name = name;
		this.minMoney = minMoney;
		this.maxMoney = maxMoney;
		this.transPercent = transPercent;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMinMoney() {
		return minMoney;
	}

	public void setMinMoney(Long minMoney) {
		this.minMoney = minMoney;
	}

	public Long getMaxMoney() {
		return maxMoney;
	}

	public void setMaxMoney(Long maxMoney) {
		this.maxMoney = maxMoney;
	}

	public Double getTransPercent() {
		return transPercent;
	}

	public void setTransPercent(Double transPercent) {
		this.transPercent = transPercent;
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
        return "LevelSettingDO{" +
                "id = " + id + 
				", name = " + name + 
				", minMoney = " + minMoney + 
				", maxMoney = " + maxMoney + 
				", transPercent = " + transPercent + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
