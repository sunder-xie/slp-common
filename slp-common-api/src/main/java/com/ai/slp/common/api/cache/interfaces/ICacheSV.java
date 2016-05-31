package com.ai.slp.common.api.cache.interfaces;

import java.util.List;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.slp.common.api.cache.param.Area;
import com.ai.slp.common.api.cache.param.SysParam;

/**
 * 公共中心缓存读取服务<br>
 * Date: 2016年5月30日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author gucl
 */
public interface ICacheSV {

    /**
     * 获取字典参数列表
     * 
     * @param tenantId
     *            租户ID
     * @param typeCode
     *            字典类型
     * @param paramCode
     *            字典参数
     * @return 字段参数配置列表 List<SysParam>
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0200
     */
    public List<SysParam> getSysParams(String tenantId, String typeCode, String paramCode)
            throws BusinessException,SystemException;

    /**
     * 
     * 获取单条字典参数
     * 
     * @param tenantId
     *            租户ID
     * @param typeCode
     *            字典类型
     * @param paramCode
     *            字典参数
     * @param columnValue
     *          字典取值
     * @return 单个字典参数配置对象 SysParam
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0201
     */
    public SysParam getSysParam(String tenantId, String typeCode, String paramCode,
            String columnValue) throws BusinessException,SystemException;

    
    /**
     * 获取单条区域名称
     * @param tenantId
     * @param areaCode
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0203
     */
    public String getAreaName(String areaCode) throws BusinessException,SystemException;
    
    /**
     * 获取单条区域信息
     * @param tenantId
     * @param areaCode
     * @return
     * @throws BusinessException,SystemException
     * @author gucl
     * @ApiDocMethod
     * @ApiCode GN_0204
     */
    public Area getArea(String areaCode) throws BusinessException,SystemException;
    

}
