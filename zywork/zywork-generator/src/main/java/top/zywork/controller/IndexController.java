package top.zywork.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 显示首页和主页的控制器<br/>
 *
 * 创建于2018-03-22<br/>
 *
 * @author 王振宇
 * @version 1.0
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    @GetMapping("backend/login")
    public String login() {
        return "backend/login";
    }

    @RequiresRoles(value = {"admin"})
    @GetMapping("backend/index")
    public String index() {
        return "backend/index";
    }

    @RequiresRoles(value = {"admin"})
    @GetMapping("backend/home")
    public String home() {
        return "backend/home";
    }

    @GetMapping("reg/{fromId}")
    public ModelAndView register(@PathVariable("fromId") String fromId) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("fromId", fromId);
        return mav;
    }

    @GetMapping("download")
    public String download() {
        return "download";
    }

}
