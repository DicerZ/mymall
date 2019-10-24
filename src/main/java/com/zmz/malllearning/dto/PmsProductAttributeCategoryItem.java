package com.zmz.malllearning.dto;

import com.zmz.malllearning.mbg.model.PmsProductAttribute;
import com.zmz.malllearning.mbg.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * Created by zmz on 2019/10/24.
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
