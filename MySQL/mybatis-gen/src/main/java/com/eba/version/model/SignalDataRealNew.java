/*
 * @(#) SignalDataRealNew.java 2017年10月18日
 *
 * Copyright (c), 2016 深圳市万睿智能科技有限公司（Shenzhen Wan Rui Intelligent Technology Co., Ltd.），
 * 
 * 著作权人保留一切权利，任何使用需经授权。
*/
package com.eba.version.model;

import java.util.Date;

public class SignalDataRealNew {
    //
    private Long dataId;

    //信号信息逻辑ID
    private Long signalInfoId;

    //供应商信号ID（上报的信号ID）
    private String thirdSignalId;

    //真实值
    private String signalValue;

    //原始值
    private String originValue;

    //采集时间
    private Date acquisitionTime;

    //信号点实时数据参数名称
    private String name;

    //
    private Integer status;

    //入库时间
    private Date fireSynchTime;

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Long getSignalInfoId() {
        return signalInfoId;
    }

    public void setSignalInfoId(Long signalInfoId) {
        this.signalInfoId = signalInfoId;
    }

    public String getThirdSignalId() {
        return thirdSignalId;
    }

    public void setThirdSignalId(String thirdSignalId) {
        this.thirdSignalId = thirdSignalId == null ? null : thirdSignalId.trim();
    }

    public String getSignalValue() {
        return signalValue;
    }

    public void setSignalValue(String signalValue) {
        this.signalValue = signalValue == null ? null : signalValue.trim();
    }

    public String getOriginValue() {
        return originValue;
    }

    public void setOriginValue(String originValue) {
        this.originValue = originValue == null ? null : originValue.trim();
    }

    public Date getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(Date acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getFireSynchTime() {
        return fireSynchTime;
    }

    public void setFireSynchTime(Date fireSynchTime) {
        this.fireSynchTime = fireSynchTime;
    }
}