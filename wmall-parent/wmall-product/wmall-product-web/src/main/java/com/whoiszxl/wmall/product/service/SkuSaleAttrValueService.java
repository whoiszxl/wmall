package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-27 23:10:00
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

