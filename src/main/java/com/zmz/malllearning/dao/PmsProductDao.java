package com.zmz.malllearning.dao;


import com.zmz.malllearning.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * 商品自定义Dao
 * Created by zmz on 2019/10/27.
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
