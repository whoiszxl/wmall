package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-28 07:12:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

