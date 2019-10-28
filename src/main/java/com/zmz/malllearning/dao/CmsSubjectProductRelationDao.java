package com.zmz.malllearning.dao;

import com.zmz.malllearning.mbg.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作
 * Created by zmz on 2019/10/27.
 */
public interface CmsSubjectProductRelationDao {
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
