package top.zywork.vo;

/**
 * 用户登录状态VO，扩展ControllerStatusVO，增加相应的属性<br/>
 *
 * 创建于2018-01-19
 *
 * @author 王振宇
 * @version 1.0
 */
public class LoginStatusVO extends ControllerStatusVO {

    private static final long serialVersionUID = -7962132058765961457L;

    // 会话id
    private String sessionId;
    // 生成的token
    private String token;

    private Long id;
    private String headicon;
    private String level;
    private String nickname;
    private Long total;
    private Long score;


    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadicon() {
        return headicon;
    }

    public void setHeadicon(String headicon) {
        this.headicon = headicon;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
}
