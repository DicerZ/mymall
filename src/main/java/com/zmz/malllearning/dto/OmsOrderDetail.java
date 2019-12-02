package com.zmz.malllearning.dto;
import com.zmz.malllearning.mbg.model.OmsOrder;
import com.zmz.malllearning.mbg.model.OmsOrderItem;
import com.zmz.malllearning.mbg.model.OmsOrderOperateHistory;

import java.util.List;

/**
 * 订单详情信息
 * Created by zmz on 2019/11/28.
 */
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;
    private List<OmsOrderOperateHistory> historyList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OmsOrderOperateHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<OmsOrderOperateHistory> historyList) {
        this.historyList = historyList;
    }
}
