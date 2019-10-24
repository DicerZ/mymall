package com.zmz.malllearning.service;

import com.zmz.malllearning.dto.PmsProductAttributeParam;
import com.zmz.malllearning.dto.ProductAttrInfo;
import com.zmz.malllearning.mbg.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品属性Service
 * Created by zmz on 2019/10/24.
 */
public interface PmsProductAttributeService {
    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->属性；2->参数
     * @param pageSize 页面长度
     * @param pageNum 页数
     * @return
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品属性
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品属性
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性信息
     */
    PmsProductAttribute getItem(Long id);

    /**
     * 删除单个或多个商品
     * @param ids 商品id列表
     * @return
     */
    @Transactional
    int delete(List<Long> ids);

    /**
     * 获取商品类别的属性信息
     * @param productCategoryId 类别id
     * @return
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
