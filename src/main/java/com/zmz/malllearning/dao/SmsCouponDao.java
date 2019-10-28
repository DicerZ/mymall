package com.zmz.malllearning.dao;

import com.zmz.malllearning.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 优惠券管理自定义查询Dao
 * Created by zmz on 2019/10/28.
 */
public interface SmsCouponDao {
    SmsCouponParam getItem(@Param("id") Long id);
}
