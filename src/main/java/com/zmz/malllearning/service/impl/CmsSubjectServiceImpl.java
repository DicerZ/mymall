package com.zmz.malllearning.service.impl;
import com.github.pagehelper.PageHelper;
import com.zmz.malllearning.mbg.mapper.CmsSubjectMapper;
import com.zmz.malllearning.mbg.model.CmsSubject;
import com.zmz.malllearning.mbg.model.CmsSubjectExample;
import com.zmz.malllearning.service.CmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 商品专题Service实现类
 * Created by zmz on 2019/11/27.
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    /**
     * 查询所有专题
     */
    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    /**
     * 分页查询专题
     */
    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
