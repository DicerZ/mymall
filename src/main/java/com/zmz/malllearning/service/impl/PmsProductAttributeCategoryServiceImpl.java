package com.zmz.malllearning.service.impl;


import com.github.pagehelper.PageHelper;
import com.zmz.malllearning.dao.PmsProductAttributeCategoryDao;
import com.zmz.malllearning.dto.PmsProductAttributeCategoryItem;
import com.zmz.malllearning.mbg.mapper.PmsProductAttributeCategoryMapper;
import com.zmz.malllearning.mbg.model.PmsProductAttributeCategory;
import com.zmz.malllearning.mbg.model.PmsProductAttributeCategoryExample;
import com.zmz.malllearning.service.PmsProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsProductAttributeCategoryService实现类
 * Created by zmz on 2019/10/24.
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;

    /**
     * 添加商品属性类别
     * @param name 属性类别名
     * @return
     */
    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    /**
     * 更新商品属性类别
     * @param id 属性类别id
     * @param name 属性类别名
     * @return
     */
    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);
    }

    /**
     * 删除商品属性类别
     * @param id 属性类别id
     * @return
     */
    @Override
    public int delete(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取商品属性类别信息
     * @param id 属性类别id
     * @return
     */
    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取商品属性类别列表
     * @param pageSize 页面长度
     * @param pageNum 页数
     * @return
     */
    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

    /**
     * 获取包含属性信息的商品属性类别列表
     * @return
     */
    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}
