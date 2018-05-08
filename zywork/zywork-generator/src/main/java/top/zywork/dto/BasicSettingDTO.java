package top.zywork.dto;

import java.util.Date;

/**
 * BasicSettingDTO数据传输对象类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BasicSettingDTO extends BaseDTO {

    private static final long serialVersionUID = -9223372035157363586L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 手续费比例
	 */
	private Double feePercent;
	/**
	 * 金额转换比例
	 */
	private Double moneyPercent;
	/**
	 * 积分转换比例
	 */
	private Double scorePercent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
    public BasicSettingDTO () {}

    public BasicSettingDTO (Long id, Double feePercent, Double moneyPercent, Double scorePercent, Date createTime, Date updateTime) {
        this.id = id;
		this.feePercent = feePercent;
		this.moneyPercent = moneyPercent;
		this.scorePercent = scorePercent;
		this.createTime = createTime;
		this.updateTime = updateTime;
		
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getFeePercent() {
		return feePercent;
	}

	public void setFeePercent(Double feePercent) {
		this.feePercent = feePercent;
	}

	public Double getMoneyPercent() {
		return moneyPercent;
	}

	public void setMoneyPercent(Double moneyPercent) {
		this.moneyPercent = moneyPercent;
	}

	public Double getScorePercent() {
		return scorePercent;
	}

	public void setScorePercent(Double scorePercent) {
		this.scorePercent = scorePercent;
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
        return "BasicSettingDO{" +
                "id = " + id + 
				", feePercent = " + feePercent + 
				", moneyPercent = " + moneyPercent + 
				", scorePercent = " + scorePercent + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}