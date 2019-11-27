package com.zmz.malllearning.service;

import com.zmz.malllearning.mbg.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * Created by zmz on 2019/11/27.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
