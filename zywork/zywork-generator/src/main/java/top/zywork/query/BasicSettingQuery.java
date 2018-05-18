package top.zywork.query;

import java.util.Date;

/**
 * BasicSettingQuery查询对象类<br/>
 *
 * 创建于2018-05-18<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BasicSettingQuery extends BaseQuery {

    private static final long serialVersionUID = -9223372035406417352L;

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
	 * 轮播图4
	 */
	private String sliderImg4;
	/**
	 * 轮播图5
	 */
	private String sliderImg5;
	/**
	 * 注册资产奖励
	 */
	private Double regBonus;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建时间(开始)
	 */
	private Date createTimeStart;
	/**
	 * 创建时间(结束)
	 */
	private Date createTimeEnd;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新时间(开始)
	 */
	private Date updateTimeStart;
	/**
	 * 更新时间(结束)
	 */
	private Date updateTimeEnd;
	
    public BasicSettingQuery() {}

    public BasicSettingQuery(Long id, Double feePercent, Double moneyPercent, Double scorePercent, String sliderImg1, String sliderImg2, String sliderImg3, String sliderImg4, String sliderImg5, Double regBonus, Date createTime, Date createTimeStart, Date createTimeEnd, Date updateTime, Date updateTimeStart, Date updateTimeEnd) {
        this.id = id;
		this.feePercent = feePercent;
		this.moneyPercent = moneyPercent;
		this.scorePercent = scorePercent;
		this.sliderImg1 = sliderImg1;
		this.sliderImg2 = sliderImg2;
		this.sliderImg3 = sliderImg3;
		this.sliderImg4 = sliderImg4;
		this.sliderImg5 = sliderImg5;
		this.regBonus = regBonus;
		this.createTime = createTime;
		this.createTimeStart = createTimeStart;
		this.createTimeEnd = createTimeEnd;
		this.updateTime = updateTime;
		this.updateTimeStart = updateTimeStart;
		this.updateTimeEnd = updateTimeEnd;
		
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

	public String getSliderImg4() {
		return sliderImg4;
	}

	public void setSliderImg4(String sliderImg4) {
		this.sliderImg4 = sliderImg4;
	}

	public String getSliderImg5() {
		return sliderImg5;
	}

	public void setSliderImg5(String sliderImg5) {
		this.sliderImg5 = sliderImg5;
	}

	public Double getRegBonus() {
		return regBonus;
	}

	public void setRegBonus(Double regBonus) {
		this.regBonus = regBonus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(Date createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTimeStart() {
		return updateTimeStart;
	}

	public void setUpdateTimeStart(Date updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public Date getUpdateTimeEnd() {
		return updateTimeEnd;
	}

	public void setUpdateTimeEnd(Date updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	
    @Override
    public String toString() {
        return "BasicSettingDO{" +
                "}";
    }

}
