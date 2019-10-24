package com.zmz.malllearning.dao;
import com.zmz.malllearning.dto.PmsProductAttributeCategoryItem;
import java.util.List;

/**
 * 自定义商品属性分类Dao
 * Created by zmz on 2019/10/24.
 */
public interface PmsProductAttributeCategoryDao {
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
