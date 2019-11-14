package com.zmz.malllearning.service;

import com.zmz.malllearning.mbg.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 * Created by zmz on 2019/11/14.
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
