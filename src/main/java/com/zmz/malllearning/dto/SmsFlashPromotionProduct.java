package com.zmz.malllearning.dto;

import com.zmz.malllearning.mbg.model.PmsProduct;
import com.zmz.malllearning.mbg.model.SmsFlashPromotionProductRelation;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * 限时购及商品信息封装
 * Created by zmz on 2019/10/30.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    private PmsProduct product;

    public PmsProduct getProduct() {
        return product;
    }

    public void setProduct(PmsProduct product) {
        this.product = product;
    }


}
