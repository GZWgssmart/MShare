package top.zywork.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
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
import top.zywork.dto.LevelSettingDTO;
import top.zywork.dto.PagerDTO;
import top.zywork.exception.ServiceException;
import top.zywork.query.LevelSettingQuery;
import top.zywork.query.PageQuery;
import top.zywork.query.StatusQueries;
import top.zywork.query.StatusQuery;
import top.zywork.service.LevelSettingService;
import top.zywork.vo.ControllerStatusVO;
import top.zywork.vo.LevelSettingVO;
import top.zywork.vo.PagerVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * LevelSettingController控制器类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Controller
@RequestMapping("/level-setting")
public class LevelSettingController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LevelSettingController.class);

    private LevelSettingService levelSettingService;

    @RequiresRoles(value = {"admin"})
    @GetMapping("page")
    public String page() {
        return "LevelSetting/LevelSetting";
    }

    @GetMapping("add-modal")
    public String addModal() {
        return "LevelSetting/LevelSettingAddModal";
    }

    @GetMapping("edit-modal")
    public String editModal() {
        return "LevelSetting/LevelSettingEditModal";
    }

    @GetMapping("detail-modal")
    public String detailModal() {
        return "LevelSetting/LevelSettingDetailModal";
    }

    @GetMapping("search-modal")
    public String searchModal() {
        return "LevelSetting/LevelSettingSearchModal";
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("save")
    @ResponseBody
    public ControllerStatusVO save(@Validated LevelSettingVO levelSettingVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                levelSettingService.save(getBeanMapper().map(levelSettingVO, LevelSettingDTO.class));
                statusVO.okStatus(200, "添加成功");
            } catch (ServiceException e) {
                logger.error("添加失败：{}", e.getMessage());
                statusVO.errorStatus(500, "添加失败");
            }
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("remove")
    @ResponseBody
    public ControllerStatusVO remove(LevelSettingVO levelSettingVO) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            levelSettingService.remove(getBeanMapper().map(levelSettingVO, LevelSettingDTO.class));
            statusVO.okStatus(200, "删除成功");
        } catch (ServiceException e) {
            logger.error("删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "删除失败");
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @GetMapping("remove/{id}")
    @ResponseBody
    public ControllerStatusVO removeById(@PathVariable("id") Long id) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            levelSettingService.removeById(id);
            statusVO.okStatus(200, "删除成功");
        } catch (ServiceException e) {
            logger.error("删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "删除失败");
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("batch-remove")
    @ResponseBody
    public ControllerStatusVO removeByIds(String ids) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            levelSettingService.removeByIds(StringUtils.strToLongArray(ids, ","));
            statusVO.okStatus(200, "批量删除成功");
        } catch (ServiceException e) {
            logger.error("批量删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "批量删除失败");
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("update")
    @ResponseBody
    public ControllerStatusVO update(@Validated LevelSettingVO levelSettingVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                levelSettingService.update(getBeanMapper().map(levelSettingVO, LevelSettingDTO.class));
                statusVO.okStatus(200, "更新成功");
            } catch (ServiceException e) {
                logger.error("更新失败：{}", e.getMessage());
                statusVO.errorStatus(500, "更新失败");
            }
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("active")
    @ResponseBody
    public ControllerStatusVO updateActiveStatus(StatusQuery statusQuery) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            levelSettingService.updateActiveStatus(statusQuery);
            statusVO.okStatus(200, statusQuery.getStatus() == 0 ? "激活成功" : "冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQuery.getStatus() == 0 ? "激活失败" : "冻结失败");
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @PostMapping("batch-active")
    @ResponseBody
    public ControllerStatusVO updateActiveStatuses(String ids, StatusQueries statusQueries) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        statusQueries.setIds(StringUtils.strToLongArray(ids, ","));
        try {
            levelSettingService.updateActiveStatuses(statusQueries);
            statusVO.okStatus(200, statusQueries.getStatus() == 0 ? "批量激活成功" : "批量冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQueries.getStatus() == 0 ? "批量激活失败" : "批量冻结失败");
        }
        return statusVO;
    }

    @RequiresRoles(value = {"admin"})
    @RequestMapping("one/{id}")
    @ResponseBody
    public LevelSettingVO getById(@PathVariable("id") Long id) {
        LevelSettingVO levelSettingVO = new LevelSettingVO();
        try {
            Object obj = levelSettingService.getById(id);
            if (obj != null) {
                levelSettingVO = getBeanMapper().map(obj, LevelSettingVO.class);
            }
        } catch (ServiceException e) {
            logger.error("返回单个对象JSON数据失败：{}", e.getMessage());
        }
        return levelSettingVO;
    }

    @RequiresRoles(value = {"admin"})
    @GetMapping("all")
    @ResponseBody
    public List<LevelSettingVO> listAll() {
        List<LevelSettingVO> levelSettingVOList = new ArrayList<>();
        try {
            List<Object> objectList = levelSettingService.listAll();
            levelSettingVOList =  DozerMapperUtils.map(getBeanMapper(), objectList, LevelSettingVO.class);
        } catch (ServiceException e) {
            logger.error("返回所有对象JSON数据失败：{}", e.getMessage());
        }
        return levelSettingVOList;
    }

    @RequiresRoles(value = {"admin"})
    @RequestMapping("pager")
    @ResponseBody
    public PagerVO listPage(int offset, int limit, String sort, String order) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = levelSettingService.listPage(pageQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), LevelSettingVO.class));
        } catch (ServiceException e) {
            logger.error("返回分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @RequiresRoles(value = {"admin"})
    @RequestMapping("pager-cond")
    @ResponseBody
    public PagerVO listPageByCondition(int offset, int limit, String sort, String order, LevelSettingQuery levelSettingQuery) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = levelSettingService.listPageByCondition(pageQuery, levelSettingQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), LevelSettingVO.class));
        } catch (ServiceException e) {
            logger.error("返回指定条件的分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @Resource
    public void setLevelSettingService(LevelSettingService levelSettingService) {
        this.levelSettingService = levelSettingService;
    }
}
