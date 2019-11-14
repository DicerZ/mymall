package com.zmz.malllearning.service.impl;

import com.zmz.malllearning.mbg.mapper.UmsMemberLevelMapper;
import com.zmz.malllearning.mbg.model.UmsMemberLevel;
import com.zmz.malllearning.mbg.model.UmsMemberLevelExample;
import com.zmz.malllearning.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员等级管理Service实现类
 * Created by zmz on 2019/11/14.
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;

    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
