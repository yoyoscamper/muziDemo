package com.learning.springboot.service.member.impl;

import com.learning.springboot.common.MZConstant;
import com.learning.springboot.mapper.MemberInfoMapper;
import com.learning.springboot.model.MemberInfo;
import com.learning.springboot.model.MemberInfoExample;
import com.learning.springboot.model.MemberInfoExample.Criteria;
import com.learning.springboot.service.member.IMemberInfoService;
import com.learning.springboot.util.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: 53097
 * @Date: 2018/10/18 16:57
 * @Description:
 */
@Service
@Transactional
public class MemberInfoServiceImpl implements IMemberInfoService{

    @Autowired
    private MemberInfoMapper mapper;

    @Override
    public int save(MemberInfo record) {

        if(record != null){
            record.setGuid(UUIDUtil.getUUID());
            record.setRecordState(MZConstant.Y);
            return mapper.insert(record);
        }
        return MZConstant.DATA_OPERATION_FAIL;
    }

    @Override
    public int deleteLogically(String primaryKey) {

        if(StringUtils.isNotBlank(primaryKey)) {
            MemberInfo record = new MemberInfo();
            record.setRecordState(MZConstant.N);
            record.setGuid(primaryKey);
            return save(record);
        }
        return MZConstant.DATA_OPERATION_FAIL;
    }

    @Override
    public int deletePhysically(String primaryKey) {
        return mapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public List<MemberInfo> queryList(MemberInfo memberInfo, String sort) {
        MemberInfoExample example = new MemberInfoExample();
        Criteria criteria = example.createCriteria().andRecordStateEqualTo(MZConstant.Y);

        if (StringUtils.isNotBlank(memberInfo.getName())) {
            criteria.andNameLike("%"+memberInfo.getName()+"%");
        }
        if (StringUtils.isNotBlank(memberInfo.getMobile())) {
            criteria.andMobileLike("%"+memberInfo.getMobile()+"%");
        }
        // 排序字段
        if (StringUtils.isNotBlank(sort)) {
            example.setOrderByClause(sort);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public MemberInfo queryById(String primaryKey) {
        if(StringUtils.isNotBlank(primaryKey)){
           return mapper.selectByPrimaryKey(primaryKey);
        }
        return  null;
    }
}
