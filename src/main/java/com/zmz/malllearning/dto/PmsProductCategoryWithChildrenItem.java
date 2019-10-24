package com.zmz.malllearning.dto;
import com.zmz.malllearning.mbg.model.PmsProductCategory;

import java.util.List;

/**
 * Created by zmz on 2019/10/24.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
