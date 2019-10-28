package com.zmz.malllearning.dao;

import com.zmz.malllearning.mbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 自定义会员价格Dao
 * Created by zmz on 2019/10/27.
 */
public interface PmsMemberPriceDao {
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
