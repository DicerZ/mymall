package com.zmz.malllearning.service.impl;

import com.github.pagehelper.PageHelper;
import com.zmz.malllearning.dao.SmsFlashPromotionProductRelationDao;
import com.zmz.malllearning.dto.SmsFlashPromotionProduct;
import com.zmz.malllearning.mbg.mapper.SmsFlashPromotionProductRelationMapper;
import com.zmz.malllearning.mbg.model.SmsFlashPromotionProductRelation;
import com.zmz.malllearning.mbg.model.SmsFlashPromotionProductRelationExample;
import com.zmz.malllearning.service.SmsFlashPromotionProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 限时购商品关联管理Service实现类
 * Created by macro on 2018/11/16.
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {
    @Autowired
    private SmsFlashPromotionProductRelationMapper relationMapper;
    @Autowired
    private SmsFlashPromotionProductRelationDao relationDao;

    /**
     * 批量添加关联
     */
    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) {
        for (SmsFlashPromotionProductRelation relation : relationList) {
            relationMapper.insert(relation);
        }
        return relationList.size();
    }

    /**
     * 修改关联相关信息
     */
    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) {
        relation.setId(id);
        return relationMapper.updateByPrimaryKey(relation);
    }

    /**
     * 删除关联
     */
    @Override
    public int delete(Long id) {
        return relationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取关联详情
     */
    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) {
        return relationMapper.selectByPrimaryKey(id);
    }

    /**
     * 分页查询相关商品及促销信息
     *
     * @param flashPromotionId        限时购id
     * @param flashPromotionSessionId 限时购场次id
     */
    @Override
    public List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return relationDao.getList(flashPromotionId,flashPromotionSessionId);
    }

    /**
     * 根据活动和场次id获取商品关系数量
     * @param flashPromotionId
     * @param flashPromotionSessionId
     * @return
     */
    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        SmsFlashPromotionProductRelationExample example = new SmsFlashPromotionProductRelationExample();
        example.createCriteria()
                .andFlashPromotionIdEqualTo(flashPromotionId)
                .andFlashPromotionSessionIdEqualTo(flashPromotionSessionId);
        return relationMapper.countByExample(example);
    }

}
