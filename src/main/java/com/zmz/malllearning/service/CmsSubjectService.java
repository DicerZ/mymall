package com.zmz.malllearning.service;

import com.zmz.malllearning.mbg.model.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 * Created by zmz on 2019/11/27.
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
