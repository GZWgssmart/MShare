package top.zywork.controller;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.zywork.common.BindingResultUtils;
import top.zywork.common.DozerMapperUtils;
import top.zywork.common.StringUtils;
import top.zywork.dto.PagerDTO;
import top.zywork.dto.UserTotalScoreDTO;
import top.zywork.exception.ServiceException;
import top.zywork.query.*;
import top.zywork.service.UserTotalScoreService;
import top.zywork.vo.ControllerStatusVO;
import top.zywork.vo.PagerVO;
import top.zywork.vo.UserTotalScoreVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * UserTotalScoreController控制器类<br/>
 *
 * 创建于2018-05-19<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Controller
@RequestMapping("/user-total-score")
public class UserTotalScoreController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserTotalScoreController.class);

    private UserTotalScoreService userTotalScoreService;

    @GetMapping("page")
    public String page() {
        return "UserTotalScore/UserTotalScore";
    }

    @GetMapping("add-modal")
    public String addModal() {
        return "UserTotalScore/UserTotalScoreAddModal";
    }

    @GetMapping("edit-modal")
    public String editModal() {
        return "UserTotalScore/UserTotalScoreEditModal";
    }

    @GetMapping("detail-modal")
    public String detailModal() {
        return "UserTotalScore/UserTotalScoreDetailModal";
    }

    @GetMapping("search-modal")
    public String searchModal() {
        return "UserTotalScore/UserTotalScoreSearchModal";
    }

    @PostMapping("save")
    @ResponseBody
    public ControllerStatusVO save(@Validated UserTotalScoreVO userTotalScoreVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                userTotalScoreService.save(getBeanMapper().map(userTotalScoreVO, UserTotalScoreDTO.class));
                statusVO.okStatus(200, "添加成功");
            } catch (ServiceException e) {
                logger.error("添加失败：{}", e.getMessage());
                statusVO.errorStatus(500, "添加失败");
            }
        }
        return statusVO;
    }

    @PostMapping("remove")
    @ResponseBody
    public ControllerStatusVO remove(UserTotalScoreVO userTotalScoreVO) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            userTotalScoreService.remove(getBeanMapper().map(userTotalScoreVO, UserTotalScoreDTO.class));
            statusVO.okStatus(200, "删除成功");
        } catch (ServiceException e) {
            logger.error("删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "删除失败");
        }
        return statusVO;
    }

    @GetMapping("remove/{id}")
    @ResponseBody
    public ControllerStatusVO removeById(@PathVariable("id") Long id) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            userTotalScoreService.removeById(id);
            statusVO.okStatus(200, "删除成功");
        } catch (ServiceException e) {
            logger.error("删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "删除失败");
        }
        return statusVO;
    }

    @PostMapping("batch-remove")
    @ResponseBody
    public ControllerStatusVO removeByIds(String ids) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            userTotalScoreService.removeByIds(StringUtils.strToLongArray(ids, ","));
            statusVO.okStatus(200, "批量删除成功");
        } catch (ServiceException e) {
            logger.error("批量删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "批量删除失败");
        }
        return statusVO;
    }

    @PostMapping("update")
    @ResponseBody
    public ControllerStatusVO update(@Validated UserTotalScoreVO userTotalScoreVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                userTotalScoreService.update(getBeanMapper().map(userTotalScoreVO, UserTotalScoreDTO.class));
                statusVO.okStatus(200, "更新成功");
            } catch (ServiceException e) {
                logger.error("更新失败：{}", e.getMessage());
                statusVO.errorStatus(500, "更新失败");
            }
        }
        return statusVO;
    }

    @PostMapping("active")
    @ResponseBody
    public ControllerStatusVO updateActiveStatus(StatusQuery statusQuery) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            userTotalScoreService.updateActiveStatus(statusQuery);
            statusVO.okStatus(200, statusQuery.getStatus() == 0 ? "激活成功" : "冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQuery.getStatus() == 0 ? "激活失败" : "冻结失败");
        }
        return statusVO;
    }

    @PostMapping("batch-active")
    @ResponseBody
    public ControllerStatusVO updateActiveStatuses(String ids, StatusQueries statusQueries) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        statusQueries.setIds(StringUtils.strToLongArray(ids, ","));
        try {
            userTotalScoreService.updateActiveStatuses(statusQueries);
            statusVO.okStatus(200, statusQueries.getStatus() == 0 ? "批量激活成功" : "批量冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQueries.getStatus() == 0 ? "批量激活失败" : "批量冻结失败");
        }
        return statusVO;
    }

    @RequestMapping("one/{id}")
    @ResponseBody
    public UserTotalScoreVO getById(@PathVariable("id") Long id) {
        UserTotalScoreVO userTotalScoreVO = new UserTotalScoreVO();
        try {
            Object obj = userTotalScoreService.getById(id);
            if (obj != null) {
                userTotalScoreVO = getBeanMapper().map(obj, UserTotalScoreVO.class);
            }
        } catch (ServiceException e) {
            logger.error("返回单个对象JSON数据失败：{}", e.getMessage());
        }
        return userTotalScoreVO;
    }

    @GetMapping("all")
    @ResponseBody
    public List<UserTotalScoreVO> listAll() {
        List<UserTotalScoreVO> userTotalScoreVOList = new ArrayList<>();
        try {
            List<Object> objectList = userTotalScoreService.listAll();
            userTotalScoreVOList =  DozerMapperUtils.map(getBeanMapper(), objectList, UserTotalScoreVO.class);
        } catch (ServiceException e) {
            logger.error("返回所有对象JSON数据失败：{}", e.getMessage());
        }
        return userTotalScoreVOList;
    }

    @RequestMapping("pager")
    @ResponseBody
    public PagerVO listPage(int offset, int limit, String sort, String order) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = userTotalScoreService.listPage(pageQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), UserTotalScoreVO.class));
        } catch (ServiceException e) {
            logger.error("返回分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @RequestMapping("pager-cond")
    @ResponseBody
    public PagerVO listPageByCondition(int offset, int limit, String sort, String order, UserTotalScoreQuery userTotalScoreQuery) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = userTotalScoreService.listPageByCondition(pageQuery, userTotalScoreQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), UserTotalScoreVO.class));
        } catch (ServiceException e) {
            logger.error("返回指定条件的分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @Resource
    public void setUserTotalScoreService(UserTotalScoreService userTotalScoreService) {
        this.userTotalScoreService = userTotalScoreService;
    }
}
