package com.zmz.malllearning.service;

import com.zmz.malllearning.dto.PmsProductCategoryParam;
import com.zmz.malllearning.dto.PmsProductCategoryWithChildrenItem;
import com.zmz.malllearning.mbg.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品分类Service
 * Created by zmz on 2019/10/24.
 */
public interface PmsProductCategoryService {

    /**
     * 添加商品类别
     * @param pmsProductCategoryParam
     * @return
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 更新商品类别
     * @param id 类别id
     * @param pmsProductCategoryParam
     * @return
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 分页查询商品分类
     * @param parentId 所属上级类别id
     * @param pageSize 页面长度
     * @param pageNum 页数
     * @return
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 删除商品类别
     * @param id 类别id
     * @return
     */
    int delete(Long id);

    /**
     * 获取单个类别信息
     * @param id 类别id
     * @return
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改导航栏中类别显示状态
     * @param ids 类别id列表
     * @param navStatus 状态
     * @return
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改类别显示状态
     * @param ids 类别id列表
     * @param showStatus 状态
     * @return
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 查询所有一级分类及子分类
     * @return
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
