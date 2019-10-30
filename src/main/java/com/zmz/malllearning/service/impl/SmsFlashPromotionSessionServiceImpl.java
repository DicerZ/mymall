package com.zmz.malllearning.service.impl;

import com.zmz.malllearning.dto.SmsFlashPromotionSessionDetail;
import com.zmz.malllearning.mbg.mapper.SmsFlashPromotionSessionMapper;
import com.zmz.malllearning.mbg.model.SmsFlashPromotionSession;
import com.zmz.malllearning.mbg.model.SmsFlashPromotionSessionExample;
import com.zmz.malllearning.service.SmsFlashPromotionProductRelationService;
import com.zmz.malllearning.service.SmsFlashPromotionSessionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 限时购场次管理Service实现类
 * Created by zmz on 2019/10/30.
 */
@Service
public class SmsFlashPromotionSessionServiceImpl implements SmsFlashPromotionSessionService {
    @Autowired
    private SmsFlashPromotionSessionMapper promotionSessionMapper;
    @Autowired
    private SmsFlashPromotionProductRelationService relationService;

    /**
     * 添加场次
     */
    @Override
    public int create(SmsFlashPromotionSession promotionSession) {
        promotionSession.setCreateTime(new Date());
        return promotionSessionMapper.insert(promotionSession);
    }

    /**
     * 修改场次
     */
    @Override
    public int update(Long id, SmsFlashPromotionSession promotionSession) {
        promotionSession.setId(id);
        return promotionSessionMapper.updateByPrimaryKey(promotionSession);
    }

    /**
     * 修改场次启用状态
     */
    @Override
    public int updateStatus(Long id, Integer status) {
        SmsFlashPromotionSession promotionSession = new SmsFlashPromotionSession();
        promotionSession.setId(id);
        promotionSession.setStatus(status);
        return promotionSessionMapper.updateByPrimaryKeySelective(promotionSession);
    }

    /**
     * 删除场次
     */
    @Override
    public int delete(Long id) {
        return promotionSessionMapper.deleteByPrimaryKey(id);
    }

    /**
     * 获取详情
     */
    @Override
    public SmsFlashPromotionSession getItem(Long id) {
        return promotionSessionMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据启用状态获取场次列表
     */
    @Override
    public List<SmsFlashPromotionSession> list() {
        SmsFlashPromotionSessionExample example = new SmsFlashPromotionSessionExample();
        return promotionSessionMapper.selectByExample(example);
    }

    /**
     * 获取全部可选场次及其数量
     */
    @Override
    public List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId) {
        List<SmsFlashPromotionSessionDetail> result = new ArrayList<>();
        SmsFlashPromotionSessionExample example = new SmsFlashPromotionSessionExample();
        example.createCriteria().andStatusEqualTo(1);
        List<SmsFlashPromotionSession> list = promotionSessionMapper.selectByExample(example);
        for (SmsFlashPromotionSession promotionSession : list) {
            SmsFlashPromotionSessionDetail detail = new SmsFlashPromotionSessionDetail();
            BeanUtils.copyProperties(promotionSession, detail);
            long count = relationService.getCount(flashPromotionId, promotionSession.getId());
            detail.setProductCount(count);
            result.add(detail);
        }
        return result;
    }

}
