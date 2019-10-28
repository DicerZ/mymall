package com.zmz.malllearning.dto;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * 查询单个产品进行修改时返回的结果
 * Created by zmz on 2019/10/27.
 */
public class PmsProductResult extends PmsProductParam {
    //商品所选分类的父id
    private Long cateParentId;

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
