package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-27 23:10:00
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

