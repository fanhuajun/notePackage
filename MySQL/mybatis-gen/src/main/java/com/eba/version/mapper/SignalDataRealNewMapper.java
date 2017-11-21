/*
 * @(#) SignalDataRealNewMapper.java 2017年10月18日
 *
 * Copyright (c), 2016 深圳市万睿智能科技有限公司（Shenzhen Wan Rui Intelligent Technology Co., Ltd.），
 * 
 * 著作权人保留一切权利，任何使用需经授权。
*/
package com.eba.version.mapper;

import com.eba.version.model.SignalDataRealNew;

public interface SignalDataRealNewMapper {
    int deleteByPrimaryKey(Long dataId);

    int insert(SignalDataRealNew record);

    int insertSelective(SignalDataRealNew record);

    SignalDataRealNew selectByPrimaryKey(Long dataId);

    int updateByPrimaryKeySelective(SignalDataRealNew record);

    int updateByPrimaryKey(SignalDataRealNew record);
}