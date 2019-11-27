package com.zmz.malllearning.service.impl;

import com.zmz.malllearning.mbg.mapper.OmsCompanyAddressMapper;
import com.zmz.malllearning.mbg.model.OmsCompanyAddress;
import com.zmz.malllearning.mbg.model.OmsCompanyAddressExample;
import com.zmz.malllearning.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * Created by zmz on 2019/11/27.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    /**
     * 获取全部收货地址
     */
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
