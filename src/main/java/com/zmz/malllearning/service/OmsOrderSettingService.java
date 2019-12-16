package com.zmz.malllearning.service;

import com.zmz.malllearning.mbg.model.OmsOrderSetting;

/**
 * 订单设置Service
 * Created by zmz on 2019/12/16.
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
