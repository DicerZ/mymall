package com.zmz.malllearning.service;

import com.zmz.malllearning.dto.PmsProductAttributeCategoryItem;
import com.zmz.malllearning.mbg.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品属性分类Service
 * Created by zmz on 2019/10/24.
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 添加商品属性类别
     * @param name 属性类别名
     * @return
     */
    int create(String name);

    /**
     * 更新商品属性类别
     * @param id 属性类别id
     * @param name 属性类别名
     * @return
     */
    int update(Long id, String name);

    /**
     * 删除商品属性类别
     * @param id 属性类别id
     * @return
     */
    int delete(Long id);

    /**
     * 获取商品属性类别信息
     * @param id 属性类别id
     * @return
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 获取商品属性类别列表
     * @param pageSize 页面长度
     * @param pageNum 页数
     * @return
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 获取包含属性信息的商品属性类别列表
     * @return
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
