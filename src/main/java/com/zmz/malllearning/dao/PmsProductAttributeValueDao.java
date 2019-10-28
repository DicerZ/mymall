package com.zmz.malllearning.dao;


import com.zmz.malllearning.mbg.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品参数，商品自定义规格属性Dao
 * Created by zmz on 2019/10/27.
 */
public interface PmsProductAttributeValueDao {
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
