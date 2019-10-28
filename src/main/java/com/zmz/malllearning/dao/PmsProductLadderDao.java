package com.zmz.malllearning.dao;

import com.zmz.malllearning.mbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义会员阶梯价格Dao
 * Created by zmz on 2019/10/27.
 */
public interface PmsProductLadderDao {
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
