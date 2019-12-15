package com.zmz.malllearning.dao;

import com.zmz.malllearning.dto.OmsOrderReturnApplyResult;
import com.zmz.malllearning.dto.OmsReturnApplyQueryParam;
import com.zmz.malllearning.mbg.model.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单退货申请自定义Dao
 * Created by zmz on 2019/12/2.
 */
public interface OmsOrderReturnApplyDao {
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}
