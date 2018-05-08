package top.zywork.dos;

import java.util.Date;

/**
 * BasicSettingDO数据对象实体类<br/>
 *
 * 创建于2018-05-08<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BasicSettingDO extends BaseDO {

    private static final long serialVersionUID = -9223372034858640096L;

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
	 * 轮播图1
	 */
	private String sliderImg1;
	/**
	 * 轮播图2
	 */
	private String sliderImg2;
	/**
	 * 轮播图3
	 */
	private String sliderImg3;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	
    public BasicSettingDO() {}

    public BasicSettingDO(Long id, Double feePercent, Double moneyPercent, Double scorePercent, String sliderImg1, String sliderImg2, String sliderImg3, Date createTime, Date updateTime) {
        this.id = id;
		this.feePercent = feePercent;
		this.moneyPercent = moneyPercent;
		this.scorePercent = scorePercent;
		this.sliderImg1 = sliderImg1;
		this.sliderImg2 = sliderImg2;
		this.sliderImg3 = sliderImg3;
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

	public String getSliderImg1() {
		return sliderImg1;
	}

	public void setSliderImg1(String sliderImg1) {
		this.sliderImg1 = sliderImg1;
	}

	public String getSliderImg2() {
		return sliderImg2;
	}

	public void setSliderImg2(String sliderImg2) {
		this.sliderImg2 = sliderImg2;
	}

	public String getSliderImg3() {
		return sliderImg3;
	}

	public void setSliderImg3(String sliderImg3) {
		this.sliderImg3 = sliderImg3;
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
				", sliderImg1 = " + sliderImg1 + 
				", sliderImg2 = " + sliderImg2 + 
				", sliderImg3 = " + sliderImg3 + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
