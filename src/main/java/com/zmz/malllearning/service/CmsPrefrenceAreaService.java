package com.zmz.malllearning.service;

import com.zmz.malllearning.mbg.model.CmsPrefrenceArea;

import java.util.List;

/**
 * 优选专区Service
 * Created by zmz on 2019/11/27.
 */
public interface CmsPrefrenceAreaService {
    /**
     * 查询所有优选主题
     */
    List<CmsPrefrenceArea> listAll();
}
