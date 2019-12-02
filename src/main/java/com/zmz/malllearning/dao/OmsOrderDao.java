package com.zmz.malllearning.dao;

import com.zmz.malllearning.dto.OmsOrderDeliveryParam;
import com.zmz.malllearning.dto.OmsOrderDetail;
import com.zmz.malllearning.dto.OmsOrderQueryParam;
import com.zmz.malllearning.mbg.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单自定义查询Dao
 * Created by zmz on 2019/11/27.
 */
public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
