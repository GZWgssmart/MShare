package top.zywork.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.authz.annotation.RequiresUser;
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
import top.zywork.dto.BankCardDTO;
import top.zywork.dto.PagerDTO;
import top.zywork.exception.ServiceException;
import top.zywork.query.BankCardQuery;
import top.zywork.query.PageQuery;
import top.zywork.query.StatusQueries;
import top.zywork.query.StatusQuery;
import top.zywork.service.BankCardService;
import top.zywork.vo.BankCardVO;
import top.zywork.vo.ControllerStatusVO;
import top.zywork.vo.PagerVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * BankCardController控制器类<br/>
 *
 * 创建于2018-05-07<br/>
 *
 * @author http://zywork.top 王振宇
 * @version 1.0
 */
@Controller
@RequestMapping("/bank-card")
public class BankCardController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BankCardController.class);

    private BankCardService bankCardService;

    @RequiresRoles(value = {"admin"})
    @GetMapping("page")
    public String page() {
        return "BankCard/BankCard";
    }

    @GetMapping("add-modal")
    public String addModal() {
        return "BankCard/BankCardAddModal";
    }

    @GetMapping("edit-modal")
    public String editModal() {
        return "BankCard/BankCardEditModal";
    }

    @GetMapping("detail-modal")
    public String detailModal() {
        return "BankCard/BankCardDetailModal";
    }

    @GetMapping("search-modal")
    public String searchModal() {
        return "BankCard/BankCardSearchModal";
    }

    @RequiresUser
    @PostMapping("save")
    @ResponseBody
    public ControllerStatusVO save(@Validated BankCardVO bankCardVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                bankCardService.save(getBeanMapper().map(bankCardVO, BankCardDTO.class));
                statusVO.okStatus(200, "添加成功");
            } catch (ServiceException e) {
                logger.error("添加失败：{}", e.getMessage());
                statusVO.errorStatus(500, "添加失败");
            }
        }
        return statusVO;
    }

    @RequiresUser
    @PostMapping("remove")
    @ResponseBody
    public ControllerStatusVO remove(BankCardVO bankCardVO) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            bankCardService.remove(getBeanMapper().map(bankCardVO, BankCardDTO.class));
            statusVO.okStatus(200, "删除成功");
        } catch (ServiceException e) {
            logger.error("删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "删除失败");
        }
        return statusVO;
    }

    @RequiresUser
    @GetMapping("remove/{id}")
    @ResponseBody
    public ControllerStatusVO removeById(@PathVariable("id") Long id) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        try {
            bankCardService.removeById(id);
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
            bankCardService.removeByIds(StringUtils.strToLongArray(ids, ","));
            statusVO.okStatus(200, "批量删除成功");
        } catch (ServiceException e) {
            logger.error("批量删除失败：{}", e.getMessage());
            statusVO.errorStatus(500, "批量删除失败");
        }
        return statusVO;
    }

    @RequiresUser
    @PostMapping("update")
    @ResponseBody
    public ControllerStatusVO update(@Validated BankCardVO bankCardVO, BindingResult bindingResult) {
        ControllerStatusVO statusVO = new ControllerStatusVO();
        if (bindingResult.hasErrors()) {
            statusVO.dataErrorStatus(500, BindingResultUtils.errorString(bindingResult));
        } else {
            try {
                bankCardService.update(getBeanMapper().map(bankCardVO, BankCardDTO.class));
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
            bankCardService.updateActiveStatus(statusQuery);
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
            bankCardService.updateActiveStatuses(statusQueries);
            statusVO.okStatus(200, statusQueries.getStatus() == 0 ? "批量激活成功" : "批量冻结成功");
        } catch (ServiceException e) {
            logger.error("激活或冻结失败：{}", e.getMessage());
            statusVO.errorStatus(500, statusQueries.getStatus() == 0 ? "批量激活失败" : "批量冻结失败");
        }
        return statusVO;
    }

    @RequestMapping("one/{id}")
    @ResponseBody
    public BankCardVO getById(@PathVariable("id") Long id) {
        BankCardVO bankCardVO = new BankCardVO();
        try {
            Object obj = bankCardService.getById(id);
            if (obj != null) {
                bankCardVO = getBeanMapper().map(obj, BankCardVO.class);
            }
        } catch (ServiceException e) {
            logger.error("返回单个对象JSON数据失败：{}", e.getMessage());
        }
        return bankCardVO;
    }

    @RequiresUser
    @GetMapping("all")
    @ResponseBody
    public List<BankCardVO> listAll() {
        List<BankCardVO> bankCardVOList = new ArrayList<>();
        try {
            List<Object> objectList = bankCardService.listAll();
            bankCardVOList =  DozerMapperUtils.map(getBeanMapper(), objectList, BankCardVO.class);
        } catch (ServiceException e) {
            logger.error("返回所有对象JSON数据失败：{}", e.getMessage());
        }
        return bankCardVOList;
    }

    @RequiresUser
    @RequestMapping("pager")
    @ResponseBody
    public PagerVO listPage(int offset, int limit, String sort, String order) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = bankCardService.listPage(pageQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), BankCardVO.class));
        } catch (ServiceException e) {
            logger.error("返回分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @RequiresUser
    @RequestMapping("pager-cond")
    @ResponseBody
    public PagerVO listPageByCondition(int offset, int limit, String sort, String order, BankCardQuery bankCardQuery) {
        PagerVO pagerVO = new PagerVO();
        PageQuery pageQuery = new PageQuery(offset / limit + 1, limit, sort, order);
        try {
            PagerDTO pagerDTO = bankCardService.listPageByCondition(pageQuery, bankCardQuery);
            Mapper mapper = getBeanMapper();
            pagerVO = mapper.map(pagerDTO, PagerVO.class);
            pagerVO.setRows(DozerMapperUtils.mapList(mapper, pagerDTO.getRows(), BankCardVO.class));
        } catch (ServiceException e) {
            logger.error("返回指定条件的分页对象JSON数据失败：{}", e.getMessage());
        }
        return pagerVO;
    }

    @Resource
    public void setBankCardService(BankCardService bankCardService) {
        this.bankCardService = bankCardService;
    }
}
