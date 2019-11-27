package com.zmz.malllearning.service.impl;

import com.zmz.malllearning.mbg.mapper.CmsPrefrenceAreaMapper;
import com.zmz.malllearning.mbg.model.CmsPrefrenceArea;
import com.zmz.malllearning.mbg.model.CmsPrefrenceAreaExample;
import com.zmz.malllearning.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 * Created by zmz on 2019/11/27.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
