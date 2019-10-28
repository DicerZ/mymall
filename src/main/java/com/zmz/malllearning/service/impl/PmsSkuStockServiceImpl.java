package com.zmz.malllearning.service.impl;

import com.zmz.malllearning.dao.PmsSkuStockDao;
import com.zmz.malllearning.mbg.mapper.PmsSkuStockMapper;
import com.zmz.malllearning.mbg.model.PmsSkuStock;
import com.zmz.malllearning.mbg.model.PmsSkuStockExample;
import com.zmz.malllearning.service.PmsSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品sku库存管理Service实现类
 * Created by zmz on 2019/10/27.
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsSkuStockDao skuStockDao;

    /**
     * 根据产品id和skuCode模糊搜索
     */
    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        PmsSkuStockExample example = new PmsSkuStockExample();
        PmsSkuStockExample.Criteria criteria = example.createCriteria().andProductIdEqualTo(pid);
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSkuCodeLike("%" + keyword + "%");
        }
        return skuStockMapper.selectByExample(example);
    }

    /**
     * 批量更新商品库存信息
     */
    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return skuStockDao.replaceList(skuStockList);
    }
}
