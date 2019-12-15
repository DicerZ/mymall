package com.zmz.malllearning.dto;
import com.zmz.malllearning.mbg.model.OmsCompanyAddress;
import com.zmz.malllearning.mbg.model.OmsOrderReturnApply;

/**
 * 申请信息封装
 * Created by zmz on 2019/12/2.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    private OmsCompanyAddress companyAddress;

    public OmsCompanyAddress getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(OmsCompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }
}
