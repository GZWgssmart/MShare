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
import top.zywork.dto.PagerDTO;
import top.zywork.dto.BuyOrderDTO;
import top.zywork.exception.ServiceException;
import top.zywork.query.PageQuery;
import top.zywork.query.StatusQueries;
import top.zywork.query.StatusQuery;
import top.zywork.query.BuyOrderQuery;
import top.zywork.service.BuyOrderService;
import top.zywork.vo.ControllerStatusVO;
import top.zywork.vo.PagerVO;
import top.zywork.vo.BuyOrderVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * UserBuyOrderController控制器类<br/>
 *
 * 创建于2018-05-12<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Controller
@RequestMapping("/buy-order")
public class BuyOrderController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BuyOrderController.class);

    private BuyOrderService userBuyOrderService;

    @RequiresRoles(value = {"admin"})
    @GetMapping("page")
    public String page() {
        return "UserBuyOrder/UserBuyOrder";
    }

    @GetMapping("add-modal")
    public String addModal() {
        return "UserBuyOrder/UserBuyOrderAddModal";
    }

    @GetMapping("edit-modal")
    public String editModal() {
        return "UserBuyOrder/UserBuyOrderEditModal";
    }

    @GetMapping("detail-modal")
    public String detailModal() {
        return "UserBuyOrder/UserBuyOrderDetailModal";
    }

    @GetMapping("search-modal")
    public String searchModal() {
        return "UserBuyOrder/UserBuyOrderSearchModal";
    }

    @PostMapping("save")
    @ResponseBody
    public ControllerStatusVO save(@Validated BuyOrderVO userBuyOrderVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                userBuyOrderService.save(getBeanMapper().map(userBuyOrderVO, BuyOrderDTO.class));
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
    public ControllerStatusVO remove(BuyOrderVO userBuyOrderVO) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            userBuyOrderService.remove(getBeanMapper().map(userBuyOrderVO, BuyOrderDTO.class));
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
            userBuyOrderService.removeById(id);
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
            userBuyOrderService.removeByIds(StringUtils.strToLongArray(ids, ","));
            statusVO.okStatus(200, "批量删除成功");
        } catch (ServiceException e) {
            logger.error("批量删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "批量删除失败");
        }
        return statusVO;
    }

    @PostMapping("update")
    @ResponseBody
    public ControllerStatusVO update(@Validated BuyOrderVO userBuyOrderVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                userBuyOrderService.update(getBeanMapper().map(userBuyOrderVO, BuyOrderDTO.class));
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
            userBuyOrderService.updateActiveStatus(statusQuery);
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
            userBuyOrderService.updateActiveStatuses(statusQueries);
            statusVO.okStatus(200, statusQueries.getStatus() == 0 ? "批量激活成功" : "批量冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQueries.getStatus() == 0 ? "批量激活失败" : "批量冻结失败");
        }
        return statusVO;
    }

    @RequestMapping("one/{id}")
    @ResponseBody
    public BuyOrderVO getById(@PathVariable("id") Long id) {
        BuyOrderVO userBuyOrderVO = new BuyOrderVO();
        try {
            Object obj = userBuyOrderService.getById(id);
            if (obj != null) {
                userBuyOrderVO = getBeanMapper().map(obj, BuyOrderVO.class);
            }
        } catch (ServiceException e) {
            logger.error("返回单个对象JSON数据失败：{}", e.getMessage());
        }
        return userBuyOrderVO;
    }

    @GetMapping("all")
    @ResponseBody
    public List<BuyOrderVO> listAll() {
        List<BuyOrderVO> userBuyOrderVOList = new ArrayList<>();
        try {
            List<Object> objectList = userBuyOrderService.listAll();
            userBuyOrderVOList =  DozerMapperUtils.map(getBeanMapper(), objectList, BuyOrderVO.class);
        } catch (ServiceException e) {
            logger.error("返回所有对象JSON数据失败：{}", e.getMessage());
        }
        return userBuyOrderVOList;
    }

    @RequestMapping("pager")
    @ResponseBody
    public PagerVO listPage(int offset, int limit, String sort, String order) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = userBuyOrderService.listPage(pageQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), BuyOrderVO.class));
        } catch (ServiceException e) {
            logger.error("返回分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @RequestMapping("pager-cond")
    @ResponseBody
    public PagerVO listPageByCondition(int offset, int limit, String sort, String order, BuyOrderQuery userBuyOrderQuery) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = userBuyOrderService.listPageByCondition(pageQuery, userBuyOrderQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), BuyOrderVO.class));
        } catch (ServiceException e) {
            logger.error("返回指定条件的分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @Resource
    public void setUserBuyOrderService(BuyOrderService userBuyOrderService) {
        this.userBuyOrderService = userBuyOrderService;
    }
}
