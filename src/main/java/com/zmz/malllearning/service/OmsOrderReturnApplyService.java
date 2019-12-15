package com.zmz.malllearning.service;

import com.zmz.malllearning.dto.OmsOrderReturnApplyResult;
import com.zmz.malllearning.dto.OmsReturnApplyQueryParam;
import com.zmz.malllearning.dto.OmsUpdateStatusParam;
import com.zmz.malllearning.mbg.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 * Created by zmz on 2019/12/2.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
