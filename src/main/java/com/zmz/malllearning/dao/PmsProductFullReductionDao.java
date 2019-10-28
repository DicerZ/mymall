package com.zmz.malllearning.dao;


import com.zmz.malllearning.mbg.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品满减Dao
 * Created by zmz on 2019/10/27.
 */
public interface PmsProductFullReductionDao {
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
