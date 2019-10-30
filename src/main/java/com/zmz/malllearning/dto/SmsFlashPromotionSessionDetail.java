package com.zmz.malllearning.dto;

import com.zmz.malllearning.mbg.model.SmsFlashPromotionSession;

/**
 * 包含商品数量的场次信息
 * Created by zmz on 2019/10/30.
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    private Long productCount;

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }
}
