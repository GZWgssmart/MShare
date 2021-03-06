package top.zywork.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * BasicSettingVO值对象类<br/>
 *
 * 创建于2018-05-18<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
public class BasicSettingVO extends BaseVO {

    private static final long serialVersionUID = -9223372036551537110L;

    /**
	 * 编号
	 */
	private Long id;
	/**
	 * 手续费比例
	 */
	@NotNull(message = "此项是必须项")
	private Double feePercent;
	/**
	 * 金额转换比例
	 */
	@NotNull(message = "此项是必须项")
	private Double moneyPercent;
	/**
	 * 积分转换比例
	 */
	@NotNull(message = "此项是必须项")
	private Double scorePercent;
	/**
	 * 轮播图1
	 */
	@Size(min = 0, max = 500, message = "必须小于500个字符")
	private String sliderImg1;
	/**
	 * 轮播图2
	 */
	@Size(min = 0, max = 500, message = "必须小于500个字符")
	private String sliderImg2;
	/**
	 * 轮播图3
	 */
	@Size(min = 0, max = 500, message = "必须小于500个字符")
	private String sliderImg3;
	/**
	 * 轮播图4
	 */
	@Size(min = 0, max = 500, message = "必须小于500个字符")
	private String sliderImg4;
	/**
	 * 轮播图5
	 */
	@Size(min = 0, max = 500, message = "必须小于500个字符")
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
	 * 更新时间
	 */
	private Date updateTime;
	
    public BasicSettingVO() {}

    public BasicSettingVO(Long id, Double feePercent, Double moneyPercent, Double scorePercent, String sliderImg1, String sliderImg2, String sliderImg3, String sliderImg4, String sliderImg5, Double regBonus, Date createTime, Date updateTime) {
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
				", sliderImg4 = " + sliderImg4 + 
				", sliderImg5 = " + sliderImg5 + 
				", regBonus = " + regBonus + 
				", createTime = " + createTime + 
				", updateTime = " + updateTime + 
				"}";
    }

}
