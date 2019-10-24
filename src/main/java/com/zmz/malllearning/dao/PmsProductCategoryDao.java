package com.zmz.malllearning.dao;
import com.zmz.malllearning.dto.PmsProductCategoryWithChildrenItem;
import java.util.List;

/**
 * 商品类别自定义Dao
 * Created by zmz on 2019/10/24.
 */
public interface PmsProductCategoryDao {
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
